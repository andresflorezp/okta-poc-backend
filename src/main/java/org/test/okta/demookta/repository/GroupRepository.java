package org.test.okta.demookta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.okta.demookta.model.Group;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByName(String name);
}