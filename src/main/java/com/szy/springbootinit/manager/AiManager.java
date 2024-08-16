package com.szy.springbootinit.manager;

import com.szy.springbootinit.common.ErrorCode;
import com.szy.springbootinit.exception.BusinessException;

import com.yupi.yucongming.dev.client.YuCongMingClient;
import com.yupi.yucongming.dev.common.BaseResponse;
import com.yupi.yucongming.dev.model.DevChatRequest;
import com.yupi.yucongming.dev.model.DevChatResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AiManager {
    /**
     * AI对话
     * @param modelId
     * @param message
     * @return
     */

    @Resource
    private YuCongMingClient yuCongMingClient;

    long modelId = 1659171950288818178L;
    public String doChat(long modelId,String message) {
        DevChatRequest devChatRequest = new DevChatRequest();
        devChatRequest.setModelId(modelId);
        devChatRequest.setMessage(message);
        BaseResponse<DevChatResponse> response = yuCongMingClient.doChat(devChatRequest);
        if(response == null){
            throw new BusinessException(ErrorCode.SYSTEM_ERROR,"AI响应失败");
        }
        return response.getData().getContent();
    }
}
