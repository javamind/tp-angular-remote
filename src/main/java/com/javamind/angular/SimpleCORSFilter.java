package com.javamind.angular;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * {@link }
 *
 * @author EHRET_G
 */
@Component
public class SimpleCORSFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, HEAD, OPTIONS, DELETE");
        response.setHeader("Access-Control-Allow-Headers", "Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
        response.setHeader("Access-Control-Expose-Headers", "Access-Control-Allow-Origin,Access-Control-Allow-Credentials,Accept");
        response.setHeader("Access-Control-Max-Age", "3600");
        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {

    }
}
