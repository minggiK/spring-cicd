package com.example.demo.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Dept {
    private int id;
    private String dept_cd;
    private String dept_nm;
    private int level;
    private String rel_dept_cd;
    private String rel_dept_nm;
}
