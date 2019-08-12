package cn.wbw.vs;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.spi.FilterReply;

/**
 * Logback 过滤器
 *
 * @author wbw
 * @date 0:30
 */
public class SqlLogFilter extends ch.qos.logback.core.filter.Filter<ILoggingEvent> {

    /**
     * 根据自定义规则过滤,sql（默认为debug）打印,
     *
     * @param event e
     * @return FilterReply FilterReply
     * @author wbw
     * @date 0:33
     */
    @Override
    public FilterReply decide(ILoggingEvent event) {
        String message = event.getMessage();
        if (message.toLowerCase().contains("parameter") || message.contains("Preparing") || message.contains("Total")
                || message.contains("Mapped")) {
            // 接受
            return FilterReply.ACCEPT;
        }
        // 否认
        return FilterReply.DENY;
    }
}
