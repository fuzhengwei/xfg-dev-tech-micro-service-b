package cn.bugstack.xfg.dev.test;

import cn.bugstack.xfg.dev.tech.api.IUserService;
import cn.bugstack.xfg.dev.tech.api.dto.UserRequestDTO;
import cn.bugstack.xfg.dev.tech.api.dto.UserResponseDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ApiTest {

    public IUserService userService;

    public void test() {
        UserRequestDTO requestDTO = new UserRequestDTO();
        UserResponseDTO userResponseDTO = userService.queryUserInfo(requestDTO);
    }
}
