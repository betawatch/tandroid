package org.webrtc.audio;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z10);

    boolean setNoiseSuppressorEnabled(boolean z10);

    boolean setPreferredMicrophoneFieldDimension(float f7);

    void setSpeakerMute(boolean z10);
}
