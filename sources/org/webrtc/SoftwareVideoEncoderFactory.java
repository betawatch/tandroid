package org.webrtc;

import java.util.List;
import org.webrtc.VideoEncoderFactory;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final String TAG = "SoftwareVideoEncoderFactory";
    private final long nativeFactory = SoftwareVideoEncoderFactoryJni.get().createFactory();

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    interface Natives {
        long create(long j, long j2, VideoCodecInfo videoCodecInfo);

        long createFactory();

        List<VideoCodecInfo> getSupportedCodecs(long j);

        boolean isSupported(long j, VideoCodecInfo videoCodecInfo);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(final VideoCodecInfo videoCodecInfo) {
        if (SoftwareVideoEncoderFactoryJni.get().isSupported(this.nativeFactory, videoCodecInfo)) {
            return new WrappedNativeVideoEncoder() { // from class: org.webrtc.SoftwareVideoEncoderFactory.1
                @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
                public long createNative(long j) {
                    return SoftwareVideoEncoderFactoryJni.get().create(SoftwareVideoEncoderFactory.this.nativeFactory, j, videoCodecInfo);
                }

                @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
                public boolean isHardwareEncoder() {
                    return false;
                }
            };
        }
        Logging.w(TAG, "Trying to create encoder for unsupported format. " + videoCodecInfo);
        return null;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final VideoCodecInfo[] getImplementations() {
        return getSupportedCodecs();
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) SoftwareVideoEncoderFactoryJni.get().getSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
