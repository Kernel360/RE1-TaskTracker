package org.TaskTracker.domain.Group;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.TaskTracker.domain.BaseEntity;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "my_group")
public class MyGroup extends BaseEntity {
    private static final String GROUP_PREFIX = "gp_";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private Long owner;

    @Builder
    public MyGroup(String title, String content, Long owner) {
        this.title = title;
        this.content = content;
        this.owner = owner;
    }

}
