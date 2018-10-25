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

        Array<Integer> aa = new Array<>(20);
        for (int i = 0; i < 10; i++) {
            aa.addLast(i);
        }

//        System.out.println(aa);

        aa.add(2, 10000);
        System.out.println(aa);
        aa.remove(1);
        System.out.println(aa);
        aa.removeElement(4);
        System.out.println(aa);
        aa.removeFirst();
        System.out.println(aa);

        //使用泛型让我们的数据结构可以放置“任何”数据类型
        //不可以是基本数据类型，只能是对象
        //八种基本数据类型 boolean, byte, char, short,int,long, float, double
        //每个基本数据类型都有对应的包装类
        //八种基本数据类型包装类Boolean, Byte, Char, Short, Int, Long, Float, Double

    }
}
