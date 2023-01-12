package Ovelse17Candidate;

public class Main {
    public static void main(String[] args) {
        Election election = new Election();

        election.getCandidatesFromParty();
        System.out.println(election);

        election.getTotalVotes();
    }
}
