package hello.survlet.web.frontcontroller.v3.controller;

import hello.survlet.basic.Member;
import hello.survlet.basic.MemberRepository;
import hello.survlet.web.frontcontroller.ModelView;
import hello.survlet.web.frontcontroller.v3.ControllerV3;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public ModelView process(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();

        ModelView modelView = new ModelView("members");
        modelView.getModel().put("members",members);
        return modelView;
    }
}
