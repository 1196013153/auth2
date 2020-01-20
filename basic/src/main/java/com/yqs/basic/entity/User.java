package com.yqs.basic.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;
import java.util.Date;

/**
 * @program: auth2
 * @description:
 * @author: yqs
 * @create: 2019-10-31 11:30
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private int age;
    private Date time;
}