package org.webrtc;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderWrapper;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
class VideoDecoderWrapper {

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    interface Natives {
        void onDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);
    }

    public static NativeDecoderCallback createDecoderCallback(long j) {
        return new NativeDecoderCallback(j);
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
