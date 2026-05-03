package com.xevrae.kotlinytmusicscraper.extractor

import com.xevrae.kotlinytmusicscraper.models.SongItem
import com.xevrae.kotlinytmusicscraper.models.response.DownloadProgress

expect class Extractor() {
    fun init()

    fun mergeAudioVideoDownload(filePath: String): DownloadProgress

    fun saveAudioWithThumbnail(
        filePath: String,
        track: SongItem,
    ): DownloadProgress

    fun newPipePlayer(videoId: String): List<Pair<Int, String>>
}