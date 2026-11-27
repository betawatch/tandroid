package org.webrtc;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderWrapper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class VideoDecoderWrapper {

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    interface Natives {
        void onDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);
    }

    public static NativeDecoderCallback createDecoderCallback(long j) {
        return new NativeDecoderCallback(j);
    }

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
