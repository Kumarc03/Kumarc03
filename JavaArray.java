public class JavaArray {
    public static void  main (String[] args)
    {

        int[] num ={5,2,14,5,7,4,26,8};
        System.out.print(num[2]);
//    static {
////        int num1[]= new int[5];
////        num1[0]=5;
////        num1[1]=56;
////        num1[2]=6;
////        num1[3]=47;
////        num1[4]=78;
////        for (int i=0;i<5;i++)
////             System.out.println(num1[i]);
////
////    }

    // enhanced for loop
//        static {
//        int num1[]= new int[5];
//        num1[0]=5;
//        num1[1]=56;
//        num1[2]=6;
//        num1[3]=47;
//        num1[4]=78;
//        for (int num:num1)  //enhanced for loop. here num acts as an iterator.
//            System.out.println(num);
//
//    }
    // two dimensional arrays. e.g num[][].
    {
        int[][] num2 = new int[3][3];
        num2[0][0]=5;
        num2[0][1]=6;
        num2[0][2]=21;
        num2[1][0]=15;
        num2[1][1]=89;
        num2[1][2]=45;
        num2[2][0]=38;
        num2[2][1]=98;
        num2[2][2]=4;

        for (int i = 0;i<3;i++) {
            for (int j=0;j<3;j++)
            {
                System.out.print(num2[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
}
