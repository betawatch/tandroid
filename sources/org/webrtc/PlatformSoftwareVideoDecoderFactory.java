package org.webrtc;

import android.media.MediaCodecInfo;
import org.webrtc.EglBase;
import org.webrtc.Predicate;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public class PlatformSoftwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    private static final Predicate<MediaCodecInfo> defaultAllowedPredicate = new Predicate<MediaCodecInfo>() { // from class: org.webrtc.PlatformSoftwareVideoDecoderFactory.1
        @Override // org.webrtc.Predicate
        public final /* synthetic */ Predicate<MediaCodecInfo> and(Predicate<? super MediaCodecInfo> predicate) {
            return Predicate.-CC.a(this, predicate);
        }

        @Override // org.webrtc.Predicate
        public final /* synthetic */ Predicate<MediaCodecInfo> negate() {
            return Predicate.-CC.b(this);
        }

        @Override // org.webrtc.Predicate
        public final /* synthetic */ Predicate<MediaCodecInfo> or(Predicate<? super MediaCodecInfo> predicate) {
            return Predicate.-CC.c(this, predicate);
        }

        @Override // org.webrtc.Predicate
        public boolean test(MediaCodecInfo mediaCodecInfo) {
            return MediaCodecUtils.isSoftwareOnly(mediaCodecInfo);
        }
    };

    public PlatformSoftwareVideoDecoderFactory(EglBase.Context context) {
        super(context, defaultAllowedPredicate);
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }
}
