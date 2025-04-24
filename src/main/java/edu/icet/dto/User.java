package edu.icet.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private Integer id;
    private String firstName;
    private String secondName;
    private String nic;
    private String telNo;
}
