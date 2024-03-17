package org.TaskTracker.infrastructure.Group;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.TaskTracker.domain.Group.MyGroup;
import org.TaskTracker.domain.Group.GroupStore;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class GroupStoreImpl implements GroupStore {
    private final GroupRepository groupRepository;

    @Override
    public MyGroup store(MyGroup myGroup) {
        return groupRepository.save(myGroup);
    }
}
