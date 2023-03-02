package com.teamng.jwt.config;

import com.teamng.jwt.entity.UserEntity;
import com.teamng.jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserInfoUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserEntity> user=userRepository.findByName(username);
       return user.map(UserConverterClass::new).orElseThrow(()->new RuntimeException("Users Not Found"));
    }
}
