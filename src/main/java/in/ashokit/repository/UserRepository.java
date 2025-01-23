package in.ashokit.repository;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
