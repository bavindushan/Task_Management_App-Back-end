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

    @ManyToOne
    @JoinColumn(name = "userId",referencedColumnName = "id",nullable = false)
    private UserEntity user;

//    @Column(nullable = false)
//    private Integer userId;

    private String description;
    private String file;
    private TaskStatus status;
}
