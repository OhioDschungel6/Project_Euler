import java.text.SimpleDateFormat
import java.util.*

fun main() {
    var c = GregorianCalendar(Locale.UK);
    c.set(1901,0,1)
    var sundays=0;
    while (c.get(Calendar.YEAR) < 2001) {
        println(SimpleDateFormat("EEE,dd.MM.yyyy").format(c.time))
        if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            sundays++
        }
        c.add(Calendar.MONTH, 1)
    }
    println(sundays)
}