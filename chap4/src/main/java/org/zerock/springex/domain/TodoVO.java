package org.zerock.springex.domain;

import lombok.*;
import org.apache.logging.log4j.core.config.plugins.PluginNode;

import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoVO {

    private Long tno;
    private String title;
    private LocalDate dueDate;
    private String writer;
    private boolean finished;
}
