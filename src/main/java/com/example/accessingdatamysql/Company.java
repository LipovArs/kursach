package com.example.accessingdatamysql;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Company implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String owner_surname;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private GameType gameType;

	public Company() {
	}

	public Company(String Name, String email, GameType gameType) {
		this.name = Name;
		this.owner_surname = email;
		this.gameType = gameType;
	}

	@Override
	public String toString() {
		return "Company{" +
				"id=" + id +
				", name='" + name + '\'' +
				", owner_surname='" + owner_surname + '\'' +
				", game=" + gameType +
				'}';
	}
}