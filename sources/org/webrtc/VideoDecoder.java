package org.webrtc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public interface VideoDecoder {

    /* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
    public interface Callback {
        void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2);
    }

    /* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z10, long j3) {
            this.isMissingFrames = z10;
            this.renderTimeMs = j3;
        }
    }

    /* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
    public static class Settings {
        public final int height;
        public final int numberOfCores;
        public final int width;

        public Settings(int i10, int i11, int i12) {
            this.numberOfCores = i10;
            this.width = i11;
            this.height = i12;
        }
    }

    long createNative(long j3);

    VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo);

    String getImplementationName();

    VideoCodecStatus initDecode(Settings settings, Callback callback);

    VideoCodecStatus release();
}
