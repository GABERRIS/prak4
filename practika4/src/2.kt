fun main() {
    // Запрашиваем длины сторон треугольника у пользователя
    println("Введите длину первой стороны:")
    val side1 = readLine()!!.toDouble()

    println("Введите длину второй стороны:")
    val side2 = readLine()!!.toDouble()

    println("Введите длину третьей стороны:")
    val side3 = readLine()!!.toDouble()

    // Проверяем, может ли быть построен треугольник
    if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
        // Определяем тип треугольника
        when {
            side1 == side2 && side2 == side3 -> println("Равносторонний треугольник")
            side1 == side2 || side1 == side3 || side2 == side3 -> println("Равнобедренный треугольник")
            else -> println("Разносторонний треугольник")
        }
    } else {
        println("Треугольник не может быть построен")
    }
}