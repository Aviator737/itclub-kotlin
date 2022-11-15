package l3

class Client(
    override var name: String,
    override val phoneNumber: String,
    var creditHistory: CreditHistory
): BankUser {
    fun request(operator: OperatorCallCenter) {
        operator.request(this)
    }

    fun showCreditHistory() {
        println("кредитная история: ${creditHistory.str}")
    }
}