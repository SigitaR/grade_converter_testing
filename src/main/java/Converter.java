/**
 * Created by Sigute on 4/30/2019.
 */
public class Converter {
    //returning an array due to multiple grades having the same mapping value

    public static int[] convertDKto10(int x) {
        switch (x) {
            case 12:
                return new int[]{10};
            case 10:
                return new int[]{9};
            case 7:
                return new int[]{8};
            case 4:
                return new int[]{7};
            case 2:                         //using "2" instead of "02", in order, to make our lives easier
                return new int[]{6, 5};
            case 0:                         //using "0" instead of "00", in order, to make our lives easier
                return new int[]{4};
            case -3:
                return new int[]{3, 2, 1};
            default:
                return null;                //for non-valid grades we return non-existing value
        }
    }


    public static int convert10toDK(int x) {
        switch (x) {
            case 10:
                return 12;
            case 9:
                return 10;
            case 8:
                return 7;
            case 7:
                return 4;
            case 6:
                return 2;       //using "2" instead of "02", in order, to make our lives easier
            case 5:
                return 2;       //using "2" instead of "02", in order, to make our lives easier
            case 4:
                return 0;       //using "0" instead of "00", in order, to make our lives easier
            case 3:
                return -3;
            case 2:
                return -3;
            case 1:
                return -3;
            default:
                return -999;     //for non-valid grades we return non-existing value
        }
    }
}
