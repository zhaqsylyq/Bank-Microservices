package com.zhaksylyk.accounts.dto;

public record AccountsMsgDto(
        Long accountNumber, String name, String email, String mobileNumber
){}
