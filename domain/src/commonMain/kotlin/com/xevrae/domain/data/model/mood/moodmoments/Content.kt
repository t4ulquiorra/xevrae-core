package com.xevrae.domain.data.model.mood.moodmoments

import com.xevrae.domain.data.model.searchResult.songs.Thumbnail
import com.xevrae.domain.data.type.HomeContentType

data class Content(
    val playlistBrowseId: String,
    val subtitle: String,
    val thumbnails: List<Thumbnail>?,
    val title: String,
) : HomeContentType