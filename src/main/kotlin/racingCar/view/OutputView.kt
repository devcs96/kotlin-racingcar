package racingCar.view

import racingCar.domain.Position
import racingCar.dto.ResultDto
import java.util.stream.Collectors
import java.util.stream.IntStream

object OutputView {

    private const val USERNAME_ASK_QST = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."
    private const val TRY_NUM_ASK_QST = "시도할 횟수는 몇 회인가요?"
    private const val RESULT_MSG = "실행결과"
    private const val POSITION_UNIT = "-"

    fun askTryNumber() = println(TRY_NUM_ASK_QST)

    fun printResultMsg() = println(RESULT_MSG)
    fun printResult(result: ResultDto) {
        println()
        result.positions.forEach {
            println("${it.key.username} : ${toPositionUnits(it.value)}")
        }
    }

    private fun toPositionUnits(position: Position): String {
        return IntStream.range(0, position.position)
            .mapToObj { POSITION_UNIT }
            .collect(Collectors.joining())
    }

    fun askUsernames() = println(USERNAME_ASK_QST)
}
