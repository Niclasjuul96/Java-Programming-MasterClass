public class PossiveNegativeZero {
    public static void checkNumber(int value) {
        if(value < 0 ){
            System.out.println("negative");
        }else if(value > 0){
            System.out.println("positive");
        } else{
            System.out.println("zero");
        }
    }
}
