package tech.xiby.vueblog.exception;

import static tech.xiby.vueblog.common.Constants.CODE_AUTH_ERROR;

/**
 * 权限校验异常
 * @author xiby
 */
public class AuthException extends CommonException{

    public AuthException(String msg) {
        super(CODE_AUTH_ERROR, msg);
    }
}
