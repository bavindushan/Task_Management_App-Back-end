package edu.icet.dto;

import edu.icet.utill.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chat {
    private Integer id;
    private Integer ownerId;
    private UserType type;
    private String test;
}
