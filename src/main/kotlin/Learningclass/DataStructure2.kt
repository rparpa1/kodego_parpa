import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

fun main() {
    var rectangleDimensions = Array(4) { Array<String>(4) { "" } } //width, Height

    var xPosition = intArrayOf(1, 2, 3)
    var yPosition = intArrayOf(2, 3, 4)
    var zPosition = intArrayOf(2, 3, 4, 0, 90)
    var position = arrayOf(xPosition, yPosition, zPosition) // X, Y

    var location = Array(4) { Array(4){} }//lat, long

//    for(xPositions in position){
//        for(xposition in xPositions){
//            logger.info {"position : $xposition" }
//        }
//    }

    for(row in position.indices){
        for (column in position[row].indices){
            logger.info {"position : $row, $column = [${position[row][column]}]"}
        }
    }

    var threeDimensions = Array(4){Array<String>(4){""} } } //3 dimensional array
//}