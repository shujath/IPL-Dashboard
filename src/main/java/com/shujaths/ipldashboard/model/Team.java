package com.shujaths.ipldashboard.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String teamName;
    private long teamMatches;
    private long totalWins;
    @Transient
    private List<Match> matches;

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public long getTeamMatches() {
        return teamMatches;
    }

    public void setTeamMatches(long teamMatches) {
        this.teamMatches = teamMatches;
    }

    public long getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(long totalWins) {
        this.totalWins = totalWins;
    }


    public Team(String teamName, long teamMatches) {
        this.teamName = teamName;
        this.teamMatches = teamMatches;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", teamMatches=" + teamMatches +
                ", totalWins=" + totalWins +
                '}';
    }

    public Team(){

    }
}
