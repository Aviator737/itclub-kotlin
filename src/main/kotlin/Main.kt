var balance: Double = 0.0

var userName: String = "Roman S."

val friends = mutableListOf<String>("Nikolay", "Diman", "Nikita", "Alex", "Oleg")

fun main(args: Array<String>) {
    val title: String = "Оплата"

    changeBalance(-200.0)
    changeName("Nikita")

    val balance = showBalance()
    println(balance)

    println(title)

    if (balance >= 0) {
        println("баланс положительный")
    } else {
        println("баланс отрицательный")
    }

    showFriends()
}

fun changeBalance(toChange: Double) {
    balance += toChange
}

fun changeName(inputName: String) {
    userName = inputName
}

fun showBalance(): Double {
    return balance
}

fun showFriends() {
    friends.forEachIndexed { i, element ->
        println("друг № $i: $element")
    }
}
