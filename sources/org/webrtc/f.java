package org.webrtc;

import org.webrtc.VideoDecoder;
import org.webrtc.VideoEncoder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
