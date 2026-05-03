package com.xevrae.data.di.loader

import com.xevrae.media_jvm.di.loadVlcModule

actual fun loadMediaService() {
    loadVlcModule()
}
