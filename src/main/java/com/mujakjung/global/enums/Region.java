package com.mujakjung.global.enums;

import lombok.Getter;

@Getter
public enum Region {
    SEOUL("서울특별시"),
    BUSAN("부산광역시"),
    DAEGU("대구광역시"),
    INCHEON("인천광역시"),
    GWANGJU("광주광역시"),
    DAEJEON("대전광역시"),
    ULSAN("울산광역시"),
    SEJONG("세종특별자치시"),
    GYEONGGI("경기도"),
    GANGWON("강원도"),
    CHUNGCHEONGBUK("충청북도"),
    CHUNGCHEONGNAM("충청남도"),
    JEOLLABUK("전라북도"),
    JEOLLANAM("전라남도"),
    GYEONGBUK("경상북도"),
    GYEONGNAM("경상남도"),
    JEJU("제주특별자치도");

    private final String name;

    Region(String name) {
        this.name = name;
    }

    public static Region fromString(String regionName) {
        for (Region region : Region.values()) {
            if (region.getName().equals(regionName)) {
                return region;
            }
        }
        throw new IllegalArgumentException("Unknown region: " + regionName);
    }
}