class MyArrayDataException extends Exception {

    int i, j;

    private MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    static int checkForArrayData(String[][] arr) throws MyArrayDataException {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}

