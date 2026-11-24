package org.webrtc;

import org.webrtc.VideoDecoder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
class VideoDecoderWrapper {
    public static VideoDecoder.Callback createDecoderCallback(long j) {
        return new f(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);
}
