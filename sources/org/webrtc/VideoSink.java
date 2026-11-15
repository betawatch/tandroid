package org.webrtc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public interface VideoSink {
    void onFrame(VideoFrame videoFrame);

    void setParentSink(VideoSink videoSink);
}
