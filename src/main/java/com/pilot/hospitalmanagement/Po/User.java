package com.pilot.hospitalmanagement.Po;


import lombok.*;
import lombok.extern.log4j.Log4j;

@Data
@Setter
@Getter
@Log4j
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String userID;
    private String userPwd; //用户密码

    private String userName;
    private String userGender;
    private String userBirthday;
    private String userTel;





}
