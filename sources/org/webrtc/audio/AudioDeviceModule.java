package org.webrtc.audio;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z10);

    boolean setNoiseSuppressorEnabled(boolean z10);

    boolean setPreferredMicrophoneFieldDimension(float f7);

    void setSpeakerMute(boolean z10);
}
