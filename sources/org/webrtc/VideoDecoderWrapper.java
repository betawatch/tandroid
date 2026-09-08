package org.webrtc;

import org.webrtc.VideoDecoder;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
class VideoDecoderWrapper {
    public static VideoDecoder.Callback createDecoderCallback(long j3) {
        return new w(j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j3, VideoFrame videoFrame, Integer num, Integer num2);
}
