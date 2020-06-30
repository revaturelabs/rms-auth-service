package com.revature.rms.auth.config;

import com.revature.rms.auth.documents.AppUser;
import com.revature.rms.auth.documents.Role;
import com.revature.rms.auth.repos.UserRepository;
import com.revature.rms.core.models.ResourceMetadata;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Profile("dev")
@Configuration
public class MockDataInitializer implements CommandLineRunner {

    private UserRepository userRepo;

    public MockDataInitializer(UserRepository repo) {
        this.userRepo = repo;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("INIT DATA SOURCE");

        ResourceMetadata metadata = new ResourceMetadata("5e70e8e8d798ce32e0ce9b64", "5e70e8e8d798ce32e0ce9b64");

        AppUser admin = new AppUser("5e70e8e8d798ce32e0ce9b64", "admin", "revature", "Test", "Admin",
                "test.admin@revature.com", Arrays.asList(Role.ADMIN), metadata);
        userRepo.save(admin).block();

        AppUser usfTsm = new AppUser("5e70e8e8d798ce32e0ce9b65", "skelsey", "revature", "Steven", "Kelsey",
                "steven.kelsey@revature.com", Arrays.asList(Role.TRNG_MNGR), metadata);
        userRepo.save(usfTsm).block();

        AppUser usfNecMngr = new AppUser("5e70e8e8d798ce32e0ce9b66", "mgoshorn", "revature", "Mitchell",
                "Goshorn", "mitchell.goshorn@revature.com", Arrays.asList(Role.BLDG_MNGR, Role.TRAINER), metadata);
        userRepo.save(usfNecMngr).block();

        AppUser usfBsnMngr = new AppUser("5e70e8e8d798ce32e0ce9b67", "wsingleton", "revature", "Wezley",
                "Singleton", "wezley.singleton@revature.com", Arrays.asList(Role.BLDG_MNGR, Role.TRAINER), metadata);
        userRepo.save(usfBsnMngr).block();

        AppUser usfTrainer1 = new AppUser("5e70e8e8d798ce32e0ce9b68", "njurczak", "revature", "Nickolas",
                "Jurczak", "nickolas.jurczak@revature.com", Arrays.asList(Role.TRAINER), metadata);
        userRepo.save(usfTrainer1).block();

        AppUser usfTrainer2 = new AppUser("5e70e8e8d798ce32e0ce9b69", "aduet", "revature", "August",
                "Duet", "august.duet@revature.com", Arrays.asList(Role.TRAINER), metadata);
        userRepo.save(usfTrainer2).block();

        AppUser usfTrainer3 = new AppUser("5e70e8e8d798ce32e0ce9b66a", "jknighten", "revature", "Jason",
                "Knighten", "jason.knighten@revature.com", Arrays.asList(Role.TRAINER), metadata);
        userRepo.save(usfTrainer3).block();

        AppUser usfTrainer4 = new AppUser("5e70e8e8d798ce32e0ce9b6b", "rconnell", "revature", "Robert",
                "Connell", "robert.connell@revature.com", Arrays.asList(Role.TRAINER), metadata);
        userRepo.save(usfTrainer4).block();

        AppUser locked = new AppUser("5e70e8e8d798ce32e0ce9b6c", "locked", "revature", "Locked",
                "User", "wezley.singleton@revature.com", Arrays.asList(Role.LOCKED), metadata);
        userRepo.save(locked).block();

        System.out.println("DATA SOURCE INIT COMPLETE");

    }
}
