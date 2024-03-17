package org.TaskTracker.domain.Group;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

public class GroupCommand {
    @Getter
    @Builder
    @ToString
    public static class RegisterGroupRequest {
        private final String title;
        private final String content;
        private final Long owner;

        public MyGroup toEntity() {
            return MyGroup.builder()
                    .title(title)
                    .content(content)
                    .owner(owner)
                    .build();
        }
    }
}
