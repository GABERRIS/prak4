import kotlin.random.Random

fun main() {
    // Генерируем случайное число от 1 до 100
    val secretNumber = Random.nextInt(1, 101)
    println("Добро пожаловать в игру 'Угадай число'!")
    println("Я загадал число от 1 до 100. Попробуйте угадать.")

    // Количество попыток
    var attempts = 0
    // Цикл, пока игрок не угадает
    while (true) {
        // Получаем ввод от пользователя
        print("Введите ваше число: ")
        val guess = readLine()?.toIntOrNull()

        // Проверяем, ввел ли пользователь число
        if (guess == null) {
            println("Неверный ввод. Введите число.")
            continue // Пропускаем текущую итерацию цикла
        }

        // Увеличиваем количество попыток
        attempts++

        // Сравниваем введенное число с загаданным
        if (guess < secretNumber) {
            println("Слишком мало! Попробуйте еще раз.")
        } else if (guess > secretNumber) {
            println("Слишком много! Попробуйте еще раз.")
        } else {
            // Угадали!
            println("Поздравляю! Вы угадали число $secretNumber за $attempts попыток.")
            break // Выходим из цикла
        }
    }
}