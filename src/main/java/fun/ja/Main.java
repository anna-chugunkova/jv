package fun.ja;

/**
 * Created by chugunkova_a on 04/02/2017.
 */

public class Main {

    public static void main(String[] args) {
        choirs();
        locations("Copenhagen");
        int returnedLikes = likesCounter(0, "great!", true);
        int totalLikes = likesCounter(returnedLikes, "Comment--", true);
        double itemcost = Math.random()*100;
        double totalMoney = Math.random()*100;
        System.out.println(returnCash((int) itemcost, (int) totalMoney));
        System.out.println("Dice6 is:" + rollDice(6));
        System.out.println("Dice10 is:" + rollDice(10));
        System.out.println("Dice18 is:" + rollDice(18));
    }

    public static void choirs(){
        System.out.println("Hey Hey");
        System.out.println("I'm down");
    }

    public static void locations(String location){
        System.out.println("Hello, "+ location);
    }

    public static int likesCounter(int likes, String feedBack, boolean isOn){
        System.out.println("The comment is: " + feedBack);
        if (isOn){
            likes += 1;
        }
        System.out.println("Number of likes: "+ likes);
        return likes;
    }

    public static double returnCash(double itemCost, double totalMoney){
        double moneyBack = totalMoney-itemCost;
        if (moneyBack>0){
            System.out.println("The cash back is: ");
        }else {
            System.out.println("No money should be returned");
        }
        return moneyBack;
    }

    /**
     * @param sides
     * @
     *
     * @return
     */

    public static int rollDice(int sides){
        double dice = Math.random()*sides;
        int newDice=(int)dice+1;
        return newDice;
    }

}
