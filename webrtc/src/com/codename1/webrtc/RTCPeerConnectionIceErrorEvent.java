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
public interface RTCPeerConnectionIceErrorEvent extends Event {
    public int getErrorCode();
    public String getAddress();
    public String getErrorText();
    public int getPort();
    public String getURL();
}
