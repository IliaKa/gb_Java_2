public class Main {

    public static void main(String[] args) {

        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6y", "8", "2"},
                {"9", "11", "12"},
                {"13", "14", "15", "16"}};

        try {
            int printArray = MyArraySizeException.checkForArraySize(arr);
            System.out.println(printArray);
        } catch (MyArraySizeException e) {
            System.out.printf("Некорректный размер массива, ошибка в строке %d\n", e.count);
        }

        try {
            int printArray = MyArrayDataException.checkForArrayData(arr);
            System.out.println(printArray);
        } catch (MyArrayDataException e) {
            System.out.printf("Невозможно преобразовать строку в число в ячейке [%d][%d]\n", e.i, e.j);
        }
    }
}

