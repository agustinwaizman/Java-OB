public class fibo {
    public static void main(String[] args) {
        
        int num0 = 0;
        int num1 = 1;

        for(int i = 0; i <= 10; i++){
            System.out.println(num0);
            int fibo = num0 + num1;
            num0 = num1;
            num1 = fibo;
        }
    }
}
