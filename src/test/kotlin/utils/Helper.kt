package src2.utils

import java.io.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Helper {
    companion object {
        fun getTodayDate(formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")): String {
            val date = LocalDateTime.now()
            return formatter.format(date)
        }

        fun getYesterdayDate(formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")): String {
            val yesterday = LocalDateTime.now().minusDays(1)
            return formatter.format(yesterday)
        }

        fun getTomorrowDate(formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")): String {
            val tomorrow = LocalDateTime.now().plusDays(1)
            return formatter.format(tomorrow)
        }

        fun getNextMonthDate(formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")): String {
            val nextMonth = LocalDateTime.now().plusMonths(1)
            return formatter.format(nextMonth)
        }

        @Throws(FileNotFoundException::class)
        fun readStringFromFile(filePath: String): String {
            val inputStream: InputStream = File(filePath).inputStream()
            return inputStream.bufferedReader().use { it.readText() }
        }
    }
}