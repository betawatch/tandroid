package org.webrtc;

import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class SoftwareVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "SoftwareVideoDecoderFactory";
    private final long nativeFactory = SoftwareVideoDecoderFactoryJni.get().createFactory();

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    interface Natives {
        long create(long j, long j2, VideoCodecInfo videoCodecInfo);

        long createFactory();

        List<VideoCodecInfo> getSupportedCodecs(long j);

        boolean isSupported(long j, VideoCodecInfo videoCodecInfo);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(final VideoCodecInfo videoCodecInfo) {
        if (SoftwareVideoDecoderFactoryJni.get().isSupported(this.nativeFactory, videoCodecInfo)) {
            return new WrappedNativeVideoDecoder() { // from class: org.webrtc.SoftwareVideoDecoderFactory.1
                @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
                public long createNative(long j) {
                    return SoftwareVideoDecoderFactoryJni.get().create(SoftwareVideoDecoderFactory.this.nativeFactory, j, videoCodecInfo);
                }
            };
        }
        Logging.w(TAG, "Trying to create decoder for unsupported format. " + videoCodecInfo);
        return null;
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) SoftwareVideoDecoderFactoryJni.get().getSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
