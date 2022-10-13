import java.time.LocalDateTime
import java.time.Month
import java.time.format.DateTimeFormatter
import java.util.*

fun main() {

    var dateNow = Date()
    var dateTimeNow = LocalDateTime.now()
    var dateTime = LocalDateTime.of(2022, Month.OCTOBER, 5, 8,10 )

var dateFomat1 = DateTimeFormatter.ofPattern("M/d")



}