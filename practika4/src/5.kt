fun main() {
    // Ввод числа от пользователя
    print("Введите число: ")
    val number = readLine()!!.toDouble()

    // Проверка знака числа
    if (number > 0) {
        println("Число положительное.")
    } else if (number < 0) {
        println("Число отрицательное.")
    } else {
        println("Число равно нулю.")
    }
}