package com.codeboogie.kidmapbackend.common.member.domain.dto;

import com.codeboogie.kidmapbackend.common.member.domain.model.Errand;

import java.util.ArrayList;
import java.util.List;

public class ChildDTO {
    private String _id;

    public int key;

    public String UUID; // 자녀 고유 식별자

    public String childName; // 자녀 이름

    private List<Errand> Errand = new ArrayList<Errand>(); // 각 자녀별 심부름 목록
}