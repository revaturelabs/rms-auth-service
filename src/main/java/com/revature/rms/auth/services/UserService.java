package com.revature.rms.auth.services;

import com.revature.rms.auth.documents.AppUser;
import com.revature.rms.auth.repos.UserRepository;
import com.revature.rms.core.services.ResourceService;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ResourceService<AppUser> {

    private UserRepository userRepo;

    public UserService(UserRepository repo, ReactiveMongoTemplate template) {
        super(repo, template, AppUser.class);
        this.userRepo = repo;
    }

}
