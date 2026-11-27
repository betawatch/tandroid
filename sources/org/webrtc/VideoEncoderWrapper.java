package org.webrtc;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderWrapper;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
class VideoEncoderWrapper {

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    interface Natives {
        void onEncodedFrame(long j, EncodedImage encodedImage);
    }

    public static NativeEncoderCallback createEncoderCallback(long j) {
        return new NativeEncoderCallback(j);
    }

    public static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    public static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    public static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.on;
    }

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    static class NativeEncoderCallback implements VideoEncoder.Callback {
        private final NativeLifecycleLock lifecycleLock;

        public NativeEncoderCallback(long j) {
            this.lifecycleLock = new NativeLifecycleLock("VideoEncoderWrapper", j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onEncodedFrame$0(EncodedImage encodedImage, long j) {
            VideoEncoderWrapperJni.get().onEncodedFrame(j, encodedImage);
        }

        public void invalidate() {
            this.lifecycleLock.dispose(new g((byte) 1));
        }

        @Override // org.webrtc.VideoEncoder.Callback
        public void onEncodedFrame(final EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
            this.lifecycleLock.runIfAlive(new NativeLifecycleLock.NativePointerRunnable() { // from class: org.webrtc.i
                @Override // org.webrtc.NativeLifecycleLock.NativePointerRunnable
                public final void run(long j) {
                    VideoEncoderWrapper.NativeEncoderCallback.lambda$onEncodedFrame$0(EncodedImage.this, j);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$invalidate$1(long j) {
        }
    }
}
