package org.TaskTracker.domain.Group;

import lombok.Getter;
import lombok.ToString;

public class GroupInfo {

    @Getter
    @ToString
    public static class Main {
        private final String title;
        private final String content;
        private final Long owner;

        public Main(MyGroup myGroup) {
            this.title = myGroup.getTitle();
            this.content = myGroup.getContent();
            this.owner = myGroup.getOwner();
        }
    }
}
