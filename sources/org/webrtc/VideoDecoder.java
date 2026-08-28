package org.webrtc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public interface VideoDecoder {

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public interface Callback {
        void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2);
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z10, long j10) {
            this.isMissingFrames = z10;
            this.renderTimeMs = j10;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class Settings {
        public final int height;
        public final int numberOfCores;
        public final int width;

        public Settings(int i9, int i10, int i11) {
            this.numberOfCores = i9;
            this.width = i10;
            this.height = i11;
        }
    }

    long createNative(long j10);

    VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo);

    String getImplementationName();

    VideoCodecStatus initDecode(Settings settings, Callback callback);

    VideoCodecStatus release();
}
