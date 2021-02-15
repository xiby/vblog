package tech.xiby.vueblog.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import tech.xiby.vueblog.domain.ResponseInfo;
import tech.xiby.vueblog.exception.CommonException;

import static tech.xiby.vueblog.common.Constants.CODE_INTERNAL_ERROR;

/**
 * 全局异常拦截器
 * @author xiby
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(CommonException.class)
    @ResponseBody
    public ResponseInfo commonErrorHandler(CommonException commonException){
        logger.error(commonException.getMsg());
        return ResponseInfo.ERROR(commonException.getCode(), commonException.getMsg());
    }
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseInfo error(Exception e){
        logger.error("请求出现异常", e);
        return ResponseInfo.ERROR(CODE_INTERNAL_ERROR, e.getMessage());
    }
}
