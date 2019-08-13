package cn.wbw.vs.bo;

import lombok.Data;

/**
 * Controller层的日志封装类
 *
 * @author wbw
 * @date 2019/8/12 9:33
 */
@Data
public class WebLog {
    /**
     * 操作描述
     */
    private String description;

    /**
     * 操作用户
     */
    private String username;

    /**
     * 操作时间
     */
    private Long startTime;

    /**
     * 消耗时间
     */
    private Integer spendTime;

    /**
     * 根路径
     */
    private String basePath;

    /**
     * URI
     */
    private String uri;

    /**
     * URL
     */
    private String url;

    /**
     * 请求类型
     */
    private String method;

    /**
     * IP地址
     */
    private String ip;
    /**
     * 参数
     */
    private Object parameter;
    /**
     * 结果
     */
    private Object result;
}
