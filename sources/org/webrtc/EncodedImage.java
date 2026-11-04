package org.webrtc;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public class EncodedImage implements RefCounted {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;
    public final Integer qp;
    private final RefCountDelegate refCountDelegate;
    public final int rotation;

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public static class Builder {
        private ByteBuffer buffer;
        private long captureTimeNs;
        private int encodedHeight;
        private int encodedWidth;
        private FrameType frameType;
        private Integer qp;
        private Runnable releaseCallback;
        private int rotation;

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.releaseCallback, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.qp);
        }

        public Builder setBuffer(ByteBuffer byteBuffer, Runnable runnable) {
            this.buffer = byteBuffer;
            this.releaseCallback = runnable;
            return this;
        }

        @Deprecated
        public Builder setCaptureTimeMs(long j10) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j10);
            return this;
        }

        public Builder setCaptureTimeNs(long j10) {
            this.captureTimeNs = j10;
            return this;
        }

        public Builder setEncodedHeight(int i3) {
            this.encodedHeight = i3;
            return this;
        }

        public Builder setEncodedWidth(int i3) {
            this.encodedWidth = i3;
            return this;
        }

        public Builder setFrameType(FrameType frameType) {
            this.frameType = frameType;
            return this;
        }

        public Builder setQp(Integer num) {
            this.qp = num;
            return this;
        }

        public Builder setRotation(int i3) {
            this.rotation = i3;
            return this;
        }

        private Builder() {
        }
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);

        private final int nativeIndex;

        FrameType(int i3) {
            this.nativeIndex = i3;
        }

        public static FrameType fromNativeIndex(int i3) {
            for (FrameType frameType : values()) {
                if (frameType.getNative() == i3) {
                    return frameType;
                }
            }
            throw new IllegalArgumentException(p1.i(i3, "Unknown native frame type: "));
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private ByteBuffer getBuffer() {
        return this.buffer;
    }

    private long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    private int getEncodedHeight() {
        return this.encodedHeight;
    }

    private int getEncodedWidth() {
        return this.encodedWidth;
    }

    private int getFrameType() {
        return this.frameType.getNative();
    }

    private Integer getQp() {
        return this.qp;
    }

    private int getRotation() {
        return this.rotation;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    private EncodedImage(ByteBuffer byteBuffer, Runnable runnable, int i3, int i10, long j10, FrameType frameType, int i11, Integer num) {
        this.buffer = byteBuffer;
        this.encodedWidth = i3;
        this.encodedHeight = i10;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j10);
        this.captureTimeNs = j10;
        this.frameType = frameType;
        this.rotation = i11;
        this.qp = num;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}
