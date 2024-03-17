package org.TaskTracker.application.Group;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.TaskTracker.domain.Group.GroupCommand;
import org.TaskTracker.domain.Group.GroupInfo;
import org.TaskTracker.domain.Group.GroupService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class GroupFacade {
    private final GroupService groupService;

    public Long registerGroup(GroupCommand.RegisterGroupRequest request) {
        var groupId = groupService.registerGroup(request);
        return groupId;
    }

    public GroupInfo.Main retrieveGroupInfo(Long id) {
        return groupService.retrieveGroupInfo(id);
    }
}
