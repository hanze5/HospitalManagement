package com.pilot.hospitalmanagement.Po;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.*;
import lombok.extern.log4j.Log4j;

@Data
@Setter
@Getter
@Log4j
@NoArgsConstructor
@AllArgsConstructor
public class Doctor extends User{

    private String room;       //所属科室
    private Bool isExpert;     //是否是专家
    private String status;     //当前状态
    private String dAppointmentTime; //可预约时间
    private Integer dAppointmentLimit; //预约限制人数


}
