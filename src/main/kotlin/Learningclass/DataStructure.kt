import mu.KotlinLogging

lateinit var dogBreeds: Array<String>
private val logger = KotlinLogging.logger {}

fun main() {
    var books = Array<String>(100) {
        ""
    }

    var numbers: Array<Int>
    numbers = Array(100) {
        0
    }

    var stations: Array<String> = arrayOf("Taft", "Magallanes", "Ayala")

    for (station in stations) {
        logger.info { "Station : $station" }
    }

    logger.info { "Stations : ${stations.size}" }
    for (index in 0 until stations.size) {
        logger.info { "UNTIL Station [${index}] : ${stations[index]}" }
    }

    for (index in stations.indices) {
        logger.info { "USING indices Station [${index}] : ${stations[index]}" }
    }

    logger.info { "Station : ${stations[0]}" }

    var arrayOfNumbers = Array(5, { i -> i + 1 })
    var arrayOfIntegers = arrayOf(1, 3, 4, 7, 11, 18)

    arrayOfIntegers.set(2, 0)
    arrayOfIntegers[1] = 100

    arrayOfIntegers.forEach {
        logger.info { "For Each : $it" }
    }

    logger.info { "Average : ${arrayOfIntegers.average()}" }
    logger.info { "Sum : ${arrayOfIntegers.sum()}" }
    logger.info { "Max : ${arrayOfIntegers.max()}" }
    logger.info { "Max : ${arrayOfIntegers.min()}" }

    arrayOfIntegers = arrayOfIntegers.plus(arrayOfIntegers)

    arrayOfIntegers.forEach {
        logger.info { "After plus : $it" }
    }

    val arrayOfIntegers3 = intArrayOf(1, 3, 5, 7, 11, 18)
    var arrayOfIntegers4 = intArrayOf(2, 4, 6, 8, 10, 0)

    arrayOfIntegers[0] = 90
    arrayOfIntegers3.forEach {
        logger.info { "$it" }
    }
//    arrayOfIntegers4 = arrayOfIntegers.plus(arrayOfIntegers4)
}