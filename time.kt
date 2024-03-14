import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

fun main(){
var time=LocalTime.now()
    println("time is $time")
var date=LocalDate.now()
    println("date today is $date")
var datetime= LocalDateTime.now()
    println("date and time is $datetime")
var month= date.month
var day=date.dayOfWeek
var year=date
    println()
}