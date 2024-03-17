package org.TaskTracker.domain.Group;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupService {
    private final GroupReader groupReader;
    private final GroupStore groupStore;

    @Override
    @Transactional
    public Long registerGroup(GroupCommand.RegisterGroupRequest command) {
        var initGroup = command.toEntity();
        var group = groupStore.store(initGroup);
        return group.getId();
    }

    @Override
    @Transactional()
    public GroupInfo.Main retrieveGroupInfo(Long id) {
        var group = groupReader.getGroupBy(id);
        return new GroupInfo.Main(group);
    }


}
