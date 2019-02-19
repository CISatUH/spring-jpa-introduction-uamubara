package main;

import org.springframework.data.repository.CrudRepository;


public interface ManagerRepository  extends CrudRepository<ManagerEntity, Integer> {

  //  ManagerEntity findFirstByName(String first_name);

    ManagerEntity findLastByName(String last_name);

}
