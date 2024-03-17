package org.TaskTracker.infrastructure.Group;

import org.TaskTracker.domain.Group.MyGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GroupRepository extends JpaRepository<MyGroup, Long> {
    Optional<MyGroup> findById(Long id);
}
