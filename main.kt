package A.next

fun main(){
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    var a:A? = null
    for (i in 0 until n) {
        a = A(i, a)
        println(a.value)
    }
    var b: A? = a
    var m = 1
    while (b?.next!=null)
    {
        m++
        b = b.next
    }
    b = a
    println("m=$m")
    for (i in 0 until m-k)
        b = b?.next

    print(b?.value)


}