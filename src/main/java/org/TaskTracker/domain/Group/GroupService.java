package org.TaskTracker.domain.Group;

public interface GroupService {
    Long registerGroup(GroupCommand.RegisterGroupRequest request);
    GroupInfo.Main retrieveGroupInfo(Long id);
}
