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
public interface RTCTrackEvent extends Event {
    public RTCRtpReceiver getReceiver();
    public MediaStreams getStreams();
    public MediaStreamTrack getTrack();
    public RTCRtpTransceiver getTransceiver();
    
   
}