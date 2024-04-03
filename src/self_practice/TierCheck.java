package self_practice;

public class TierCheck {
    public static String checkTier(String creditCardNumber){
        String s = creditCardNumber.replaceAll("[^0-9]", "");

        int sum = 0;

        for (int i = 0; i < s.length(); i++){
            sum = sum + Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        if (sum >= 80){
            return "Platinum";
        } else if (sum >= 60) {
            return "Gold";
        }
        else if (sum >= 40){
            return "Silver";
        }
        else {
            return "Bronze";
        }
    }
    public static void main(String[] args) {
        System.out.println(checkTier("4335-3322-1011-0000"));
    }
}
