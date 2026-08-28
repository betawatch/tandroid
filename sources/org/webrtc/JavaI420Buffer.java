package org.webrtc;

import j3.r0;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class JavaI420Buffer implements VideoFrame.I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    private JavaI420Buffer(int i9, int i10, ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, Runnable runnable) {
        this.width = i9;
        this.height = i10;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i11;
        this.strideU = i12;
        this.strideV = i13;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static JavaI420Buffer allocate(int i9, int i10) {
        int i11 = (i10 + 1) / 2;
        int i12 = (i9 + 1) / 2;
        int i13 = i9 * i10;
        int i14 = i12 * i11;
        int i15 = i13 + i14;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i12 * 2 * i11) + i13);
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i13);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i13);
        nativeAllocateByteBuffer.limit(i15);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i15);
        nativeAllocateByteBuffer.limit(i15 + i14);
        return new JavaI420Buffer(i9, i10, slice, i9, slice2, i12, nativeAllocateByteBuffer.slice(), i12, new j(0, nativeAllocateByteBuffer));
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i9, int i10, int i11) {
        int e10 = e2.c.e(i10, 1, i11, i9);
        if (byteBuffer.capacity() >= e10) {
            return;
        }
        StringBuilder p6 = r0.p(e10, "Buffer must be at least ", " bytes, but was ");
        p6.append(byteBuffer.capacity());
        throw new IllegalArgumentException(p6.toString());
    }

    public static VideoFrame.Buffer cropAndScaleI420(VideoFrame.I420Buffer i420Buffer, int i9, int i10, int i11, int i12, int i13, int i14) {
        if (i11 != i13 || i12 != i14) {
            JavaI420Buffer allocate = allocate(i13, i14);
            nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i9, i10, i11, i12, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i13, i14);
            return allocate;
        }
        ByteBuffer dataY = i420Buffer.getDataY();
        ByteBuffer dataU = i420Buffer.getDataU();
        ByteBuffer dataV = i420Buffer.getDataV();
        dataY.position((i420Buffer.getStrideY() * i10) + i9);
        int i15 = i9 / 2;
        int i16 = i10 / 2;
        dataU.position((i420Buffer.getStrideU() * i16) + i15);
        dataV.position((i420Buffer.getStrideV() * i16) + i15);
        i420Buffer.retain();
        return wrap(i13, i14, dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), new h(i420Buffer, 1));
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, int i12, int i13, int i14, int i15, ByteBuffer byteBuffer4, int i16, ByteBuffer byteBuffer5, int i17, ByteBuffer byteBuffer6, int i18, int i19, int i20);

    public static JavaI420Buffer wrap(int i9, int i10, ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new IllegalArgumentException("Data buffers cannot be null.");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        ByteBuffer slice = byteBuffer.slice();
        ByteBuffer slice2 = byteBuffer2.slice();
        ByteBuffer slice3 = byteBuffer3.slice();
        int i14 = (i9 + 1) / 2;
        int i15 = (i10 + 1) / 2;
        checkCapacity(slice, i9, i10, i11);
        checkCapacity(slice2, i14, i15, i12);
        checkCapacity(slice3, i14, i15, i13);
        return new JavaI420Buffer(i9, i10, slice, i11, slice2, i12, slice3, i13, runnable);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i9, int i10, int i11, int i12, int i13, int i14) {
        return cropAndScaleI420(this, i9, i10, i11, i12, i13, i14);
    }

    @Override // org.webrtc.VideoFrame.I420Buffer, org.webrtc.VideoFrame.Buffer
    public final /* synthetic */ int getBufferType() {
        return b0.a(this);
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }
}
