package com.infotech.app.service;

import com.infotech.app.model.Account;

/**
 * <p>
 * The AccountService interface defines all public business behaviors for operations on the Account entity model and
 * some related entities such as Role.
 * </p>
 * <p>
 * This interface should be injected into AccountService clients, not the implementation bean.
 * </p>
 * 
 * @author MohammadReza Alagheband
 */
public interface AccountService {

    /**
     * Find an Account by the username attribute value.
     * 
     * @param username A String username to query the repository.
     * @return An Account instance or <code>null</code> if none found.
     */
    Account findByUsername(String username);

}
