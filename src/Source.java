import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
    int x =10;
        System.out.println(Arrays.equals(humanYearsCatYearsDogYears(x), new int[]{10, 56, 64}));
    }
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int cat=0;
        int dog=0;
        for (int i = 0; i < humanYears; i++) {
        if (i==0){
            cat+=15;
            dog+=15;
        } else if (i==1) {
            cat+=9;
            dog+=9;
        } else {cat+=4;
            dog+=5;}
       }
        return new int[]{humanYears,cat,dog};
    }
}
