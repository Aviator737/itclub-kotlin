fun main(args: Array<String>) {
    val mainUser = People("Roman")

    val drug1 = People("drug1")
    val drug2 = People("drug2")
    val drug3 = People("drug3")
    val drug4 = People("drug4")
    drug1.liveTime = 67
    drug2.liveTime = 102
    drug3.liveTime = 95
    drug4.liveTime = 38

    mainUser.friends.addAll(
        listOf(drug1, drug2, drug3, drug4)
    )

//    mainUser.friends.add(drug1)
//    mainUser.friends.add(drug2)
//    mainUser.friends.add(drug3)
//    mainUser.friends.add(drug4)

    mainUser.friends.forEach {
        println("${it.name} ${it.eat()}")
    }

    when {
        mainUser.friends.size == 0 -> println("У пользователя нет друзей")
        mainUser.friends.size == 1 -> println("У пользователя 1 друг")
        mainUser.friends.size > 2 && mainUser.friends.size < 7 -> println("У пользователя несколько друзей")
        else -> println("У пользователя много друзей")
    }
}
