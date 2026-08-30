package org.webrtc.audio;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z4);

    boolean setNoiseSuppressorEnabled(boolean z4);

    boolean setPreferredMicrophoneFieldDimension(float f10);

    void setSpeakerMute(boolean z4);
}
