public class GameArea {
    private char[] array = new char[9];

    public GameArea() {
        for(int i = 0; i < 9; i++) {
            array[i] = ' ';
        }
    }

    public GameArea(char[] arr) {
        array = arr;
    }

    public void set(int index, char symbol) throws NotEmptyItemException{
        if (array[index] != ' ')
            throw new NotEmptyItemException();
        array[index] = symbol;
    }

    public GameCondition getCondition() {
        for(int i = 0; i < 3; i++) {
            // Просмотр столбцов
            if(array[i] == array[i+3] && array[i] == array[i+6]) {
                if(array[i] == 'O')
                    return GameCondition.WINNER_IS_O;
                else if(array[i] == 'X')
                    return GameCondition.WINNER_IS_X;
            }  // просмотр строк
            else if(array[i*3] == array[i*3 + 1] && array[i*3] == array[i*3 + 2]) {
                if(array[i*3] == 'O')
                    return GameCondition.WINNER_IS_O;
                else if(array[i*3] == 'X')
                    return GameCondition.WINNER_IS_X;
            }
        }

        // проверка главной диагонали
        if(array[0] == array[4] && array[0] == array[8]) {
            if(array[0] == 'O')
                return GameCondition.WINNER_IS_O;
            else if(array[0] == 'X')
                return GameCondition.WINNER_IS_X;
        }
        // проверка побочной диагонали
        if(array[2] == array[4] && array[4] == array[6]) {
            if(array[2] == 'O')
                return GameCondition.WINNER_IS_O;
            else if(array[2] == 'X')
                return GameCondition.WINNER_IS_X;
        }

        // если есть хотя бы одна свободная клетка, то игра продолжается
        for(int i = 0; i < 9; i++) {
            if(array[i] == ' ') {
                return GameCondition.UNDEFINED;
            }
        }
        return GameCondition.TIE;
    }

    public char[] getArray() {
        return array;
    }
}
