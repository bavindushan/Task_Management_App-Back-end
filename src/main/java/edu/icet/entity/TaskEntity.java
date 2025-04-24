package edu.icet.entity;

import edu.icet.utill.TaskStatus;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "task")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany
    @JoinColumn(name = "userId",referencedColumnName = "id",nullable = false)
    private UserEntity user;

    private String description;
    private String file;
    private TaskStatus status;
}
