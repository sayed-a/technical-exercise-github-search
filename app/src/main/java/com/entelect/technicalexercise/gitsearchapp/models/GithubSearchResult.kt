package com.entelect.technicalexercise.gitsearchapp.models

import com.google.gson.annotations.SerializedName

data class GithubSearchResult(
    @SerializedName("total_count") val totalCount: Int,
    val items: List<SearchItem>
)
