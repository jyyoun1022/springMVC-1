package hello.survlet.web.frontcontroller.v4;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public interface ControllerV4 {
    /**
     * @param paramMap
     * @param model
     * @return viewName
     */
    String process(Map<String,String> paramMap,Map<String,Object>model);

    void service(HttpServletRequest request, HttpServletResponse
            response)
            throws ServletException, IOException;
}
