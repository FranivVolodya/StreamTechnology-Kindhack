package com.streamtechnology.security.service;

import com.streamtechnology.service.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserServise userServise;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        com.streamtechnology.entity.User user = userServise.getUserByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException(email);
        }
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(user.getUserRole().name()));

        return new User(user.getEmail(), user.getPassword(), grantedAuthorities);
    }
}