package com.dash.navigation.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * ChangePassword.
 *
 * @author Jason.liu
 * @date 2024-02-04
 */
@Getter
@Setter
public class ChangePassword implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String oldPassword;

    private String newPassword;
}
