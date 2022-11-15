enum class PeopleType(
    var reason: String = "default reason",
) {
    ANGRY("angry reason"),
    NICE,
    SAD("sad reason")
}

sealed class PeopleTypeS(
    val defaultReason: String = ""
) {
    class Angry(val reason: String = "angry reason", val bool: Boolean) : PeopleTypeS("2321321431")
    class Nice(val bool: Boolean, val test: List<Int>) : PeopleTypeS()
    class Sad(val reason: String = "sad reason") : PeopleTypeS()
}

enum class CreditHistory(str: String) { BAD("bad"), GOOD("good") }