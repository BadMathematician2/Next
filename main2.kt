package A.next

fun main(){
    var a = A(0,null)
    val k = readLine()!!.toInt()
    val n = readLine()!!.toInt()
    for (i in 1..n)
        a = A(i,a)
    var b = a
    var i = 0
   do
    {
        a = a.next!!
        i++
        if (i>k)
            b = b.next!!
    }while (a.next!=null)
    println(b.next!!.value)
}