import l3.Client
import l3.CreditHistory
import l3.OperatorCallCenter

fun main(args: Array<String>) {
    val client = Client("Roman", "+421 123 123 132", CreditHistory.BAD)

    val operator = OperatorCallCenter("Nikita", "+799999999999")

    val operator2 = OperatorCallCenter("Kucher", "+7391939139193")

    client.request(operator)

    operator.request(operator2)
}
