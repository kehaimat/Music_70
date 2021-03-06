package vn.sunasterisk.music_70.util

import vn.sunasterisk.music_70.BuildConfig
import vn.sunasterisk.music_70.constant.Constant
import java.text.SimpleDateFormat
import java.util.*

object StringUtils {
    fun generateGenreUrl(kind: String, genre: String, limit: Int, offset: Int) =
        String.format(Constant.BASE_GENRE_URL, kind, genre, BuildConfig.API_KEY, limit, offset)

    fun reformatImageUrl(url: String) =
        url.replace(Constant.IMAGE_LARGE, Constant.IMAGE_FULL)

    fun generateSearchUrl(query: String) =
        String.format(
            Constant.BASE_HEADER_URL.plus(Constant.BASE_SEARCH_URL),
            query,
            BuildConfig.API_KEY
        )

    fun appendString(elementFrist: String, elementSecond: String) = elementFrist + elementSecond

    fun convertTime(time: Int): String {
        val format = SimpleDateFormat("mm:ss", Locale.getDefault())
        return format.format(time)
    }

    fun generateTredingUrl(kind: String, genre: String): String =
        String.format(Constant.BASE_TRENDING_URL, kind, genre, BuildConfig.API_KEY)

    fun generateDownloadUrl(trackId: Long) =
        String.format(
            Constant.BASE_HEADER_URL.plus(Constant.BASE_DOWNLOAD_URL),
            trackId,
            BuildConfig.API_KEY
        )

    fun generateStreamUrl(trackId: Int) =
        String.format(
            Constant.BASE_HEADER_URL.plus(Constant.BASE_STREAM_URL),
            trackId,
            BuildConfig.API_KEY
        )

    fun passCount(count: Int): String {
        if (count > 1000000) {
            val tmp = count.toDouble() / 100000
            return String.format(Locale.US, "%.1fM", tmp)
        }
        if (count > 1000) {
            val tmp = count.toDouble() / 1000
            return String.format(Locale.US, "%.1fK", tmp)
        }
        return count.toString()
    }
}
