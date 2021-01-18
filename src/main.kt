fun main()
{
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val p = 3.14
    var A = a*a
    var B = b*b
    var S1 = p*A
    var S2 = p*B
    var S3 = S1-S2
    println(S1)
    println(S2)
    println(S3)
}