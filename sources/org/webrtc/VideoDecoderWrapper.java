package org.webrtc;

import org.webrtc.VideoDecoder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
class VideoDecoderWrapper {
    public static VideoDecoder.Callback createDecoderCallback(long j) {
        return new f(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);
}
