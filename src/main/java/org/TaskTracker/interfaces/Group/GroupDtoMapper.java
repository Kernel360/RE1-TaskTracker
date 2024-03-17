package org.TaskTracker.interfaces.Group;

import org.TaskTracker.domain.Group.GroupCommand;
import org.TaskTracker.domain.Group.GroupInfo;
import org.mapstruct.*;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface GroupDtoMapper {

    // register
    GroupCommand.RegisterGroupRequest of(GroupDto.RegisterGroupRequest request);

    GroupDto.RegisterResponse of(Long id);

    // retrieve
    GroupDto.Main of(GroupInfo .Main main);

}
