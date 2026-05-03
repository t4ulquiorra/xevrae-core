package org.simpmusic.nowplayingcenter.domain

interface NowPlayingListener {
    fun onMetadataChanged(title: String, artist: String, album: String, artworkUrl: String?)
    fun onPlaybackStateChanged(isPlaying: Boolean, position: Long, duration: Long)
}

sealed class Platform {
    object Windows : Platform()
    object MacOs : Platform()
    data class Linux(val display: String? = null) : Platform()
}
