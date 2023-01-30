import static org.junit.jupiter.api.Assertions.*;

class GameAreaTest {

    @org.junit.jupiter.api.Test
    void test1() {
        char[] array = {'X', 'X', 'X', '0', '0', '0', '0', '0', '0'};
        GameCondition actual = new GameArea(array).getCondition();
        GameCondition expected = GameCondition.WINNER_IS_X;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void test2() {
        char[] array = {'X', 'O', 'X', '0', 'O', '0', '0', 'O', '0'};
        GameCondition actual = new GameArea(array).getCondition();
        GameCondition expected = GameCondition.WINNER_IS_O;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void test3() {
        char[] array = {'X', '0', 'X', '0', 'O', '0', '0', 'O', '0'};
        GameCondition actual = new GameArea(array).getCondition();
        GameCondition expected = GameCondition.UNDEFINED;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void test4() {
        char[] array = {'X', 'O', 'X', 'X', 'O', 'X', 'O', 'X', 'O'};
        GameCondition actual = new GameArea(array).getCondition();
        GameCondition expected = GameCondition.TIE;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void test5() {
        char[] array = {'X', 'O', 'X', 'O', 'X', 'O', 'O', 'X', 'X'};
        GameCondition actual = new GameArea(array).getCondition();
        GameCondition expected = GameCondition.WINNER_IS_X;
        assertEquals(expected, actual);
    }
}