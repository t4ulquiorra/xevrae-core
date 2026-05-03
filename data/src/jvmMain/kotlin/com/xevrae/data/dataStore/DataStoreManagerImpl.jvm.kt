package com.xevrae.data.dataStore

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.xevrae.common.SETTINGS_FILENAME
import com.xevrae.data.io.getHomeFolderPath
import createDataStore
import java.io.File

actual fun createDataStoreInstance(): DataStore<Preferences> = createDataStore(
    producePath = {
        val file = File(getHomeFolderPath(listOf(".xevrae")), "$SETTINGS_FILENAME.preferences_pb")
        file.absolutePath
    }
)