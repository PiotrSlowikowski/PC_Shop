package pl.company;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import pl.company.filter.LoginFilter;

import javax.servlet.*;

public class AppInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext ctx =
                new AnnotationConfigWebApplicationContext();
        ctx.register(AppConfig.class);
        ctx.setServletContext(servletContext);
        ServletRegistration.Dynamic servlet =
                servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");

        //rejestracja filtra
        FilterRegistration.Dynamic loginFilter = servletContext.addFilter("loginFilter", new LoginFilter());
        loginFilter.addMappingForUrlPatterns(null,true,"/app/*"); // /* dla wszystkich adresow sie filter uruchomi  /home tylko home controller bedzie lapac
    }
}