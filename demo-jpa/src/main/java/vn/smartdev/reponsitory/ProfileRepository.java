package vn.smartdev.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import vn.smartdev.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, String>{

	public List<Profile> findByFirstName(String firstname);
	public List<Profile> findByFirstNameAndLastName(String firstname, String lastname);
	public List<Profile> findByFirstNameOrLastName(String firstname, String lastname);
	
	
	//Annocaton query.
	/*@Query("SELECT f FROM Profile f WHERE f.firstname = :firstname")
	public List<Profile> listAllProfileByFirstname(@Param("firstname") String name);
	
	
	@Query("SELECT f FROM Profile f WHERE f.firstname = :firstname OR f.lastname = :lastname")
	public List<Profile> listAllProfileByFirstnameOrLastname(
			@Param("firstname") String firstname, @Param("lastname") String lastname);
	*/
	
	//Name query.
	//public List<Profile>  findAllProfileByFirstnameOrLastname();
}
