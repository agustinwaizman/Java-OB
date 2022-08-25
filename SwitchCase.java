public class SwitchCase {
    public static void main(String[] args) {
        String clima = "Lluvioso";

        switch(clima){
            case "Soleado":
                System.out.println("Ta lindo el dia");
                break;
            case "Lluvioso":
                System.out.println("ta lloviendo perri");
                break;
            case "nublado":
                System.out.println("ta nublado pero no llueve");
                break;
            default:
                System.out.println("ni idea como esta el tiempo");
        }
    }
    
}
