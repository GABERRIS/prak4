fun main() {
    // Запрашиваем у пользователя способ оплаты
    println("Введите способ оплаты (наличные, кредитная карта, PayPal):")
    val spOpl = readLine()!!.lowercase() // Считываем ввод пользователя и преобразуем в нижний регистр

    // Проверяем способ оплаты и выводим соответствующее сообщение
    when (spOpl) {
        "наличные" -> println("Оплата наличными.")
        "кредитная карта" -> println("Оплата кредитной картой.")
        "paypal" -> println("Оплата через PayPal.")
        else -> println("Неверный способ оплаты.") // Выводим сообщение об ошибке, если способ оплаты неверный
    }
}