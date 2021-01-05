package com.pilot.hospitalmanagement.Po;


import lombok.*;
import lombok.extern.log4j.Log4j;

import java.util.Date;

@Data
@Setter
@Getter
@Log4j
@NoArgsConstructor
@AllArgsConstructor
public class User {

    protected String userID;
    protected String userPwd; //用户密码

    protected String userName;
    protected String userGender;
    protected Date userBirthday;
    protected String userTel;





}
