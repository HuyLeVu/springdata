package vn.smartdev.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.smartdev.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
