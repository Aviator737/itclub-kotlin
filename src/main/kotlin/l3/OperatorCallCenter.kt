package l3

class OperatorCallCenter(
    override var name: String,
    override val phoneNumber: String
): BankUser {

    private fun check(client: BankUser) {
        println("принимаем звонок от ${client.phoneNumber}")
    }

    private fun help(client: BankUser) {
        println("помогаем ${client.name}")
    }

    private fun call(client: BankUser) {
        println("звоним ${client.phoneNumber}")
    }

    private fun helpClient(user: Client) {
        println("Помогаем клиенту")
        check(user)
        user.showCreditHistory()
        help(user)
    }

    private fun helpOperator(user: OperatorCallCenter) {
        println("Помогаем оператору")
        help(user)
    }

    fun request(user: BankUser) {
        when(user) {
            is Client -> helpClient(user)
            is OperatorCallCenter -> helpOperator(user)
        }
    }
}