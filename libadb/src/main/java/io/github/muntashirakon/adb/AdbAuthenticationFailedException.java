// SPDX-License-Identifier: BSD-3-Clause AND (GPL-3.0-or-later OR Apache-2.0)

package io.github.muntashirakon.adb;

/**
 * Thrown when the peer rejects our initial authentication attempt,
 * which typically means that the peer has not previously saved our
 * public key.
 * <p>
 * This is an unchecked exception for backwards-compatibility.
 */
// Copyright 2020 Sam Palmer
public class AdbAuthenticationFailedException extends RuntimeException {
    public AdbAuthenticationFailedException() {
        super("Initial authentication attempt rejected by peer.");
    }
}
