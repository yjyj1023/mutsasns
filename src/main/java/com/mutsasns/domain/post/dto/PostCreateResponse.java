package com.mutsasns.domain.post.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class PostCreateResponse {
    private Long postId;
    private String message;
}
