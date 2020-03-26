package A3;

public class Zadania_A3_4 {

    //Warmup-1 > startHi
    public static boolean startHi(String text){
        String tmpText = text.substring(0,2).toLowerCase();
        return tmpText.equals("hi");
    }

    //Warmup-1 > hasTeen
    public static boolean hasTeen(int a, int b, int c){
        return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
    }
}
