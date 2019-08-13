package cn.wbw.vs.common.api.code;

/**
 * 封装API的错误码
 *
 * @author wbw
 * @date 10:19 2019/8/13
 */
public interface IErrorCode {
    /**
     * 获取状态码
     *
     * @return code
     */
    long getCode();

    /**
     * 获取描述信息
     *
     * @return message
     */
    String getMessage();
}
