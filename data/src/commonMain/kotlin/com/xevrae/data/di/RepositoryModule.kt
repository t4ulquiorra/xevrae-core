package com.xevrae.data.di

import com.xevrae.common.Config.SERVICE_SCOPE
import com.xevrae.data.io.fileDir
import com.xevrae.data.repository.AccountRepositoryImpl
import com.xevrae.data.repository.AlbumRepositoryImpl
import com.xevrae.data.repository.AnalyticsRepositoryImpl
import com.xevrae.data.repository.ArtistRepositoryImpl
import com.xevrae.data.repository.CommonRepositoryImpl
import com.xevrae.data.repository.HomeRepositoryImpl
import com.xevrae.data.repository.LocalPlaylistRepositoryImpl
import com.xevrae.data.repository.LyricsCanvasRepositoryImpl
import com.xevrae.data.repository.PlaylistRepositoryImpl
import com.xevrae.data.repository.PodcastRepositoryImpl
import com.xevrae.data.repository.SearchRepositoryImpl
import com.xevrae.data.repository.SongRepositoryImpl
import com.xevrae.data.repository.StreamRepositoryImpl
import com.xevrae.data.repository.UpdateRepositoryImpl
import com.xevrae.domain.repository.AccountRepository
import com.xevrae.domain.repository.AlbumRepository
import com.xevrae.domain.repository.AnalyticsRepository
import com.xevrae.domain.repository.ArtistRepository
import com.xevrae.domain.repository.CommonRepository
import com.xevrae.domain.repository.HomeRepository
import com.xevrae.domain.repository.LocalPlaylistRepository
import com.xevrae.domain.repository.LyricsCanvasRepository
import com.xevrae.domain.repository.PlaylistRepository
import com.xevrae.domain.repository.PodcastRepository
import com.xevrae.domain.repository.SearchRepository
import com.xevrae.domain.repository.SongRepository
import com.xevrae.domain.repository.StreamRepository
import com.xevrae.domain.repository.UpdateRepository
import org.koin.core.qualifier.named
import org.koin.dsl.module

val repositoryModule =
    module {
        single<AccountRepository>(createdAtStart = true) {
            AccountRepositoryImpl(get(), get())
        }

        single<AlbumRepository>(createdAtStart = true) {
            AlbumRepositoryImpl(get(), get())
        }

        single<ArtistRepository>(createdAtStart = true) {
            ArtistRepositoryImpl(get(), get())
        }

        single<CommonRepository>(createdAtStart = true) {
            CommonRepositoryImpl(get(named(SERVICE_SCOPE)), get(), get(), get(), get(), get()).apply {
                this.init("${fileDir()}/ytdlp-cookie.txt", get())
            }
        }

        single<HomeRepository>(createdAtStart = true) {
            HomeRepositoryImpl(get(), get())
        }

        single<LocalPlaylistRepository>(createdAtStart = true) {
            LocalPlaylistRepositoryImpl(get(), get())
        }

        single<LyricsCanvasRepository>(createdAtStart = true) {
            LyricsCanvasRepositoryImpl(get(), get(), get(), get(), get())
        }

        single<PlaylistRepository>(createdAtStart = true) {
            PlaylistRepositoryImpl(get(), get(), get())
        }

        single<PodcastRepository>(createdAtStart = true) {
            PodcastRepositoryImpl(get(), get())
        }

        single<SearchRepository>(createdAtStart = true) {
            SearchRepositoryImpl(get(), get())
        }

        single<SongRepository>(createdAtStart = true) {
            SongRepositoryImpl(get(), get(), get())
        }

        single<StreamRepository>(createdAtStart = true) {
            StreamRepositoryImpl(get(), get())
        }

        single<UpdateRepository>(createdAtStart = true) {
            UpdateRepositoryImpl(get())
        }

        single<AnalyticsRepository>(createdAtStart = true) {
            AnalyticsRepositoryImpl(get())
        }
    }