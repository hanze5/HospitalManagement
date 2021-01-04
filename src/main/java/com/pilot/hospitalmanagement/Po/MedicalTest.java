package com.pilot.hospitalmanagement.Po;

import lombok.*;
import lombok.extern.log4j.Log4j;

@Data
@Setter
@Getter
@Log4j
@NoArgsConstructor
@AllArgsConstructor
public class MedicalTest {
    private String cID;           //检查项目ID
    private String cName;         //检查项目名
    private double cPrice;        //所需金额
    private String cDescription;  //项目描述
//    private Date cCheckTime;    //检查时间
}
