package vn.smartdev.model;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class AuditorAwareImpl implements AuditorAware<String> {

	public String getCurrentAuditor() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String username = "SYSTEM";
		if(authentication.isAuthenticated()){
			if(authentication.getPrincipal() instanceof String){
				username = (String) authentication.getPrincipal();
			} else if(authentication.getPrincipal() instanceof UserDetails){
				UserDetails userDetails = (UserDetails) authentication.getPrincipal();
				username = userDetails.getUsername();
			}

		}
		return username;
	}
}
