package code_coverage_4.code_coverage_4;

public class WeakMethod {

    public static String weakMethod(int a) {
        int x = 2;          

        if (a > 0) {          
            x = 1;           
        }
        int y = 10 / (x - 2); 
        return "y=" + y;      
    }
}
