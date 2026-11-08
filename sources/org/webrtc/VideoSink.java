package org.webrtc;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public interface VideoSink {
    void onFrame(VideoFrame videoFrame);

    void setParentSink(VideoSink videoSink);
}
