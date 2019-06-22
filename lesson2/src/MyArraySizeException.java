class MyArraySizeException extends Exception {
    int count;
    private MyArraySizeException(String message, int count) {
        super(message);
        this.count = count;
    }

    static int checkForArraySize(String[][] arr) throws MyArraySizeException {
        int count = 0;
        for (String[] a : arr) {
            if (a.length != 4) {
                throw new MyArraySizeException("", count);
            }
            count++;
        }
        return count;
    }
}
