package org.webrtc;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public interface VideoDecoder {

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
    public interface Callback {
        void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2);
    }

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z9, long j3) {
            this.isMissingFrames = z9;
            this.renderTimeMs = j3;
        }
    }

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
    public static class Settings {
        public final int height;
        public final int numberOfCores;
        public final int width;

        public Settings(int i7, int i10, int i11) {
            this.numberOfCores = i7;
            this.width = i10;
            this.height = i11;
        }
    }

    long createNative(long j3);

    VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo);

    String getImplementationName();

    VideoCodecStatus initDecode(Settings settings, Callback callback);

    VideoCodecStatus release();
}
