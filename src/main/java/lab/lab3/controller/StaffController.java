package lab.lab3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lab.lab3.entity.Staff;

import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {

    @RequestMapping("/detail")
    public String detail(Model model) {
        Staff staff = Staff.builder()
                .id("hungprokj@gmail.com")
                .fullname("Đinh Duy Việt HÙng")
                .level(2)
                .birthday(new java.util.Date(2003 - 1900, 7 - 1, 10))
                .build();
        model.addAttribute("staff", staff);
        return "staff-detail";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<Staff> list = getStaffList();
        model.addAttribute("list", list);
        return "staff-list";
    }

    @RequestMapping("/list-status")
    public String listStatus(Model model) {
        List<Staff> list = getStaffList();
        model.addAttribute("list", list);
        return "list-status";
    }

    @RequestMapping("/list-controls")
    public String listControls(Model model) {
        List<Staff> list = getStaffList();
        model.addAttribute("list", list);
        return "list-controls";
    }

    private List<Staff> getStaffList() {
        return List.of(
                Staff.builder().id("user1@gmail.com").fullname("nguyễn văn user1").level(0).build(),
                Staff.builder().id("user2@gmail.com").fullname("nguyễn văn user2").level(1).build(),
                Staff.builder().id("user3@gmail.com").fullname("nguyễn văn user3").level(2).build(),
                Staff.builder().id("user4@gmail.com").fullname("nguyễn văn user4").level(2).build(),
                Staff.builder().id("user5@gmail.com").fullname("nguyễn văn user5").level(1).build(),
                Staff.builder().id("user6@gmail.com").fullname("nguyễn văn user6").level(0).build());
    }
}