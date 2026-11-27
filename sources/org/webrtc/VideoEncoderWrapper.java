package org.webrtc;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderWrapper;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
class VideoEncoderWrapper {

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
