package ru.mipt.java2016.homework.g597.miller.task1;

import ru.mipt.java2016.homework.base.task1.Calculator;
import ru.mipt.java2016.homework.tests.task1.AbstractCalculatorTest;

/**
 * Created by Vova Miller on 12.10.2016.
 */

public class MillerCalculatorTest extends AbstractCalculatorTest {
    @Override
    protected Calculator calc() {
        return new MillerCalculator();
    }
}