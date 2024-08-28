package com.yupi.nojbackendjudgeservice.judge.codesandbox;


import com.yupi.nojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.yupi.nojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {
    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
