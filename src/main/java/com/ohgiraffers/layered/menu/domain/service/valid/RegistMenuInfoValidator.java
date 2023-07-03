package com.ohgiraffers.layered.menu.domain.service.valid;

import org.springframework.stereotype.Component;

@Component
public class RegistMenuInfoValidator {

    public void validateCollectMenuName(String menuName) {
        
        if(menuName.isBlank() || menuName != null) {
            throw new IllegalArgumentException("메뉴 이름이 비어있습니다.");
        }
        
        //추가 검증 로직 작성
    }
}
