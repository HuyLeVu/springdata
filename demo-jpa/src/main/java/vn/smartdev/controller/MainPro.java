package vn.smartdev.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vn.smartdev.model.Profile;
import vn.smartdev.reponsitory.ProfileRepository;


public class MainPro {

	public static void main(String[] args){
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("spring-context.xml");
		ProfileRepository profileRepository = (ProfileRepository) context.getBean("profileRepository");
		
		// find all profiles in DB
		List<Profile> profiles = profileRepository.findAll();
		for (Profile profile : profiles) {
			System.out.println(profile.toString());
		}
		
		// find a profile
		Profile profile = profileRepository.findOne("admin");
		System.out.println(profile.toString());
		
	}
}
