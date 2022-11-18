package racingCar.domain

@JvmInline
value class Position(val position: Int = 0) {
    init {
        require(position >= 0) { "위치값은 0보다 작을수 없습니다." }
    }

    fun increase(): Position = Position(position + 1)

    operator fun minus(other: Position): Int = this.position - other.position
}
