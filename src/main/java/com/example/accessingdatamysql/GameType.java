package com.example.accessingdatamysql;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class GameType implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private double game_price;

	@Column(unique = true)
	private String game_type;



	@OneToMany(mappedBy = "gameType", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	private Set<Company> companies;

	public GameType() {
	}

	public GameType(String oil_type, double stock_volume) {
		this.game_type = oil_type;
		this.game_price = stock_volume;
	}

	@Override
	public String toString() {
		return "GameType{" +
				"id=" + id +
				", game_type='" + game_type + '\'' +
				", game_price=" + game_price +
				'}';
	}


}