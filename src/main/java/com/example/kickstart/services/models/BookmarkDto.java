package com.example.kickstart.services.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookmarkDto {
    private Long id;
    private String name;
    private String url;
}
