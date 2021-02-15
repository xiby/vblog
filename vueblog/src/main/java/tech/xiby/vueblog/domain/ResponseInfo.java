package tech.xiby.vueblog.domain;

import static tech.xiby.vueblog.common.Constants.CODE_OK;

/**
 * 响应信息
 * @author xiby
 */
public class ResponseInfo<T> {
    /**
     * 返回值 0为正常返回，否则为异常，异常信息通过msg给出
     */
    private int code;

    /**
     * 异常时的提示信息
     */
    private String msg;

    /**
     * 返回正常时的消息体
     */
    private T body;

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

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public static<P> ResponseInfo OK(P body){
        ResponseInfo<P> ret = new ResponseInfo<>();
        ret.setCode(CODE_OK);
        ret.setBody(body);
        return ret;
    }

    public static  ResponseInfo EMPTY_RESPONSE(){
        ResponseInfo ret = new ResponseInfo();
        ret.setCode(CODE_OK);
        return ret;
    }

    public static ResponseInfo ERROR(int code, String msg){
        ResponseInfo ret = new ResponseInfo();
        ret.setCode(code);
        ret.setMsg(msg);
        return ret;
    }
}
