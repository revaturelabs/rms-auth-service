package com.revature.rms.auth.documents;

import com.revature.rms.core.exceptions.EnumMappingException;

import java.util.Arrays;

public enum Role {

    ADMIN("Admin"),
    TRNG_MNGR("Training Site Manager"),
    BLDG_MNGR("Building Manager"),
    TRAINER("Trainer"),
    STG_MNGR("Staging Manager"),
    LOCKED("Locked");

    private String roleName;

    Role(String name) {
        this.roleName = name;
    }

    @Override
    public String toString() {
        return roleName;
    }

    public static Role findRoleByName(String name) {
        return Arrays.stream(Role.values())
                .filter(role -> role.roleName.equals(name))
                .findFirst()
                .orElseThrow(EnumMappingException::new);
    }

}
