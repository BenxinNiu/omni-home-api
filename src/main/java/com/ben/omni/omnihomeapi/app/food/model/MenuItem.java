package com.ben.omni.omnihomeapi.app.food.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MenuItem {
    private String name;
    private String url;
    private String icon;
    private String description;
}
