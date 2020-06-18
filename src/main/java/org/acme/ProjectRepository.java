package org.acme;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface ProjectRepository extends Repository<Project, Long> {
    List<Project> findAllByOrganization(String organization);
}
