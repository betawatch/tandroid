package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class MediaCodecWrapperImpl implements MediaCodecWrapper {
        private final MediaCodec mediaCodec;

        public MediaCodecWrapperImpl(MediaCodec mediaCodec) {
            this.mediaCodec = mediaCodec;
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public int dequeueInputBuffer(long j10) {
            return this.mediaCodec.dequeueInputBuffer(j10);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j10) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j10);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void flush() {
            this.mediaCodec.flush();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public MediaCodecInfo getCodecInfo() {
            return this.mediaCodec.getCodecInfo();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public ByteBuffer getInputBuffer(int i10) {
            return this.mediaCodec.getInputBuffer(i10);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public MediaFormat getInputFormat() {
            return this.mediaCodec.getInputFormat();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public ByteBuffer getOutputBuffer(int i10) {
            return this.mediaCodec.getOutputBuffer(i10);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
            this.mediaCodec.queueInputBuffer(i10, i11, i12, j10, i13);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void release() {
            this.mediaCodec.release();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void releaseOutputBuffer(int i10, boolean z4) {
            this.mediaCodec.releaseOutputBuffer(i10, z4);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void setParameters(Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void start() {
            this.mediaCodec.start();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void stop() {
            this.mediaCodec.stop();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public MediaFormat getOutputFormat(int i10) {
            return this.mediaCodec.getOutputFormat(i10);
        }
    }

    @Override // org.webrtc.MediaCodecWrapperFactory
    public MediaCodecWrapper createByCodecName(String str) {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(str));
    }
}
