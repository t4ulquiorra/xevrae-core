package org.simpmusic.nowplayingcenter

import org.simpmusic.nowplayingcenter.domain.NowPlayingListener
import org.simpmusic.nowplayingcenter.domain.Platform

class NPYC(private val platform: Platform) {
    fun setListener(listener: NowPlayingListener) {}
    fun updateMetadata(title: String, artist: String, album: String, artworkUrl: String?) {}
    fun updatePlaybackState(isPlaying: Boolean, position: Long, duration: Long) {}
    fun release() {}
}
