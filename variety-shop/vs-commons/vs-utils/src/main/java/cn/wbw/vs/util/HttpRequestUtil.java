package cn.wbw.vs.util;

import cn.hutool.core.util.StrUtil;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * http request 请求封装
 *
 * @author wbw
 * @date 2019/8/13 13:36
 */
public class HttpRequestUtil {

    /**
     * 获取当前ip信息
     *
     * @return ip地址
     * @author 王保卫
     * @date 17:43 2018/11/26
     */
    public static String getCurrentIp() {
        HttpServletRequest request = HttpRequestUtil.getRequest();
        assert request != null;
        return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
    }

    /**
     * 获取request
     *
     * @return HttpServletRequest
     * @author 王保卫
     * @date 9:20 2018/11/15
     */
    public static HttpServletRequest getRequest() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return requestAttributes == null ? null : requestAttributes.getRequest();
    }

    /**
     * 获取session
     *
     * @return HttpSession
     * @author 王保卫
     * @date 9:20 2018/11/15
     */
    public static HttpSession getSession() {
        return Objects.requireNonNull(getRequest()).getSession(false);
    }

    /**
     * 获取项目真实路径
     *
     * @return String 路径
     * @author 王保卫
     * @date 9:20 2018/11/15
     */
    public static String getRealRootPath() {
        return Objects.requireNonNull(getRequest()).getServletContext().getRealPath("/");
    }

    /**
     * 获取 用户请求的 ip 地址
     *
     * @return String ip 地址
     * @author 王保卫
     * @date 9:20 2018/11/15
     */
    public static String getIp() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        HttpServletRequest request = Objects.requireNonNull(servletRequestAttributes).getRequest();
        String ip = null;
        //X-Forwarded-For：Squid 服务代理
        String ipAddresses = request.getHeader("X-Forwarded-For");
        String unknown = "unknown";
        if (StrUtil.isEmpty(ipAddresses) || unknown.equalsIgnoreCase(ipAddresses)) {
            //Proxy-Client-IP：apache 服务代理
            ipAddresses = request.getHeader("Proxy-Client-IP");
        }

        if (StrUtil.isEmpty(ipAddresses) || unknown.equalsIgnoreCase(ipAddresses)) {
            //WL-Proxy-Client-IP：weblogic 服务代理
            ipAddresses = request.getHeader("WL-Proxy-Client-IP");
        }

        if (StrUtil.isEmpty(ipAddresses) || unknown.equalsIgnoreCase(ipAddresses)) {
            //HTTP_CLIENT_IP：有些代理服务器
            ipAddresses = request.getHeader("HTTP_CLIENT_IP");
        }

        if (StrUtil.isEmpty(ipAddresses) || unknown.equalsIgnoreCase(ipAddresses)) {
            //X-Real-IP：nginx服务代理
            ipAddresses = request.getHeader("X-Real-IP");
        }

        //有些网络通过多层代理，那么获取到的ip就会有多个，一般都是通过逗号（,）分割开来，并且第一个ip为客户端的真实IP
        if (StrUtil.isNotEmpty(ipAddresses)) {
            ip = ipAddresses.split(",")[0];
        }

        //还是不能获取到，最后再通过request.getRemoteAddr();获取
        if (StrUtil.isEmpty(ip) || unknown.equalsIgnoreCase(ipAddresses)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    /**
     * 根据名称获取作用域对象
     *
     * @param name 作用域名称
     * @return Object
     * @author 王保卫
     * @date 9:21 2018/11/15
     */
    public static Object getSessionAttributeByName(String name) {
        HttpServletRequest request = getRequest();
        return request == null ? null : request.getSession().getAttribute(name);
    }

    /**
     * 设置session的Attribute
     *
     * @param name  名称
     * @param value 值
     * @author 王保卫
     * @date 9:21 2018/11/15
     */
    public static void setSessionAttribute(String name, Object value) {
        HttpServletRequest request = getRequest();
        if (request != null) {
            request.getSession().setAttribute(name, value);
        }
    }

    /**
     * 获取request中的Attribute
     *
     * @param name 名称
     * @return Object
     * @author 王保卫
     * @date 9:22 2018/11/15
     */
    public static Object getRequestAttributeByName(String name) {
        HttpServletRequest request = getRequest();
        return request == null ? null : request.getAttribute(name);
    }

    /**
     * 设置request的Attribute
     *
     * @param name  名称
     * @param value 对象
     * @author 王保卫
     * @date 9:23 2018/11/15
     */
    public static void setRequestAttribute(String name, Object value) {
        HttpServletRequest request = getRequest();
        if (request != null) {
            request.setAttribute(name, value);
        }
    }

    /**
     * 获取上下文path
     *
     * @return 上下文路径
     * @author 王保卫
     * @date 9:23 2018/11/15
     */
    public static String getContextPath() {
        return Objects.requireNonNull(getRequest()).getContextPath();
    }

    /**
     * 删除session中的Attribute
     *
     * @param name 名称
     * @author 王保卫
     * @date 9:23 2018/11/15
     */
    public static void removeSessionAttribute(String name) {
        Objects.requireNonNull(getRequest()).getSession().removeAttribute(name);
    }

    /**
     * 获取IP方法
     *
     * @param request 请求
     * @return java.lang.String
     * @author 张旭
     * @date 2018/11/6 14:45
     */
    public static String getIp(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
        // 位置ip
        String now = "unKnown";
        if (StrUtil.isNotEmpty(ip) && !now.equalsIgnoreCase(ip)) {
            //多次反向代理后会有多个ip值，第一个ip才是真实ip
            int index = ip.indexOf(",");
            if (index != -1) {
                ip = ip.substring(0, index);
            }
            return ip;
        }
        ip = request.getHeader("X-Real-IP");
        if (StrUtil.isNotEmpty(ip) && !now.equalsIgnoreCase(ip)) {
            return ip;
        }
        return request.getRemoteAddr();
    }


}
