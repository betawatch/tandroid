package org.webrtc;

import java.util.List;
import org.webrtc.VideoEncoderFactory;

/* loaded from: classes5.dex */
public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final String TAG = "SoftwareVideoEncoderFactory";
    private final long nativeFactory = nativeCreateFactory();

    private static native long nativeCreateEncoder(long j, VideoCodecInfo videoCodecInfo);

    private static native long nativeCreateFactory();

    private static native List<VideoCodecInfo> nativeGetSupportedCodecs(long j);

    @Override // org.webrtc.VideoEncoderFactory
    public /* synthetic */ VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return VideoEncoderFactory.-CC.$default$getEncoderSelector(this);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public /* synthetic */ VideoCodecInfo[] getImplementations() {
        VideoCodecInfo[] supportedCodecs;
        supportedCodecs = getSupportedCodecs();
        return supportedCodecs;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        final long nativeCreateEncoder = nativeCreateEncoder(this.nativeFactory, videoCodecInfo);
        if (nativeCreateEncoder == 0) {
            Logging.w(TAG, "Trying to create encoder for unsupported format. " + videoCodecInfo);
            return null;
        }
        return new WrappedNativeVideoEncoder() { // from class: org.webrtc.SoftwareVideoEncoderFactory.1
            @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
            public boolean isHardwareEncoder() {
                return false;
            }

            @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
            public long createNativeVideoEncoder() {
                return nativeCreateEncoder;
            }
        };
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) nativeGetSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
