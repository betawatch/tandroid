package org.webrtc;

import org.webrtc.VideoDecoder;
import org.webrtc.VideoEncoder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements VideoDecoder.Callback, VideoEncoder.Callback {
    public final /* synthetic */ long a;

    public /* synthetic */ f(long j) {
        this.a = j;
    }

    @Override // org.webrtc.VideoDecoder.Callback
    public final void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.a, videoFrame, num, num2);
    }

    @Override // org.webrtc.VideoEncoder.Callback
    public final void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.nativeOnEncodedFrame(this.a, encodedImage);
    }
}
