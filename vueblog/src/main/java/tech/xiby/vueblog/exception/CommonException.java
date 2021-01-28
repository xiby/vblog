package tech.xiby.vueblog.exception;

/**
 * 通用异常
 * @author xiby
 */
public class CommonException extends RuntimeException{
    protected int code;

    protected String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public CommonException(){
        super();
    }

    public CommonException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
