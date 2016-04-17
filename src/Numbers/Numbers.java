package Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Администратор on 03.04.2016.
 */
public class Numbers {
    public static BufferedReader stdIn =new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        formatTest();
    }
    public static void splitTest() throws IOException {
        System.out.println("введите строку ->");
        String s = stdIn.readLine();
        String[] m = s.split(" ");
        String[]words=new String[10];
        double[]numbers=new double[10];
        int p=0;
        int i=0;
        int y=0;
        while(p<m.length) {
            if (m[p].length() > 0) {
                try {
                    numbers[y] = Double.parseDouble(m[p]);
                    y++;
                } catch (NumberFormatException e) {
                    words[i] = m[p];
                    i++;
                }
            }
            p++;
        }
        int n=0;
        while(n<y){
            System.out.format("[%s]=%s",n,numbers[n]);
            n++;
        }
        System.out.println("");
        int w=0;
        while(w<i){
            System.out.format("[%s]=%s",w,words[w]);
            w++;
        }
    }
    public static void whileTest(){
       int a = 0;
        while(a<10){
            System.out.format("%s HelloWorld!\n",a);
            a+=1;
        }
    }
    public static void formatTest() {
        System.out.format("%sx^2+%sx+%s=0",10,150,2+9);
    }

    public static void whileDemo(){
        int x=1;
        while(x<=10){
            System.out.format("%s)HelloWorld!\n",x);
            x++;
        }
    }
    public static void doDemo(){
        int x=100;
        do {
            System.out.format("%s)HelloWorld!\n",x);
        }
        while (x<=10);
    }
    public static void forDemo(){
        for(int x=1; x<=10; x++){
            System.out.format("%s)HelloWorld!\n",x);
        }
        for(int x=100; x<=10; x++){
            System.out.format("%s)HelloWorld!\n",x);
        }
    }
}
