package calculator

class Operators {

    private val CALCULABLE_SIZE = 1

    private val operators: ArrayDeque<Operator> = ArrayDeque()

    fun add(operator: Operator) {
        require(operators.size < CALCULABLE_SIZE) { "유효하지 않은 입력값입니다." }
        operators.add(operator)
    }

    fun firstOperator() = operators.removeFirst()

    fun isCalculable(): Boolean = this.operators.size == CALCULABLE_SIZE
}
