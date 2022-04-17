package com.shujaths.ipldashboard.controller;

import com.shujaths.ipldashboard.model.Team;
import com.shujaths.ipldashboard.repository.MatchRepository;
import com.shujaths.ipldashboard.repository.TeamReposiory;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    private TeamReposiory teamReposiory;
    private MatchRepository matchRepository;
    public TeamController(TeamReposiory teamReposiory,MatchRepository matchRepository) {
        this.teamReposiory = teamReposiory;
        this.matchRepository = matchRepository;
    }

    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName){
        Team team = this.teamReposiory.findByTeamName(teamName);
        team.setMatches(matchRepository.findLatestMatchesByTeam(teamName,4));
        return team;
    }
}
