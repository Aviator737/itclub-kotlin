open class Animal : IAnimal {
    companion object {
        var test = ""
    }

    override val liveTime: Int = 10

    override fun eat(): String {
        return "кушаю"
    }

    override fun grow(amount: Int) {
        println("вырос на $amount")
    }
}