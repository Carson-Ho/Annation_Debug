package scut.carson_ho.annation_debug;

/**
 * Created by Carson_Ho on 17/7/26.
 */

public class Test {

    @Carson_Test
    public void method1(){
        System.out.println("method1正常运行 = " + (1+1));
    }
    @Carson_Test
    public void method2(){
        System.out.println("method2正常运行 = " + (2*3));
    }

    @Carson_Test
    public void method3(){
        System.out.println("method3正常运行 = " + (2/0));
    }

}
