package pl.company.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        Boolean loggedIn = (Boolean) httpServletRequest.getSession(true).getAttribute("loggedIn"); // gdy ktos uruchomi 1st raz nasza aplikacja to zostanie utworzona sesja i pobierzemy atrybut z sesji o nazwie loggedin

        if (loggedIn != null && loggedIn) {
            chain.doFilter(request, response);
        } else {
            httpServletResponse.sendRedirect("/login");
        }


        chain.doFilter(request, response);


    }

    public void destroy() {

    }

}
