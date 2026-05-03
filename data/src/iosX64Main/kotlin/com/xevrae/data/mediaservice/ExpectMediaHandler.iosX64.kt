package com.xevrae.data.mediaservice

actual fun createMediaServiceHandler(
    dataStoreManager: com.xevrae.domain.manager.DataStoreManager,
    songRepository: com.xevrae.domain.repository.SongRepository,
    streamRepository: com.xevrae.domain.repository.StreamRepository,
    localPlaylistRepository: com.xevrae.domain.repository.LocalPlaylistRepository,
    analyticsRepository: com.xevrae.domain.repository.AnalyticsRepository,
    coroutineScope: kotlinx.coroutines.CoroutineScope,
): com.xevrae.domain.mediaservice.handler.MediaPlayerHandler {
    TODO("Not yet implemented")
}