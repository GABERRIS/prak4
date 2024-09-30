fun main() {
    println("Введите группу крови (A, B, AB, O):")
    val bloodType = readLine()!!.toUpperCase()

    // Проверка введенной группы крови
    if (bloodType !in listOf("A", "B", "AB", "O")) {
        println("Неверный формат группы крови. Пожалуйста, введите A, B, AB или O.")
        return
    }

    // Вывод возможных типов крови для переливания
    when (bloodType) {
        "A" -> println("Можно перелить кровь типа: A, O")
        "B" -> println("Можно перелить кровь типа: B, O")
        "AB" -> println("Можно перелить кровь типа: A, B, AB, O")
        "O" -> println("Можно перелить кровь типа: O")
    }
}