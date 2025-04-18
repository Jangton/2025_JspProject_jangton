/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2025-03-26 05:23:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Iamport;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payProc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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

      out.write("<!-- payProc.jsp -->\r\n");
      out.write("\r\n");

		request.setCharacterEncoding("UTF-8");
		String name = (String)request.getParameter("name");
		String email = (String)request.getParameter("email");
		String phone = (String)request.getParameter("phone");
		String address = (String)request.getParameter("address");
		String stotalPrice = (String)request.getParameter("totalPrice");
		int totalPrice = Integer.parseInt(stotalPrice);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>결제시스템</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-1.12.4.min.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdn.iamport.kr/js/iamport.payment-1.1.5.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("        var IMP = window.IMP; // 생략가능\r\n");
      out.write("        IMP.init('iamport'); // 'iamport' 대신 부여받은 \"가맹점 식별코드\"를 사용\r\n");
      out.write("        var msg;\r\n");
      out.write("        \r\n");
      out.write("        IMP.request_pay({\r\n");
      out.write("            pg : 'inicis',\r\n");
      out.write("            pay_method : 'card',\r\n");
      out.write("            merchant_uid : 'merchant_' + new Date().getTime(),\r\n");
      out.write("            name : '주문명:결제테스트',\r\n");
      out.write("            amount : ");
      out.print(totalPrice);
      out.write(",\r\n");
      out.write("            buyer_email : '");
      out.print(email);
      out.write("',\r\n");
      out.write("            buyer_name : '");
      out.print(name);
      out.write("',\r\n");
      out.write("            buyer_tel : '");
      out.print(phone);
      out.write("',\r\n");
      out.write("            buyer_addr : '");
      out.print(address);
      out.write("',\r\n");
      out.write("            buyer_postcode : '123-456',\r\n");
      out.write("            //m_redirect_url : 'http://www.naver.com' //결제후 리디렉션 될 URL\r\n");
      out.write("        }, function(rsp) {\r\n");
      out.write("            if (rsp.success ) {\r\n");
      out.write("                //[1] 서버단에서 결제정보 조회를 위해 jQuery ajax로 imp_uid 전달하기\r\n");
      out.write("                jQuery.ajax({\r\n");
      out.write("                    url: \"/payments/complete\", //cross-domain error가 발생하지 않도록 주의해주세요\r\n");
      out.write("                    type: 'POST',\r\n");
      out.write("                    dataType: 'json',\r\n");
      out.write("                    data: {\r\n");
      out.write("                        imp_uid : rsp.imp_uid\r\n");
      out.write("                        //기타 필요한 데이터가 있으면 추가 전달\r\n");
      out.write("                    }\r\n");
      out.write("                }).done(function(data) {\r\n");
      out.write("                    //[2] 서버에서 REST API로 결제정보확인 및 서비스루틴이 정상적인 경우\r\n");
      out.write("                    if ( everythings_fine ) {\r\n");
      out.write("                        msg = '결제가 완료되었습니다.';\r\n");
      out.write("                        msg += '\\n고유ID : ' + rsp.imp_uid;\r\n");
      out.write("                        msg += '\\n상점 거래ID : ' + rsp.merchant_uid;\r\n");
      out.write("                        msg += '\\결제 금액 : ' + rsp.paid_amount;\r\n");
      out.write("                        msg += '카드 승인번호 : ' + rsp.apply_num;\r\n");
      out.write("                        alert(msg);\r\n");
      out.write("                    } else {\r\n");
      out.write("                        //[3] 아직 제대로 결제가 되지 않았습니다.\r\n");
      out.write("                        //[4] 결제된 금액이 요청한 금액과 달라 결제를 자동취소처리하였습니다.\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("                //성공시 이동할 페이지\r\n");
      out.write("               location.href='");
      out.print(request.getContextPath());
      out.write("/iamport/paymentProc.jsp?apply_num='+rsp.apply_num+'&paid_amount='+rsp.paid_amount;\r\n");
      out.write("            } else {\r\n");
      out.write("                msg = '결제에 실패하였습니다.';\r\n");
      out.write("                msg += '에러내용 : ' + rsp.error_msg;\r\n");
      out.write("                alert(msg);\r\n");
      out.write("                //실패시 이동할 페이지\r\n");
      out.write("                location.href=\"");
      out.print(request.getContextPath());
      out.write("/iamport/payForm.jsp\";\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("    </script> \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
