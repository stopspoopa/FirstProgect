package testpackage;

public class FirstClass {
    public static void main(String[] args) {
        int peremennaya = 121;
        int epepf2 = 134;
        System.out.println("первая переменная: " + peremennaya);
        double d1 = 1.1;
        float f1 = 2.45f;
        System.out.println(d1 * f1);
        boolean b1 = true;
        boolean b2 = 1 + 1 < 0;
        System.out.println(b1);
        System.out.println(b2);
        String stf = "rachaka";
        System.out.println(stf);
        String ste1 = "fuck";
        System.out.println(stf + ste1);


        String[] name = new String[9];
        name[8] = "vasiya";
        name[1] = "kolya";
        name[2] = "sasha";
        int[] arg = {10, 34, 23, 34, 45};
        System.out.println(arg[1]);
        String[] mebel = {"шкаф", "стул", "стол"};
        System.out.println(mebel[1]);
        for (int i = 0; i < arg.length; i++) {
            System.out.println(arg[i]);
            System.out.println();
            int[] drug = new int[4];
            for (int j = 0; j < drug.length; j++) {
                drug[j] = j * 10;
                System.out.println(drug[j]);
            }
                int m = 9, n = 8, g = 3;
                System.out.println(n/g);
                double k=6.666, l=5.777;
                System.out.println(k%l);
                m=81;
            System.out.println(Math.sqrt(m));
            String s1= "12345";
            String s2="12345";
            System.out.println(s1.endsWith("5"));
            System.out.println(s1==s2);

            String pff = "Меня зовут %s, мне %d лет";
            int age =5;
            String name2 = "денис";
            System.out.println(String.format(pff,name2,age));





        }
    }}