package tech.xiby.vueblog.exception;

import static tech.xiby.vueblog.common.Constants.*;

/**
 * 注册异常
 *
 * @author xiby
 */
public class RegisterException extends CommonException {
    public RegisterException(String msg) {
        super(CODE_REG_ERROR, msg);
    }

    public RegisterException(int code){
        super();
        this.code = code;
        if(CODE_REG_MISSING_PARAM == code){
            this.msg = MSG_REG_MISSING_PARAM;
        }else if(CODE_REG_DUPLICATED_EMAIL == code){
            this.msg = MSG_REG_DUPLICATED_EMAIL;
        }else{
            this.msg = MSG_REG_ERROR;
        }
    }
}
