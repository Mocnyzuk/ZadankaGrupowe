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

    //Warmup-1 > stringE
    public static boolean stringE(String text){
        int counter = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'e'){
                counter++;
            }
        }
        return counter >= 1 && counter <= 3;
    }

    //Warmup-1 > everyNth
    public static String everyNth(String text, int n){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < text.length(); i+=n){
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    //String-1 > helloName
    public static String helloName(String name){
        return "Hello ".concat(name);
    }

    //String-1 > makeOutWord
    public static String makeOutWord(String out, String word){
        StringBuilder result = new StringBuilder();
        return result.append(out.substring(0, out.length()/2))
                .append(word)
                .append(out.substring(out.length()/2, out.length()))
                .toString();
    }

    //String-1 > theEnd
    public static String theEnd(String text, boolean first){
        if(first){
            return text.substring(0,1);
        }
        return text.substring(text.length()-1, text.length());
    }


}
