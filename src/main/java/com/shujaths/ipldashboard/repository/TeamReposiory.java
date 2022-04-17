package com.shujaths.ipldashboard.repository;

import com.shujaths.ipldashboard.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamReposiory extends CrudRepository<Team, Long> {

    Team findByTeamName(String teamName);
}
