import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        // подготавливаем даннные:
        long amount = 600;
        boolean registered = false;
        long expected = 6;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаеммый и фактический):
        Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        // подготавливаем даннные:
        long amount = 100_000;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаеммый и фактический):
        Assertions.assertEquals(expected, actual);


    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndZeroBonus() {
        BonusService service = new BonusService();

        // подготавливаем даннные:
        long amount = 32;
        boolean registered = true;
        long expected = 0;

        // вызываем целевой метод:

        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаеммый и фактический):
        Assertions.assertEquals(expected, actual);


    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndZeroBonus() {
        BonusService service = new BonusService();
        // подготавливаем даннные:
        long amount = 98;
        boolean registered = false;
        long expected = 0;
        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаеммый и фактический):
        Assertions.assertEquals(expected, actual);


    }


}