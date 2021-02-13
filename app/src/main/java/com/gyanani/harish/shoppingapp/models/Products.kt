package com.gyanani.harish.shoppingapp.models

import Primary_categories

/*
Copyright (c) 2021 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class Products (

	val rating : Double,
	val is_kit_combo : String,
	val object_type : String,
	val is_saleable : Boolean,
	val explore_more : String,
	val pack_size : String,
	val category_ids : String,
	val id : Int,
	val sku : Long,
	val rating_count : Int,
	val from_gludo : Int,
	val fbn : Int,
	val gludo_stock : Boolean,
	val offers : String,
	val mrp_freeze : String,
	val primary_categories : Primary_categories,
	val type : String,
	val final_price : Int,
	val expdt : String,
	val price : Int,
	val button_text : String,
	val brand_name : String,
	val discount : Int,
	val show_wishlist_button : Int,
	val slug : String,
	val is_lux : Int,
	val name : String,
	val pro_flag : Int,
	val dynamic_tags : List<String>,
	val brand_ids : Int,
	val is_backorder : Int,
	val image_url : String,
	val catalog_tag : List<String>,
	val quantity : Int
)