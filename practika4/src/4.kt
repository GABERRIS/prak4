import java.time.LocalTime

fun main() {
    // Получаем текущее время
    val currentTime = LocalTime.now()

    // Проверяем время суток
    val timeOfDay = when {
        currentTime.hour in 5..11 -> "Утро"
        currentTime.hour in 12..17 -> "День"
        currentTime.hour in 18..23 -> "Вечер"
        else -> "Ночь"
    }

    // Выводим результат
    println("Сейчас $timeOfDay")
}