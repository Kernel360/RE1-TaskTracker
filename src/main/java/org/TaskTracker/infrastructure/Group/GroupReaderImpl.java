package org.TaskTracker.infrastructure.Group;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.TaskTracker.domain.Group.MyGroup;
import org.TaskTracker.domain.Group.GroupReader;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class GroupReaderImpl implements GroupReader {
    private final GroupRepository groupRepository;

    @Override
    public MyGroup getGroupBy(Long id) {
        return groupRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }
}
