public class whileloop {
    public static void main(String[] args) {
        int count = 1;
        while(count <= 100){
            count ++;
            if(count % 2 == 0){
                continue;
            }
            System.out.println(count);
        }
        System.out.println("Fin");
    }
}
