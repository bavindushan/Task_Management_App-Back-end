package edu.icet.dto;

import edu.icet.utill.TaskStatus;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Task {
    private Integer id;
    private Integer userId;
    private String description;
    private String file;
    private TaskStatus status;
}
