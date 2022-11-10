open class Animal {
    open val liveTime: Int = 10

    open fun eat(): String {
        return "кушаю"
    }

    open fun grow(amount: Int) {
        println("вырос на $amount")
    }
}