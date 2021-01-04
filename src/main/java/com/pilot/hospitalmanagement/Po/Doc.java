package com.pilot.hospitalmanagement.Po;


import lombok.*;
import lombok.extern.log4j.Log4j;


@Data
@Setter
@Getter
@Log4j
@NoArgsConstructor
@AllArgsConstructor
public class Doc {
    public String docID ;  //病历ID
    public String docRoom; //科室
    public String docUserSay; //患者嘱咐
    public String docCreatTime; //创建时间
    public String docFinishTime; //完成时间
    public String docStatus;    //当前状态

}
