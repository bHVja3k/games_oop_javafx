package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

    @Test
    public void whenPosition() {
        BishopBlack bhb = new BishopBlack(Cell.E4);
        assertThat(bhb.position(), is(Cell.E4));
    }

    @Test
    public void whenCopy() {
        BishopBlack bhb = new BishopBlack(Cell.E4);
        assertThat(bhb.copy(Cell.F5).position(), is(Cell.F5));
    }

    @Test
    public void whenWay() {
        BishopBlack bhb = new BishopBlack(C1);
        Cell[] result = bhb.way(C1, G5);
        Cell[] expect = {D2, E3, F4, G5};
        assertThat(result, is(expect));
    }
}