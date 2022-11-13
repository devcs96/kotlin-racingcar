package racingCar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarsTest {

    @Test
    fun `이동 전략에 따라 자동차가 움직입니다`() {
        val cars = Cars(3) { true }

        cars.moveByStrategy()

        assertThat(cars.cars).containsExactly(Car(Position(2)), Car(Position(2)), Car(Position(2)))
    }
}
