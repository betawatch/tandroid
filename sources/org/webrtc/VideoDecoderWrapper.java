package org.webrtc;

import org.webrtc.VideoDecoder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
class VideoDecoderWrapper {
    public static VideoDecoder.Callback createDecoderCallback(long j3) {
        return new v(j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j3, VideoFrame videoFrame, Integer num, Integer num2);
}
