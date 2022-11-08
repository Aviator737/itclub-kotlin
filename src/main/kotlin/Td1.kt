class Td1 {
    fun test() {
        //val
        //var

        val array = mutableListOf("Roman", "Nikolay", "Vovan", "Petr")

        array.add("test")

        val keyValue = mutableMapOf<String, Boolean>()
        keyValue["Vovan"] = false
        keyValue["Petr"] = false
        keyValue["Roman"] = true
        keyValue["Nikolay"] = true

        println(array)
        println(keyValue)

    val name = "Главная"

    var amount = "52 146,85 Р"

    val summ:  Int =     1111111661+599           // 32 бита
    val summL: Long =   1111111661616166161L  // 64 бита

    val summF: Float =  656.1321F                               // 32 бита
    val summD: Double = 656.424211111111111111111111111111111   // 64 бит

    var switchT: Boolean = true

    println(name)
    println(summ)
    println(summL)
    println(summF)
    println(summD)
    println(switchT)
    println(amount)
    }

}