package com.ling1.springmvc.lobby;

import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import com.ling1.springmvc.match.Match;
import com.ling1.springmvc.user.User;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Lobby {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer id;

	@ManyToOne
	@JoinColumn(name ="game_id")
	private GameEnum game;

	@OneToMany
	@Size(min=0, max=4)
	private Collection<User> players;

	@OneToMany
	private Collection<User> kickedPlayers;

	@OneToOne(optional=true)
	private User host;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "lobby")
	private Set<Match> matches;
}
