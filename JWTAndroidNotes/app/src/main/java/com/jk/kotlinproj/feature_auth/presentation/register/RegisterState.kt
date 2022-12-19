package com.jk.kotlinproj.feature_auth.presentation.register

data class RegisterState(
    val isLoading: Boolean = false,
    val signUpUsername: String = "",
    val signUpPassword: String = ""
)
