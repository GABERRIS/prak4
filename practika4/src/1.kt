fun main() {
    // Запрашиваем у пользователя номер дня недели
    println("Введите номер дня недели (от 1 до 7):")
    val dayNumber = readLine()?.toIntOrNull()

    // Проверяем, ввел ли пользователь корректное число
    if (dayNumber != null && dayNumber in 1..7) {
        // Определяем день недели по номеру
        val dayOfWeek = when (dayNumber) {
            1 -> "Понедельник"
            2 -> "Вторник"
            3 -> "Среда"
            4 -> "Четверг"
            5 -> "Пятница"
            6 -> "Суббота"
            7 -> "Воскресенье"
            else -> "Некорректный номер дня"
        }

        // Выводим результат
        println("День недели: $dayOfWeek")
    } else {
        println("Некорректный ввод.")
    }
}