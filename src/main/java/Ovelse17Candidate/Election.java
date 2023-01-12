package Ovelse17Candidate;

import java.util.ArrayList;

public class Election {

    Candidate candidate1 = new Candidate("Elleman", "Venstre", 100);
    Candidate candidate2 = new Candidate("Søren Pape", "Konservative", 50);

    ArrayList <Candidate> candidateArrayList = new ArrayList<>();

    public int getTotalVotes(){
        int sum = 0;
        candidateArrayList.add(candidate1);
        candidateArrayList.add(candidate2);

        sum = candidate1.getNumberOfVotes() + candidate2.getNumberOfVotes();
        System.out.println("Stemmer i alt: " + sum);
        return sum;
    }

    public ArrayList<Candidate> getCandidatesFromParty() {
        for (Candidate candidate : candidateArrayList) {
            System.out.println(candidate);
            return candidateArrayList;
        }
        return null;
    }

    @Override
    public String toString() {
        return "{1.Candidate: " + candidate1 +
                "} {2.Candidate: " + candidate2 +
                "} CandidateArrayList: " + candidateArrayList;
    }
}
