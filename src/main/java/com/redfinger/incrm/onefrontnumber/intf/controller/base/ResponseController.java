package com.redfinger.incrm.onefrontnumber.intf.controller.base;

import com.redfinger.crm.lego.BaseController;
import com.redfinger.crm.lego.vo.ResultVO;

/**
 * @author kangjie02
 * @date 2021/12/9
 * @description 扩展返回结构
 */
public class ResponseController extends BaseController {

    public <T> ResultVO<T> fail(Integer code, String msg, T data) {
        ResultVO rtn = new ResultVO(code, msg, data);
        return rtn;
    }
}