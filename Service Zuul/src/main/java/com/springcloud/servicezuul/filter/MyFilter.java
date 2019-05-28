package com.springcloud.servicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class MyFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(MyFilter.class);

    /**
     * pre  路由之前
     * routing 路由之时
     * post 路由之后
     * error 发送错误调用
     * **/
    @Override
    public String filterType() {
        return "pre";
    }

    /**过滤的顺序**/
    @Override
    public int filterOrder() {
        return 0;
    }

    /**可以写逻辑判断  是否过滤 文本true 永远过滤**/
    @Override
    public boolean shouldFilter() {
        return true;
    }


    /**过滤器的具体逻辑
     * 可用很复杂
     * 包括查sql，nosql去判断该请求到底有没有权限访问
     * **/
    @Override
    public Object run() {
        RequestContext ctx=RequestContext.getCurrentContext();
        HttpServletRequest request=ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken=request.getParameter("token");
        if(accessToken==null){
            log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try{
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){

            }

        }
        log.info("ok");
        return null;
    }
}
