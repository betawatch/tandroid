package org.webrtc;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public interface CapturerObserver {
    void onCapturerStarted(boolean z10);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
