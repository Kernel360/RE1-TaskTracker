package org.TaskTracker.interfaces.Group;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.TaskTracker.application.Group.GroupFacade;
import org.TaskTracker.common.response.CommonResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/group")
public class GroupApiController {
    private final GroupFacade groupFacade;
    private final GroupDtoMapper groupDtoMapper;

    @PostMapping
    public CommonResponse registerGroup(@RequestBody @Valid GroupDto.RegisterGroupRequest request) {
        var groupCommand = groupDtoMapper.of(request);
        var groupId = groupFacade.registerGroup(groupCommand);
        var response = groupDtoMapper.of(groupId);
        return CommonResponse.success(response);
    }
}
