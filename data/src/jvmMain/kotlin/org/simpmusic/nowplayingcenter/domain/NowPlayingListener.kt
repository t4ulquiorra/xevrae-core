package org.simpmusic.nowplayingcenter.domain

interface NowPlayingListener {
    fun onPlayPause()
    fun onNext()
    fun onPrevious()
    fun onStop()
}

sealed class Platform {
    object Windows : Platform()
    object MacOs : Platform()
    data class Linux(val display: String? = null) : Platform()
}
