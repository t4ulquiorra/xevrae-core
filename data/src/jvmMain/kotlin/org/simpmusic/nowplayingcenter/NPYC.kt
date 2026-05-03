package org.simpmusic.nowplayingcenter

import org.simpmusic.nowplayingcenter.domain.NowPlayingListener
import org.simpmusic.nowplayingcenter.domain.Platform

class NPYC(private val platform: Platform) {
    fun setListener(listener: NowPlayingListener) {}
    fun setNowPlaying(title: String, artist: String, album: String, thumbnails: Any?) {}
    fun setButtonEnabled(isPlaying: Boolean, canGoNext: Boolean, canGoPrevious: Boolean) {}
    fun removeListener() {}
}
