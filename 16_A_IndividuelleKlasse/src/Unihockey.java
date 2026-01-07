public class Unihockey {
    //Attributes
    public int playersTotalTeam;
    public String colorTeam;
    public String nameTeam;
    public int goals;
    public int penalty;

    //Constructors
    public Unihockey (String nameTeam, String colorTeam){
        this.nameTeam=nameTeam;
        this.colorTeam=colorTeam;
    }

    public Unihockey (String nameTeam, String colorTeam,int playersTotalTeam){
        this.nameTeam=nameTeam;
        this.colorTeam=colorTeam;
        this.playersTotalTeam =playersTotalTeam;
    }


    //Methods
    public void addGoalTeam(){
        this.goals ++;
    }
    public void addGoal(short amount) {
        this.goals += amount;
    }
    public void addPenalty(){
        this.penalty +=2;
    }


    public void statistic(){
        System.out.println("Statistic team "+ nameTeam);
        System.out.println("Total goals: "+ goals);
        System.out.println(" Total Penalty minutes: "+penalty);
        System.out.println();
        System.out.println("Genereal informations "+ nameTeam);
        System.out.println(" Color: "+colorTeam+" | Total players: "+playersTotalTeam );
        System.out.println();
    }

}
