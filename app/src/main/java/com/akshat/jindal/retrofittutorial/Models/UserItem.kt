package com.akshat.jindal.retrofittutorial.Models
import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Keep
data class UserItem(
    @SerializedName("avatar_url")
    val avatarUrl: String? = null, // https://github.com/images/error/octocat_happy.gif
    @SerializedName("events_url")
    val eventsUrl: String? = null, // https://api.github.com/users/octocat/events{/privacy}
    @SerializedName("followers_url")
    val followersUrl: String? = null, // https://api.github.com/users/octocat/followers
    @SerializedName("following_url")
    val followingUrl: String? = null, // https://api.github.com/users/octocat/following{/other_user}
    @SerializedName("gists_url")
    val gistsUrl: String? = null, // https://api.github.com/users/octocat/gists{/gist_id}
    @SerializedName("gravatar_id")
    val gravatarId: String? = null,
    @SerializedName("html_url")
    val htmlUrl: String? = null, // https://github.com/octocat
    @SerializedName("id")
    val id: Int? = null, // 1
    @SerializedName("login")
    val login: String? = null, // octocat
    @SerializedName("node_id")
    val nodeId: String? = null, // MDQ6VXNlcjE=
    @SerializedName("organizations_url")
    val organizationsUrl: String? = null, // https://api.github.com/users/octocat/orgs
    @SerializedName("received_events_url")
    val receivedEventsUrl: String? = null, // https://api.github.com/users/octocat/received_events
    @SerializedName("repos_url")
    val reposUrl: String? = null, // https://api.github.com/users/octocat/repos
    @SerializedName("site_admin")
    val siteAdmin: Boolean? = null, // false
    @SerializedName("starred_url")
    val starredUrl: String? = null, // https://api.github.com/users/octocat/starred{/owner}{/repo}
    @SerializedName("subscriptions_url")
    val subscriptionsUrl: String? = null, // https://api.github.com/users/octocat/subscriptions
    @SerializedName("type")
    val type: String? = null, // com.akshat.jindal.retrofittutorial.Models.User
    @SerializedName("url")
    val url: String? = null // https://api.github.com/users/octocat
)