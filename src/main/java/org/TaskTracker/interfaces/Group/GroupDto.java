package org.TaskTracker.interfaces.Group;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class GroupDto {

    @Getter
    @Setter
    @ToString
    public static class RegisterGroupRequest {
        private String title;
        private String content;
        private Long owner;
    }

    @Getter
    @Builder
    @ToString
    public static class RegisterResponse {
        private final Long id;
    }

    @Getter
    @Builder
    @ToString
    public static class Main {
        private final String title;
        private final String content;
        private final Long owner;
    }
}
