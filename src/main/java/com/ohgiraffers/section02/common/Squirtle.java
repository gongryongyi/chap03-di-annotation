package com.ohgiraffers.section02.common;

import com.ohgiraffers.section02.common.Pokemon;
import org.springframework.stereotype.Component;

@Component
public class Squirtle implements Pokemon {
    @Override
    public void attack() {
        System.out.println("꼬부기 물대포 발사🌊");
    }
}
