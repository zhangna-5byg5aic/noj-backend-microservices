package com.yupi.nojbackendjudgeservice.judge.codesandbox.impl;


import com.yupi.nojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.yupi.nojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.yupi.nojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
