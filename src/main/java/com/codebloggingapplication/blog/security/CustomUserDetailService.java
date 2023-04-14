package com.codebloggingapplication.blog.security;

import com.codebloggingapplication.blog.entities.User;
import com.codebloggingapplication.blog.exceptions.ResourceNotFoundException;
import com.codebloggingapplication.blog.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //loading user from database by username
        User user = this.userRepo.findByEmail(username).orElseThrow(() -> new ResourceNotFoundException("User", "email" + username, 0));
        return user;
    }
}
