package hello.survlet.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import hello.survlet.basic.HelloData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "responseJsonServlet",urlPatterns = "/response-json")
public class ResponseJsonServlet extends HttpServlet {

    private ObjectMapper objectMapper= new ObjectMapper();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Content-Type : application/json
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");

        HelloData helloData = new HelloData();
        helloData.setUsername("재열");
        helloData.setAge(27);

        //{"username" : "재열"."age" : 27}
        String result = objectMapper.writeValueAsString(helloData);//객체를 JOSN 문자열로 변경!

        response.getWriter().write(result);

    }
}
