package tech.xiby.vueblog.common;

/**
 * 常量定义
 * @author xiby
 */
public class Constants {
    public final static int CODE_OK = 0;

    public final static int CODE_INTERNAL_ERROR = 500;

    public final static int CODE_AUTH_ERROR = 1001;

    public final static int CODE_REG_ERROR = 2000;
    public final static String MSG_REG_ERROR = "注册异常";

    /**
     * 注册参数缺失
     */
    public final static int CODE_REG_MISSING_PARAM = 2001;
    public final static String MSG_REG_MISSING_PARAM = "参数缺失";

    /**
     * 邮箱重复
     */
    public final static int CODE_REG_DUPLICATED_EMAIL = 2002;
    public final static String MSG_REG_DUPLICATED_EMAIL = "邮箱已被注册";
}
