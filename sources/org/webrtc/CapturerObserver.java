package org.webrtc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public interface CapturerObserver {
    void onCapturerStarted(boolean z4);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
