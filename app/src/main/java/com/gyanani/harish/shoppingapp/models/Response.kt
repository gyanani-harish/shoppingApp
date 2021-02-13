package com.gyanani.harish.shoppingapp.models

import Filter_keys
import Filters
import Other_filters

/*
Copyright (c) 2021 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class Response (

	val product_count : Int,
	val total_found : Int,
	val offset : Int,
	val products : List<Products>,
	val font_color : String,
	val banner_video : String,
	val filter_filter_keyss : Filter_keys,
	val banner_video_image : String,
	val android_landing_url : String,
	val isNewApi : Boolean,
	val art_title : String,
	val filters : Filters,
	val query : String,
	val art_content : String,
	val other_filters : Other_filters,
	val stop_further_call : Int,
	val title : String,
	val size_chart_image : String,
	val app_sorting : Int,
	val namespace : List<String>,
	val type : String,
	val ios_landing_url : String,
	val sort : String,
	val desktop_tip_tile : String,
	val tip_tile : String,
	val banner_image : String,
	val art_link_text : String,
	val art_pos : String,
	val category_name : String,
	val auth_certificate : String,
	val level : Int,
	val url : String,
	val art_url : String,
	val child_categories : String
)