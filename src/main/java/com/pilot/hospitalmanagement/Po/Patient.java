package com.pilot.hospitalmanagement.Po;

import lombok.*;
import lombok.extern.log4j.Log4j;

@Data
@Setter
@Getter
@Log4j
@NoArgsConstructor
@AllArgsConstructor
public class Patient extends User{
    private String userAddress;     //病人住址
    private String userHistoryIllness; //病史

    private boolean isValid;    //有效位
}
