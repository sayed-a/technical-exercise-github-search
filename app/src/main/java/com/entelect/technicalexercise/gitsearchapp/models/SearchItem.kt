package com.entelect.technicalexercise.gitsearchapp.models

import com.google.gson.annotations.SerializedName

data class SearchItem(
    val name: String,
    @SerializedName("full_name") val fullName: String,
    @SerializedName("private") val isPrivate: Boolean,
    val owner: Owner,
    val forks: Int,
    val watchers: Int,
    @SerializedName("default_branch") val defaultBranch: String
)
