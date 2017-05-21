package com.infotech.app.service;

import java.util.concurrent.Future;

import com.infotech.app.model.Greeting;

/**
 * <p>
 * The EmailService interface defines all public business behaviors for composing and transmitting email messages.
 * </p>
 * <p>
 * This interface should be injected into EmailService clients, not the implementation bean.
 * </p>
 * 
 * @author MohammadReza Alagheband
 */
public interface EmailService {

    /**
     * Send a Greeting via email synchronously.
     * 
     * @param greeting A Greeting to send.
     * @return A Boolean whose value is TRUE if sent successfully; otherwise FALSE.
     */
    Boolean send(Greeting greeting);

    /**
     * Send a Greeting via email asynchronously.
     * 
     * @param greeting A Greeting to send.
     */
    void sendAsync(Greeting greeting);

    /**
     * Send a Greeting via email asynchronously. Returns a Future&lt;Boolean&gt; response allowing the client to obtain
     * the status of the operation once it is completed.
     * 
     * @param greeting A Greeting to send.
     * @return A Future&lt;Boolean&gt; whose value is TRUE if sent successfully; otherwise, FALSE.
     */
    Future<Boolean> sendAsyncWithResult(Greeting greeting);

}
