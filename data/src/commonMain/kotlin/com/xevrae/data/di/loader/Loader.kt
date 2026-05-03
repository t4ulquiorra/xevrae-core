package com.xevrae.data.di.loader

import com.xevrae.data.di.databaseModule
import com.xevrae.data.di.mediaHandlerModule
import com.xevrae.data.di.repositoryModule
import org.koin.core.context.loadKoinModules

fun loadAllModules() {
    loadKoinModules(
        listOf(
            databaseModule,
            repositoryModule,
        ),
    )
    loadKoinModules(mediaHandlerModule)
    loadMediaService()
}

expect fun loadMediaService()