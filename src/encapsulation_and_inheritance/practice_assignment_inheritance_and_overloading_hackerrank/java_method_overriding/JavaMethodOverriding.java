package encapsulation_and_inheritance.practice_assignment_inheritance_and_overloading_hackerrank.java_method_overriding;

// https://www.hackerrank.com/challenges/java-method-overriding/problem

class Sports{

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    // Write your overridden getNumberOfTeamMembers method here

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in Soccer Class");
    }

}

public class JavaMethodOverriding {
    public static void main(String[] args) {
        Sports sports = new Sports();
        Soccer soccer = new Soccer();

        System.out.println(sports.getName());
        sports.getNumberOfTeamMembers();

        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();

    }
}
