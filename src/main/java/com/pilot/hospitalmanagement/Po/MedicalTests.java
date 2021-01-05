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
public class MedicalTests {
    private String cID;           //检查项目ID
    private String cDescription;  //检查描述
    private Date cCreatTime;    //创建时间
    private double cAccount;        //共需金额
}
