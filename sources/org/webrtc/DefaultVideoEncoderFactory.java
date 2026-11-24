package org.webrtc;

import java.util.Arrays;
import java.util.LinkedHashSet;
import org.webrtc.EglBase;
import org.webrtc.VideoEncoderFactory;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public class DefaultVideoEncoderFactory implements VideoEncoderFactory {
    private final VideoEncoderFactory hardwareVideoEncoderFactory;
    private final VideoEncoderFactory softwareVideoEncoderFactory = new SoftwareVideoEncoderFactory();

    public DefaultVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2) {
        this.hardwareVideoEncoderFactory = new HardwareVideoEncoderFactory(context, z, z2);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        VideoEncoder createEncoder = this.softwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        VideoEncoder createEncoder2 = this.hardwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        return createEncoder2 != null ? createEncoder != null ? new VideoEncoderFallback(createEncoder, createEncoder2) : createEncoder2 : createEncoder;
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
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(Arrays.asList(this.softwareVideoEncoderFactory.getSupportedCodecs()));
        linkedHashSet.addAll(Arrays.asList(this.hardwareVideoEncoderFactory.getSupportedCodecs()));
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[linkedHashSet.size()]);
    }

    public DefaultVideoEncoderFactory(VideoEncoderFactory videoEncoderFactory) {
        this.hardwareVideoEncoderFactory = videoEncoderFactory;
    }
}
