public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[10]; //申明一个10个元素数组
        int[] scores = new int[]{100,33,22};

        for (int i = 0; i < scores.length; i++) {
//            System.out.println(scores[i]);
        }

        for(int i:scores) {
//            System.out.println(i);
        }

        Array aa = new Array(20);
        for (int i = 0; i < 10; i++) {
            aa.addLast(i);
        }

        System.out.println(aa);

        aa.add(2, 10000);
        System.out.println(aa);

    }
}
