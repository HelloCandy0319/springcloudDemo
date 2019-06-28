package com.example.demo;

import com.netflix.zuul.ZuulFilter;

import java.util.HashSet;
import java.util.Set;

public class PreFilter extends ZuulFilter {
    private Set<String> users = new HashSet<>();
    @Override
    public String filterType() {
        return "pre";
    }

    //自定义过滤器执行的顺序，数值越大越靠后执行，越小就越先执行
    @Override
    public int filterOrder() {
        return 0;
    }
    //控制过滤器生效不生效，可以在里面写一串逻辑来控制
    @Override
    public boolean shouldFilter() {
        return true;
    }
    //控制逻辑
    @Override
    public Object run() {
//        users.add("/callerDemo1/user/hi");
//        RequestContext content = RequestContext.getCurrentContext();
//        HttpServletRequest request = content.getRequest();
//        String stringBuffer = request.getRequestURI();
//        if (users.contains(stringBuffer)){
//            return true;
//        }
//        String token  = request.getParameter("token");
//        if (token==null){
//            content.setResponseStatusCode(401);
//            content.setSendZuulResponse(false);
//            content.setResponseBody("NO！");
//            return false;
//        }else{
//           return true;
//        }
        return true;
    }
}
