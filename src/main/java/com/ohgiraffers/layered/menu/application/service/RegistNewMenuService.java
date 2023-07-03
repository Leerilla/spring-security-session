package com.ohgiraffers.layered.menu.application.service;

import com.ohgiraffers.layered.menu.application.dto.RegistMenuInfoDTO;
import com.ohgiraffers.layered.menu.domain.aggregate.entity.Category;
import com.ohgiraffers.layered.menu.domain.aggregate.entity.Menu;
import com.ohgiraffers.layered.menu.domain.aggregate.enumtype.OrderableStatus;
import com.ohgiraffers.layered.menu.domain.repository.MenuRepository;
import com.ohgiraffers.layered.menu.domain.service.valid.RegistMenuInfoValidator;
import com.ohgiraffers.layered.menu.domain.aggregate.vo.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistNewMenuService {

    private final MenuRepository<Menu> menuRepository;
    private final RegistMenuInfoValidator registMenuInfoValidator;

    @Autowired
    public RegistNewMenuService(MenuRepository<Menu> menuRepository, RegistMenuInfoValidator registMenuInfoValidator) {
        this.menuRepository = menuRepository;
        this.registMenuInfoValidator = registMenuInfoValidator;
    }

    public void registNewMenu(RegistMenuInfoDTO registMenuInfo) {

        // 검증 로직
        registMenuInfoValidator.validateCollectMenuName(registMenuInfo.getMenuName());
        
        // 외부 api 호출 등
        
        // eneity 변환
        Menu newMenu = new Menu(registMenuInfo.getMenuName(),
                new Money(registMenuInfo.getPrice()),
                new Category(4, "한식", 1),
                OrderableStatus.Y);
        
        // repository 호출하여 저장
        menuRepository.save(newMenu);
    }
}
