package A1;

public class ZadankaJJ {

    public static int makeChocolate(int small, int big,  int goal){
        int reszta = goal/5;
        if(reszta>big){
            return -1;
        }else if(reszta<small){
            return reszta;
        }
        return -1;
    }

    public static boolean closeFar(int a, int b, int c){
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);


        if((b+1==a || b-1==a) && (c>=a+2 || c<=a+2)){
            return true;

        }else return (c + 1 == a || c - 1 == a) && (b >= a + 2 || b <= a + 2);
    }


    public static boolean arrayFront9(int[] nums){
        if(nums.length<4) {
            for (int num : nums) {
                if (num == 9) {
                    return true;
                }


            }
            return false;
        }
        else {
            for (int i=0; i<4 ;i++) {
                if(nums[i] == 9){
                    return true;
                }
            }

        }
        return false;

    }


}
