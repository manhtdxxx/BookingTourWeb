/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.96
 * Generated at: 2024-11-14 06:43:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.KhachHang;

public final class changePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.KhachHang");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"vi\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>Đổi mật khẩu</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("/* Background gradient */\r\n");
      out.write("body {\r\n");
      out.write("	background: linear-gradient(to right, #89f7fe, #66a6ff);\r\n");
      out.write("	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("/* Form container styling */\r\n");
      out.write(".form-container {\r\n");
      out.write("	max-width: 450px;\r\n");
      out.write("	padding: 2.5rem;\r\n");
      out.write("	background-color: #ffffff;\r\n");
      out.write("	border-radius: 12px;\r\n");
      out.write("	box-shadow: 0 8px 24px rgba(0, 0, 0, 0.2);\r\n");
      out.write("	margin: 0 1.5rem;\r\n");
      out.write("	transition: transform 0.3s ease;\r\n");
      out.write("	min-width: 400px;\r\n");
      out.write("	position: relative;\r\n");
      out.write("}\r\n");
      out.write("/* Hover effect on container */\r\n");
      out.write(".form-container:hover {\r\n");
      out.write("	transform: scale(1.02);\r\n");
      out.write("}\r\n");
      out.write("/* Header style */\r\n");
      out.write("h2 {\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	color: #343a40;\r\n");
      out.write("}\r\n");
      out.write("/* Labels styling */\r\n");
      out.write(".form-label {\r\n");
      out.write("	color: #495057;\r\n");
      out.write("	font-weight: 600;\r\n");
      out.write("}\r\n");
      out.write("/* Input fields styling */\r\n");
      out.write(".form-control {\r\n");
      out.write("	border: 2px solid #ced4da;\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("	padding: 0.5rem;\r\n");
      out.write("	transition: border-color 0.3s ease, box-shadow 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-control:focus {\r\n");
      out.write("	border-color: #66a6ff;\r\n");
      out.write("	box-shadow: 0 0 8px rgba(102, 166, 255, 0.3);\r\n");
      out.write("}\r\n");
      out.write("/* Button styling */\r\n");
      out.write(".btn-primary {\r\n");
      out.write("	background-color: #66a6ff;\r\n");
      out.write("	border-color: #66a6ff;\r\n");
      out.write("	padding: 0.6rem;\r\n");
      out.write("	font-size: 1.1rem;\r\n");
      out.write("	font-weight: 600;\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("	transition: background-color 0.3s, box-shadow 0.3s, transform 0.2s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-primary:hover {\r\n");
      out.write("	background-color: #0056b3;\r\n");
      out.write("	box-shadow: 0 6px 16px rgba(0, 91, 187, 0.4);\r\n");
      out.write("	transform: translateY(-2px);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"d-flex align-items-center justify-content-center vh-100\">\r\n");
      out.write("\r\n");
      out.write("	");

	Object obj = session.getAttribute("khachHang");
	KhachHang khachHang = null;

	if (obj != null) {
		khachHang = (KhachHang) obj;
	}

	if (khachHang == null) {
	
      out.write("\r\n");
      out.write("	<div class=\"alert alert-danger text-center py-4 px-5 shadow-lg rounded-pill\" role=\"alert\"\r\n");
      out.write("		aria-live=\"assertive\">\r\n");
      out.write("		<h1 class=\"display-5 fw-normal\">\r\n");
      out.write("			Bạn cần đăng nhập <br> để truy cập trang này!\r\n");
      out.write("		</h1>\r\n");
      out.write("		<div class=\"mt-4\">\r\n");
      out.write("			Vui lòng quay lại <a href=\"index.jsp\" class=\"fw-bolder text-primary text-decoration-underline\">trang\r\n");
      out.write("				chủ</a>.\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"mt-1\">\r\n");
      out.write("			Hoặc truy cập <a href=\"login.jsp\" class=\"fw-bold text-primary text-decoration-underline\">trang\r\n");
      out.write("				đăng nhập</a> để tiếp tục.\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	");

	} else {
	String error = (String) request.getAttribute("error");
	String success = (String) request.getAttribute("success");

	error = (error != null) ? error : "";
	success = (success != null) ? success : "";
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"form-container\">\r\n");
      out.write("		<h1 class=\"text-center mb-4\">Đổi Mật Khẩu</h1>\r\n");
      out.write("\r\n");
      out.write("		<!-- Error/Success Message -->\r\n");
      out.write("		");

		if (!error.isEmpty()) {
		
      out.write("\r\n");
      out.write("		<div class=\"alert alert-danger alert-dismissible fade show\" role=\"alert\">\r\n");
      out.write("			<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\"></button>\r\n");
      out.write("			<strong>Lỗi: </strong>\r\n");
      out.write("			");
      out.print(error);
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		");

		}

		if (!success.isEmpty()) {
		
      out.write("\r\n");
      out.write("		<div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\">\r\n");
      out.write("			<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\"></button>\r\n");
      out.write("			<strong>Thành công: </strong>\r\n");
      out.write("			");
      out.print(success);
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		");

		request.removeAttribute("success");
		}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<form action=\"change-password\" method=\"post\">\r\n");
      out.write("			<div class=\"mb-3\">\r\n");
      out.write("				<label for=\"currentPassword\" class=\"form-label\">Current Password</label> <input type=\"password\"\r\n");
      out.write("					class=\"form-control\" id=\"currentPassword\" name=\"currentPassword\"\r\n");
      out.write("					placeholder=\"Nhập mật khẩu hiện tại\" required>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"mb-3\">\r\n");
      out.write("				<label for=\"newPassword\" class=\"form-label\">New Password</label> <input type=\"password\"\r\n");
      out.write("					class=\"form-control\" id=\"newPassword\" name=\"newPassword\" placeholder=\"Nhập mật khẩu mới\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"mb-3\">\r\n");
      out.write("				<label for=\"confirmPassword\" class=\"form-label\">Confirm Password</label> <input type=\"password\"\r\n");
      out.write("					class=\"form-control\" id=\"confirmPassword\" name=\"confirmPassword\"\r\n");
      out.write("					placeholder=\"Xác nhận mật khẩu mới\" required>\r\n");
      out.write("				<div id=\"msg\" class=\"text-danger fw-medium mb-3 mt-1\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<button type=\"submit\" class=\"btn btn-primary w-100\">Đổi Mật Khẩu</button>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("	");

	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		document.addEventListener(\"DOMContentLoaded\", confirmPassword); // Run on page load\r\n");
      out.write("\r\n");
      out.write("		function confirmPassword() {\r\n");
      out.write("			let pass_1 = document.getElementById(\"newPassword\").value;\r\n");
      out.write("			let pass_2 = document.getElementById(\"confirmPassword\").value;\r\n");
      out.write("			let msg = document.getElementById(\"msg\");\r\n");
      out.write("			let submitBtn = document.querySelector(\"button[type='submit']\");\r\n");
      out.write("\r\n");
      out.write("			if (pass_1 !== pass_2) {\r\n");
      out.write("				msg.innerHTML = \"Mật khẩu không khớp!\";\r\n");
      out.write("				submitBtn.disabled = true;\r\n");
      out.write("			} else {\r\n");
      out.write("				msg.innerHTML = \"\";\r\n");
      out.write("				submitBtn.disabled = false;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		// Event listeners for keyup on both fields\r\n");
      out.write("		document.getElementById(\"newPassword\").addEventListener(\"keyup\",\r\n");
      out.write("				confirmPassword);\r\n");
      out.write("		document.getElementById(\"confirmPassword\").addEventListener(\"keyup\",\r\n");
      out.write("				confirmPassword);\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
