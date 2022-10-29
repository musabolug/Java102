package Collection.Exercise2;

import java.util.*;

public class Teams {



    //If an odd number of team lists are entered, it adds another team named "Bay" team complete the even number.
    public void ligFixturePrint(){
        List<String>  teamList = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        System.out.print("How Many teams do you want to enter? :");
         int numberOfTeams = scn.nextInt();
        for (int team = 1; team <= numberOfTeams; team++){
            System.out.print(team+". team Name :");
            String teamNames = scn.next();
            teamList.add(teamNames);
        }
        if (numberOfTeams%2 != 0){
            teamList.add("Bay");
        }
        //Prints the team list.
        if (teamList.size()!= 0){
            System.out.println("Teams");
            for (String teams : teamList){
                System.out.println("-"+teams);
            }
        }
        else {
            System.out.println("there is no team value Please enter Teams! ");
        }

        List<String> teamListWeak = new ArrayList<>();

        //Adds the team list team the temporary list.

        List<String> tempList = new ArrayList<>(teamList);

        while (0<teamList.size()){
            int index = (int)(Math.random()*tempList.size());
            tempList.add(teamList.get(index));
            teamList.remove(tempList.get(index));
        }
        teamList = tempList;
        int totalRound = numberOfTeams-1;
        int numMatchPerRound = numberOfTeams/2;

        LinkedHashMap<String, ArrayList<ArrayList<String>>> rounds = new LinkedHashMap<>();

        for (int i = 0;i<totalRound; i++){
            String round = String.valueOf(i+1);
            rounds.put(round,new ArrayList<ArrayList<String>>());
        }
        for (int j = 0;j<totalRound;j++){
            ArrayList<String> away = new ArrayList<>();
            ArrayList<String> home = new ArrayList<>();

            for (int k = 0;k<totalRound;k++){
                home.add(teamList.get(k));
                away.add(teamList.get((numberOfTeams - 1) - k));
            }
            String round = String.valueOf(j+1);
            rounds.get(round).add(home);
            rounds.get(round).add(away);

            List<String> newTeams = new ArrayList<>();

            newTeams.add(teamList.get(0));
            newTeams.add(teamList.get(numberOfTeams-1));

            for(int l = 1; l<teamList.size();l++){
                newTeams.add(teamList.get(l));
            }
            teamList = newTeams;
        }
        System.out.println();

        for (int i = 0; i<=2*totalRound;i++){
            System.out.println("Round "+i+1);
            for (int j = 0;j<=numMatchPerRound;j++){
                if (i<=totalRound){
                    System.out.println(rounds.get(String.valueOf(i+1)).get(0).get(j)+ " vs " +rounds.get(String.valueOf(i+1)).get(1).get(j));
                }
                else {
                    System.out.println(rounds.get(String.valueOf(i+1-totalRound)).get(1).get(j)+" vs "+ rounds.get(String.valueOf(i+1-totalRound)).get(0).get(j) );

                }

            }
            System.out.println();
        }


    }




}
