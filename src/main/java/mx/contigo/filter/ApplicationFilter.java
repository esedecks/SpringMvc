package mx.contigo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ApplicationFilter implements Filter {
	FilterConfig filterConfig = null; 
	@Override
	public void destroy() {
	System.out.println("El filtro se destruye");	
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest httpRequest = (HttpServletRequest)request; 
		HttpServletResponse httpResponse = (HttpServletResponse)response; 
//		HttpSession session = httpRequest.getSession(false); 
//		System.out.println("se detecta un request a la página");
//        String loginURI = httpRequest.getContextPath() + "/index.jsp";
//        boolean loggedIn = session != null && session.getAttribute("user") != null;
//        boolean loginRequest = httpRequest.getRequestURI().equals(loginURI);
//
//        if (loggedIn || loginRequest) {
//            chain.doFilter(request, response);
//            return; 
//        } else {
//            httpResponse.sendRedirect(loginURI);
//        }
//			
		chain.doFilter(httpRequest, httpResponse);
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		System.out.println("El filtro se inicializa");
	}
	

}
