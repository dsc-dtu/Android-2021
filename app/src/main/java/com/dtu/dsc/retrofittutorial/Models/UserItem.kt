package com.dtu.dsc.retrofittutorial.Models

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

@Parcelize
@Keep
data class UserItem(
    val avatar_url: String? = null, // https://github.com/images/error/octocat_happy.gif
    val events_url: String? = null, // https://api.github.com/users/octocat/events{/privacy}
    val followers_url: String? = null, // https://api.github.com/users/octocat/followers
    val following_url: String? = null, // https://api.github.com/users/octocat/following{/other_user}
    val gists_url: String? = null, // https://api.github.com/users/octocat/gists{/gist_id}
    val gravatar_id: String? = null,
    val html_url: String? = null, // https://github.com/octocat
    val id: Int? = null, // 1
    val login: String? = null, // octocat
    val node_id: String? = null, // MDQ6VXNlcjE=
    val organizations_url: String? = null, // https://api.github.com/users/octocat/orgs
    val receivedEvents_url: String? = null, // https://api.github.com/users/octocat/received_events
    val repos_url: String? = null, // https://api.github.com/users/octocat/repos
    val siteAdmin: Boolean? = null, // false
    val starred_url: String? = null, // https://api.github.com/users/octocat/starred{/owner}{/repo}
    val subscriptions_url: String? = null, // https://api.github.com/users/octocat/subscriptions
    val type: String? = null, // com.akshat.jindal.retrofittutorial.Models.User
    val url: String? = null // https://api.github.com/users/octocat
) : Parcelable