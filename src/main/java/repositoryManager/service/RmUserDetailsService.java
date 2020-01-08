package repositoryManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import repositoryManager.model.UserDetailsModel;
import repositoryManager.repository.UserRepository;

@Service
public class RmUserDetailsService implements UserDetailsService {
    private UserRepository userRepository;

    @Autowired
    public RmUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return userRepository.findByName(userName)
                .map(UserDetailsModel::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + userName));
    }
}
