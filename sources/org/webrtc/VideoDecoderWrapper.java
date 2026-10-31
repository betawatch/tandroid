package org.webrtc;

import org.webrtc.VideoDecoder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
class VideoDecoderWrapper {
    public static VideoDecoder.Callback createDecoderCallback(long j10) {
        return new w(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j10, VideoFrame videoFrame, Integer num, Integer num2);
}
