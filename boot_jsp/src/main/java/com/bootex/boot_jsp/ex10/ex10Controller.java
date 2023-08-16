package com.bootex.boot_jsp.ex10;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bootex.boot_jsp.ex10.service.ISimpleBbsService;

@Controller
public class ex10Controller {
    @Autowired
    ISimpleBbsService bbs;

    @RequestMapping("/ex10")
    public String root() throws Exception{
        // Service vs DAO
        return "redirect:ex10/list";
    }

    @RequestMapping("/ex10/list")
    public String userlistPage(Model model) {
//        model.addAttribute("list", dao.listDao());
        model.addAttribute("list", bbs.list());

        int nTotalCount = bbs.count();
        System.out.println("Count : " + nTotalCount);

        return "/ex10/list";
    }

    @RequestMapping("/ex10/view")
    public String view(HttpServletRequest request, Model model) {
        String sId = request.getParameter("id");
        model.addAttribute("dto", bbs.view(sId));

        return "/ex10/view";
    }

    @RequestMapping("/ex10/writeForm")
    public String writeForm() {

        return "/ex10/writeForm";
    }

    @RequestMapping("/ex10/write")
    public String write(HttpServletRequest request, Model model) {

        String sName = request.getParameter("writer");
        String sTitle = request.getParameter("title");
        String sContent = request.getParameter("content");

        Map<String, String> map = new HashMap<String, String>();
        map.put("item1", sName);
        map.put("item2", sTitle);
        map.put("item3", sContent);

        int nResult = bbs.write(map);
        System.out.println("Write : " + nResult);

        return "redirect:ex10/list";
    }

    @RequestMapping("/ex10/delete")
    public String delete(HttpServletRequest request, Model model) {
        String sId = request.getParameter("id");
        int nResult = bbs.delete(sId);
        System.out.println("Delete : " + nResult);

        return "redirect:ex10/list";
    }

}
