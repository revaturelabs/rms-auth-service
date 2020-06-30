package com.revature.rms.auth.documents;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.revature.rms.core.models.Resource;
import com.revature.rms.core.models.ResourceMetadata;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Document
@JsonPropertyOrder({
        "id",
        "username",
        "password",
        "firstName",
        "lastName",
        "email",
        "metadata"
})
public class AppUser extends Resource {

    @NotNull @NotEmpty
    private String username;

    @NotNull @NotEmpty
    private String password;

    @NotNull @NotEmpty
    private String firstName;

    @NotNull @NotEmpty
    private String lastName;

    @NotNull @NotEmpty
    private String email;

    @NotNull @NotEmpty
    private List<Role> roles;

    public AppUser() {
        super();
    }

    public AppUser(@NotNull @NotEmpty String username, @NotNull @NotEmpty String password,
                   @NotNull @NotEmpty String firstName, @NotNull @NotEmpty String lastName,
                   @NotNull @NotEmpty String email, @NotNull @NotEmpty List<Role> roles) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.roles = roles;
    }

    public AppUser(@NotNull @NotEmpty String username, @NotNull @NotEmpty String password,
                   @NotNull @NotEmpty String firstName, @NotNull @NotEmpty String lastName,
                   @NotNull @NotEmpty String email, @NotNull @NotEmpty List<Role> roles, ResourceMetadata metadata) {
        this(username, password, firstName, lastName, email, roles);
        this.metadata = metadata;
    }

    public AppUser(String id, @NotNull @NotEmpty String username, @NotNull @NotEmpty String password,
                   @NotNull @NotEmpty String firstName, @NotNull @NotEmpty String lastName,
                   @NotNull @NotEmpty String email, @NotNull @NotEmpty List<Role> roles, ResourceMetadata metadata) {
        this(username, password, firstName, lastName, email, roles, metadata);
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public AppUser setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public AppUser setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public AppUser setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public AppUser setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AppUser setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public AppUser setRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }

    public void addRoles(Role... roles) {

        if (roles == null) {
            this.roles = new ArrayList<>();
        }

        this.roles.addAll(Arrays.asList(roles));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(username, appUser.username) &&
                Objects.equals(password, appUser.password) &&
                Objects.equals(firstName, appUser.firstName) &&
                Objects.equals(lastName, appUser.lastName) &&
                Objects.equals(email, appUser.email) &&
                Objects.equals(roles, appUser.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, firstName, lastName, email, roles);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", roles=" + roles +
                ", metadata=" + metadata +
                '}';
    }

}
