package com._3dhs.tnproject.manager.controller;

import com._3dhs.tnproject.manager.dto.ReportDTO;
import com._3dhs.tnproject.manager.service.ReportService;
import com._3dhs.tnproject.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class ManagerController {

    private final ReportService reportService;
    private final MessageSourceAccessor messageSourceAccessor;


    //회원 로그인 페이지가 만들어지면 그쪽으로 경로 변경해주기
    @GetMapping("/manager/m-log")
    public void loginMag() {

    }

    //로그인 오류시 나올 페이지랑 연동시키긔.... 경로 경로 경로-_-
    @GetMapping("/manager/loginfail")
    public String loginFailed(RedirectAttributes rttr) {
        rttr.addFlashAttribute("message", messageSourceAccessor.getMessage("error.login"));
        return "redirect:/manager/manage-log";
    }

    @GetMapping("/manager/m-timeline")
    public void MagTimeline() {

    }

    @GetMapping("/manager/report/list")
    public void viewAllReportList(Model model) {

        List<ReportDTO> reportList = reportService.viewAllReport();
        model.addAttribute("reportList", reportList);

    }

    @GetMapping("/manager/report")
    public String viewOneReport(Model model, Integer reportCode) {
        ReportDTO report = reportService.viewOneReport(reportCode);
        model.addAttribute("viewOneReport", report);
        // 페이지가 로딩될 때 값이 들어와야 한다.

        return"/manager/report/detail";
}





@GetMapping("/detail")
public String insertRecord(Model model, Integer reportCode, RedirectAttributes rttr) {

    // 신고 목록 상세에서 내역을 입력해서 완료 버튼을 누르면 해당 내용이 디비에 저장하는 기능

    ReportDTO record = reportService.insertRecord(reportCode);
    model.addAttribute("insertRecord", record);


    //

    //오호.....???? 윗 코드가 잘못된건가 에에?



    //훌라훌라훌라~~~~ 훌라훌라후~~울라



    //변경된 값을 객체에 담아 디비에 보내준다..?

    //

    rttr.addFlashAttribute("insertRecord");


    return "redirect:/manager/report/list";

}

//    @GetMapping("/")
//    public String failedInsert(Model model, Integer reportCode, RedirectAttributes rttr) {
//
//        // 신고 목록 상세에서 내역을 입력해서 디비에 저장하는 기능
//        //insetRC 페이지랑 어떻게 연동을 해야 하는가..
//        //detail 페이지랑 연동해서, detail 페이지에서 버튼 기능 추가하면 되는거 아닌가...
//        //디비에 저장되는 기능이랑, 버튼을 눌렀을 때 알럿창이 뜨는 거는 기능?????을 분리해야 되지 않나. => 기능이라고 묶는 것도 좀..
//
//        //객체를 디비에 보내서 값을 입력하고, 완료 했을 경우 알럿 창으로 띄우게 만드는 기능.
//
//        ReportDTO record = reportService.insertRecord(reportCode);
//        model.addAttribute("insertRecord", record);
//
//        //변경된 값을 객체에 담아 디비에 보내준다..?
//
//        return "redirect:/manager/report/list";
//    }

}


//    @GetMapping("admin")
//    public String adminP() {
//        return "admin";
//    }
//
//}
