package com.example.zing.student.controller;

import com.example.zing.student.dao.AwardDao;
import com.example.zing.student.dao.StudentDao;
import com.example.zing.student.model.Award;
import com.example.zing.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/11/18  13:09
 */
@Controller
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private AwardDao awardDao;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object index(Model model) {

        Iterable<Student> students = studentDao.findAll();
        for (Student student : students) {
            System.out.println(student.getMajor());
        }
        model.addAttribute("students", students);

        return "index";
    }

    @RequestMapping(value = "/studentdetail", method = RequestMethod.GET)
    public Object detail(String sno, Model model) {
        System.out.println(sno + "===>sno");
        Award award = awardDao.findBySno(sno);
        String[] ind = null;
        try {
            String details = award.getDetails();
            ind = details.split(",");/*注意中文字符和因为字符的不同*/
            List<String>  detail =  new ArrayList<>();
            for (String str :ind){
                System.out.println(str);
                detail.add(str);
            }
            model.addAttribute("sname", studentDao.findBySno(sno).getSname());
            model.addAttribute("details", detail);
        } catch (Exception e) {
            e.getCause();
            model.addAttribute("sname", null);
            model.addAttribute("details", null);
            return "detail";
        }
        for (String str : ind) {
            System.out.println(str);
        }
        return "detail";
    }

    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public Object create(String  sname, Model model){

        model.addAttribute("sname",sname);
        return "create";


    }
    @RequestMapping(value = "/docreate",method = RequestMethod.POST)

    public Object  create(String sname,String award){
        Student student = studentDao.findBySname(sname);

        Award oldaward  = awardDao.findBySno(student.getSno());
        if (oldaward==null){

            Award award1 = new Award();
            award1.setDetails(award);
            award1.setSno(student.getSno());
            awardDao.save(award1);
        }
else {
    String olddetails = oldaward.getDetails();
    String newdetails = olddetails + "," + award;
    oldaward.setDetails(newdetails);
    awardDao.save(oldaward);
        }
        return "redirect:/studentdetail?sno=" + student.getSno();
    }

    @RequestMapping("/about")
    public Object about (){
        return "about";
    }
    @RequestMapping("/contact")

    public Object contact(){
        return "contact";
    }

    @RequestMapping(value = "/createStudent",method = RequestMethod.POST)
    public Object createStudent(String sno,String sname,Integer sage,String ssex,String major,String award){

        Student student = new Student();
        student.setSno(sno);
        student.setSname(sname);
        student.setSage(sage);
        student.setMajor(major);
        student.setSsex(ssex);
        studentDao.save(student);
        Award award1 = new Award();
        award1.setDetails(award);
        award1.setSno(sno);
        awardDao.save(award1);

        return "redirect:/";
    }

    @RequestMapping(value = "/createStudent",method = RequestMethod.GET)
    public Object ceratefsadf(){
        return "createStudent";
    }


    /*查询数据*/
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.POST)
    public Object value(String sno){

        return "redirect:/studentdetail?sno=" +sno;

    }

}

