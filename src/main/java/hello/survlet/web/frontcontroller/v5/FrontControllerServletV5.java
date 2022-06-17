package hello.survlet.web.frontcontroller.v5;

import hello.survlet.web.frontcontroller.v3.controller.MemberFormControllerV3;
import hello.survlet.web.frontcontroller.v3.controller.MemberListControllerV3;
import hello.survlet.web.frontcontroller.v3.controller.MemberSaveControllerV3;
import hello.survlet.web.frontcontroller.v5.apdater.ControllerV3Adapter;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "frontControllerServletV5",urlPatterns = "/front-controller/v5/*")
public class FrontControllerServletV5 extends HttpServlet {

    private final Map<String, Object> handlerMappingMap = new HashMap<>();
    private final List<MyHandlerAdapter> handlerAdapters = new ArrayList<>();

    public FrontControllerServletV5() {
        initHandlerMappingMap();

        initHandlerAdapters();
    }

    private void initHandlerAdapters() {
        handlerAdapters.add(new ControllerV3Adapter());
    }

    private void initHandlerMappingMap() {
        handlerMappingMap.put("/front-controller/v3/members/new-form",new MemberFormControllerV3());
        handlerMappingMap.put("/front-controller/v3/members/save",new MemberSaveControllerV3());
        handlerMappingMap.put("/front-controller/v3/members",new MemberListControllerV3());
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
