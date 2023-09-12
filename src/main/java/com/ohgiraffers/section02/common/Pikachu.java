package com.ohgiraffers.section02.common;

import com.ohgiraffers.section02.common.Pokemon;
import org.springframework.stereotype.Component;

@Component
public class Pikachu implements Pokemon {
    @Override
    public void attack() {
        System.out.println("피카츄 백만볼트⚡");
    }
}
