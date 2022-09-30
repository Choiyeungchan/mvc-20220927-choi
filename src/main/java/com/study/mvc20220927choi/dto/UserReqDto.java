package com.study.mvc20220927choi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserReqDto {
    private String username;
    private String password;
    private String name;
    private String email;

}
