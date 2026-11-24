package org.webrtc;

import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public class VideoFrame implements RefCounted {
    private final Buffer buffer;
    private final int rotation;
    private final long timestampNs;

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    public interface Buffer extends RefCounted {
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        int getBufferType();

        int getHeight();

        int getWidth();

        @Override // org.webrtc.RefCounted
        void release();

        @Override // org.webrtc.RefCounted
        void retain();

        I420Buffer toI420();
    }

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    public interface I420Buffer extends Buffer {
        @Override // org.webrtc.VideoFrame.Buffer
        int getBufferType();

        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    public interface TextureBuffer extends Buffer {

        /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
        public enum Type {
            OES(36197),
            RGB(3553);

            private final int glTarget;

            Type(int i) {
                this.glTarget = i;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }

        TextureBuffer applyTransformMatrix(Matrix matrix, int i, int i2);

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();

        int getUnscaledHeight();

        int getUnscaledWidth();
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        if (buffer == null) {
            w26.j("buffer not allowed to be null");
            throw null;
        }
        if (i % 90 != 0) {
            w26.j("rotation must be a multiple of 90");
            throw null;
        }
        this.buffer = buffer;
        this.rotation = i;
        this.timestampNs = j;
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotatedHeight() {
        int i = this.rotation % kk7.J2;
        Buffer buffer = this.buffer;
        return i == 0 ? buffer.getHeight() : buffer.getWidth();
    }

    public int getRotatedWidth() {
        int i = this.rotation % kk7.J2;
        Buffer buffer = this.buffer;
        return i == 0 ? buffer.getWidth() : buffer.getHeight();
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        this.buffer.release();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.buffer.retain();
    }
}
