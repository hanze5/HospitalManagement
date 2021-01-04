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
public class Prescription {
    private String preID;  //处方ID
    private Medicine preMedicines;  //药
    private int preMedicicesCnt;   //药品数量
    private Date preCreateTime;    //处方开具时间
    private String preStatus;      //药品状态
    private Pharmacist prePharmacist; // 改配方的配药师
}
