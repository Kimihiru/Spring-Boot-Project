package org.application.controller;

import org.application.entity.Person;
import org.application.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * @author Sakura
 */
@Controller
@RequestMapping(value = "/aop")
public class LoginController {
    List<Person> list=new ArrayList<Person>();
    Integer flag=1;
    @Autowired
    PersonService personService;
    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/r")
    public String doSave(@ModelAttribute Person person, HttpSession session){
        person.setUid(person.getUid());
        person.setUname(person.getUname());
        person.setAge(person.getAge());
        person.setArea_no(person.getArea_no());
        System.out.println("健康码-key y/n:");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        while (true){
            if ("n".equals(str)){
                person.setJkm("n");
                str=person.getJkm();
                session.setAttribute("str",str);
                list.add(person);
                session.setAttribute("list",list);
                System.out.println(list);
                if(list.size()==3){
                    personService.insertByRedis(String.valueOf(flag),list);
                    flag++;
                    System.out.println("已保存至redis");
                    list.clear();
                }
                break;
            }else if ("y".equals(str)){
                System.out.println("阴性!,提交至mysql数据库");
                person.setJkm("y");
                str=person.getJkm();
                session.setAttribute("str",str);
                session.setAttribute("person",person);
                personService.save(person);
                break;
            }
        }
        System.out.println("Aop拦截成功");
        return "r";
    }

    @RequestMapping(value = "err")
    public String error(){
        return "err";
    }

    @RequestMapping(value = "/redis")
    public String doRedis(@ModelAttribute Person person, HttpSession session){
        Scanner scanner=new Scanner(System.in);
        System.out.println("key:");
        String key=scanner.nextLine();
        List<Person> list=personService.findByRedis(key);
        System.out.println("flag 阴性/阳性:");
        String flag=scanner.nextLine();
        while(true){
            if("阳性".equals(flag)){
                System.out.println("健康码不通过，不能提交");
                System.out.println("Aop拦截成功");
                return "err";
            }else if("阴性".equals(flag)){
                System.out.println("阴性!,提交至mysql数据库");
                for(Person person1:list){
                    person1.setJkm("y");
                }
                flag=person.getJkm();
                session.setAttribute("flag",flag);
                session.setAttribute("list",list);
                personService.add(list);
                personService.deleteByRedis(key);
                break;
            }
        }
        System.out.println("Aop拦截成功");
        return "err";
    }
}
