package com.example.demo.controller;

import com.example.demo.data.Dept;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping("/hello")
    public ResponseEntity getHello() {
        String hello = "Hello world";

        return new ResponseEntity<>(hello, HttpStatus.OK);
    }

    @NoArgsConstructor
    @Setter
    @Getter
    public class Member {

        private long sabun;
        private String name;
        private String dept_cd;
        private String dept_nm;
        private String role_cd;
        private String role_nm;

    }
    @GetMapping("/member/1")
    public ResponseEntity getMember() {

        Member member = new Member();
        member.setSabun(1);
        member.setName("hong gildong");
        member.setDept_cd("CS001023004");
        member.setDept_nm("컨테이너 실습");
        member.setRole_cd("EEF9852");
        member.setRole_nm("STUDENT");

        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    @GetMapping("/dept/1")
    public ResponseEntity getDept() {

       Dept dept = new Dept();
        dept.setId(1);
        dept.setDept_cd("CS001023004");
        dept.setDept_nm("컨테이너 실습");
        dept.setLevel(3);
        dept.setRel_dept_cd("CS0010230000");
        dept.setRel_dept_nm("수강생대표팀");

        return new ResponseEntity<>(dept, HttpStatus.OK);
    }
}
