package LogicExercises;

public class Logic {
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (speed <= 60) {
            return 0;
        } else if (speed < 80) {
            if (isBirthday == true) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (isBirthday == true) {
                return 1;
            } else {
                return 2;
            }

        }
    }
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend == true){
            if (cigars >= 40){
                return true;
            }
            else{
                return false;
            }
        }
        else {
            if (cigars >=40 && cigars <= 60)  {
                return true;
            }
            else {
                return false;
            }


        }
    }
    public static boolean ordered(int d1, int d2, int d3) {
        /*
        if (d1 > d2 && d2 > d3) {
            return true;
        }
        else if (d1 < d2 && d2 < d3){
            return true;
        }
        else {
            return false;
        }
         */
        return (d1 < d2 && d2 < d3) || (d3 < d2 && d2 <d1);
    }
    public static void main(String [] args) {
        System.out.println(caughtSpeeding(60,false)==0);
        System.out.println(caughtSpeeding(65,false)==1);
        System.out.println(caughtSpeeding(65,true)==0);
        System.out.println(caughtSpeeding(81,false)==2);
        System.out.println(caughtSpeeding(81,true)==1);
        System.out.println(cigarParty(30,false)==false);
        System.out.println(cigarParty(50,false)==true);
        System.out.println(cigarParty(70,true)==true);
        System.out.println(ordered(1,2,3));
        System.out.println(ordered(3,2,3));

    }
}
