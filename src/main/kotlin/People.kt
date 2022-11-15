class People(
    var name: String,
    val peopleType: PeopleType,
    val peopleTypeS: PeopleTypeS
) : Animal() {

    val money: Double = 0.0

    val friends = mutableListOf<People>()

    override var liveTime: Int = 100

    override fun eat(): String {
        return "хорошо покушал"
    }

    override fun grow(amount: Int) {
        println("человек вырос на $amount")
    }
}