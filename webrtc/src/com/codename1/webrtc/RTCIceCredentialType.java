/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.webrtc;

/**
 *
 * @author shannah
 */
public enum RTCIceCredentialType {
    Oauth("oauth"),
    Password("password");
    
    private String string;
    RTCIceCredentialType(String str) {
        this.string = str;
    }
    
    public String getStringValue() {
        return string;
    }
        
}