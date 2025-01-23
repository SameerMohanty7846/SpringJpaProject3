package in.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userdb")
public class User {
	public User() {
		System.out.println("User.User()");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(Integer id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	@Id
	@Column(name = "user_id")
	private Integer id;
	@Column(name = "user_name")
	private String name;
	@Column(name = "user_pass")
	private String password;

}
