package com.xevrae.domain.quality

/**
 * Typed audio quality modes.
 * Mirrors XiaoRi's AudioQuality enum (OPUS/YOUTUBE, SAAVN, LOSSLESS).
 */
enum class AudioStreamQuality {
    YOUTUBE,  // Standard YouTube stream (default)
    SAAVN,    // JioSaavn 320kbps
    LOSSLESS; // Qobuz FLAC (falls back to Saavn, then YouTube)
}
