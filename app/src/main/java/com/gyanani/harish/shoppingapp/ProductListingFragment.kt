package com.gyanani.harish.shoppingapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gyanani.harish.shoppingapp.models.Products
import com.gyanani.harish.shoppingapp.models.ProductsApiResponse
import retrofit2.Call
import retrofit2.Callback


class ProductListingFragment : Fragment() {
    var pageNo = 1
    var recyclerView: RecyclerView? = null
    val products = ArrayList<Products>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_listing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let{ myActivity->
            recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
            recyclerView?.layoutManager = GridLayoutManager(activity, 2)
            recyclerView?.adapter = ProductListAdapter(myActivity, products)
            recyclerView?.addOnScrollListener(object : RecyclerView.OnScrollListener() {
                override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                    super.onScrollStateChanged(recyclerView, newState)
                    if (!recyclerView.canScrollVertically(1)) {
                       pageNo++
                        hitApi()
                    }
                }
            })
            hitApi()
        }


    }

    private fun hitApi() {
        val request = ServiceBuilder.buildService(ApiInterface::class.java)
        val call = request.getProducts(pageNo)

        call.enqueue(object : Callback<ProductsApiResponse> {
            override fun onResponse(
                call: Call<ProductsApiResponse>,
                response: retrofit2.Response<ProductsApiResponse>
            ) {
                if (response.isSuccessful) {
                    Log.d("api", "success")
                    response.body()?.response?.products?.let {
                        products.addAll(it)
                        recyclerView?.adapter?.notifyDataSetChanged()
                    }

                }
            }

            override fun onFailure(call: Call<ProductsApiResponse>, t: Throwable) {
                Log.d("api", "failure")
            }
        })
    }

}