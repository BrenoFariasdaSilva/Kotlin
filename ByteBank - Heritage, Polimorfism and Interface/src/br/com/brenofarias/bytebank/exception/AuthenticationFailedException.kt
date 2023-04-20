package br.com.brenofarias.bytebank.exception

class AuthenticationFailedException (
    message: String = "Authentication has failed"
) : Exception (message)