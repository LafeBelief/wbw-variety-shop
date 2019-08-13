package cn.wbw.vs.common.api.code;

/**
 * 枚举了一些常用API操作码
 *
 * @author wbw
 * @date 10:20 2019/8/13
 */
public enum ResultCode implements IErrorCode {
    /**
     * 成功
     */
    SUCCESS(200, "操作成功"),
    /**
     * 失败
     */
    FAILED(500, "操作失败"),
    /**
     * 入参效验
     */
    VALIDATE_FAILED(404, "参数检验失败"),
    /**
     * 权限
     */
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    /**
     * 权限
     */
    FORBIDDEN(403, "没有相关权限");

    private long code;
    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
