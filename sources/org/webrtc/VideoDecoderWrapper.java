package org.webrtc;

import org.webrtc.VideoDecoder;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
class VideoDecoderWrapper {
    public static VideoDecoder.Callback createDecoderCallback(long j3) {
        return new w(j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j3, VideoFrame videoFrame, Integer num, Integer num2);
}
