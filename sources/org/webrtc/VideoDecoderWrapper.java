package org.webrtc;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderWrapper;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
class VideoDecoderWrapper {

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    interface Natives {
        void onDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);
    }

    public static NativeDecoderCallback createDecoderCallback(long j) {
        return new NativeDecoderCallback(j);
    }

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    static class NativeDecoderCallback implements VideoDecoder.Callback {
        private final NativeLifecycleLock lifecycleLock;

        public NativeDecoderCallback(long j) {
            this.lifecycleLock = new NativeLifecycleLock("VideoDecoderWrapper", j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onDecodedFrame$0(VideoFrame videoFrame, Integer num, Integer num2, long j) {
            VideoDecoderWrapperJni.get().onDecodedFrame(j, videoFrame, num, num2);
        }

        public void invalidate() {
            this.lifecycleLock.dispose(new g((byte) 0));
        }

        @Override // org.webrtc.VideoDecoder.Callback
        public void onDecodedFrame(final VideoFrame videoFrame, final Integer num, final Integer num2) {
            this.lifecycleLock.runIfAlive(new NativeLifecycleLock.NativePointerRunnable() { // from class: org.webrtc.h
                @Override // org.webrtc.NativeLifecycleLock.NativePointerRunnable
                public final void run(long j) {
                    VideoDecoderWrapper.NativeDecoderCallback.lambda$onDecodedFrame$0(VideoFrame.this, num, num2, j);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$invalidate$1(long j) {
        }
    }
}
