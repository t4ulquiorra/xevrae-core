package com.xevrae.data.mediaservice

import com.xevrae.domain.repository.AnalyticsRepository

actual fun createMediaServiceHandler(
    dataStoreManager: com.xevrae.domain.manager.DataStoreManager,
    songRepository: com.xevrae.domain.repository.SongRepository,
    streamRepository: com.xevrae.domain.repository.StreamRepository,
    localPlaylistRepository: com.xevrae.domain.repository.LocalPlaylistRepository,
    analyticsRepository: AnalyticsRepository,
    coroutineScope: kotlinx.coroutines.CoroutineScope,
): com.xevrae.domain.mediaservice.handler.MediaPlayerHandler =
    JvmMediaPlayerHandlerImpl(
        dataStoreManager = dataStoreManager,
        songRepository = songRepository,
        streamRepository = streamRepository,
        localPlaylistRepository = localPlaylistRepository,
        analyticsRepository = analyticsRepository,
        coroutineScope = coroutineScope,
    )