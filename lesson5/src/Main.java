public class Main {

    private final int size = 10000000;
    private final int h = size / 2;
    private float[] arr = new float[size];


    public static void main(String[] args) {
        Main main = new Main();

        main.oneThread();
        main.twoThreads();
    }


    void oneThread() {
        long a = System.currentTimeMillis();
        calc(arr);
        System.out.println("1 thread: " + (System.currentTimeMillis() - a));
        }

      void twoThreads() {
         float[] arr = new float[size];
         float[] a1 = new float[h];
         float[] a2 = new float[h];

         long a = System.currentTimeMillis();
         new Thread(() -> {
             System.arraycopy(arr, 0, a1, 0, h);
             calc(a1);
         }).start();

         new Thread(() -> {
             System.arraycopy(arr, h, a2, 0, h);
             calc(a2);
         }).start();

         System.arraycopy(a1, 0, arr, 0, h);
         System.arraycopy(a2, 0, arr, h, h);
         System.out.println("2 threads: " + (System.currentTimeMillis() - a));
    }

     private float[] calc(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        return arr;
    }
}
