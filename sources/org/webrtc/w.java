package org.webrtc;

import org.webrtc.VideoDecoder;
import org.webrtc.VideoEncoder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements VideoDecoder.Callback, VideoEncoder.Callback {
    public final /* synthetic */ long a;

    public /* synthetic */ w(long j10) {
        this.a = j10;
    }

    @Override // org.webrtc.VideoDecoder.Callback
    public void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.a, videoFrame, num, num2);
    }

    @Override // org.webrtc.VideoEncoder.Callback
    public void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.nativeOnEncodedFrame(this.a, encodedImage);
    }
}
