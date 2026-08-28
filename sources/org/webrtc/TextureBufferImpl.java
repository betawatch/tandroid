package org.webrtc;

import android.graphics.Matrix;
import android.os.Handler;
import java.util.concurrent.Callable;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private final int height;
    private final int id;
    private final RefCountDelegate refCountDelegate;
    private final RefCountMonitor refCountMonitor;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int unscaledHeight;
    private final int unscaledWidth;
    private final int width;
    private final YuvConverter yuvConverter;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public interface RefCountMonitor {
        void onDestroy(TextureBufferImpl textureBufferImpl);

        void onRelease(TextureBufferImpl textureBufferImpl);

        void onRetain(TextureBufferImpl textureBufferImpl);
    }

    public TextureBufferImpl(int i9, int i10, VideoFrame.TextureBuffer.Type type, int i11, Matrix matrix, Handler handler, YuvConverter yuvConverter, final Runnable runnable) {
        this(i9, i10, i9, i10, type, i11, matrix, handler, yuvConverter, new RefCountMonitor() { // from class: org.webrtc.TextureBufferImpl.1
            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRelease(TextureBufferImpl textureBufferImpl) {
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRetain(TextureBufferImpl textureBufferImpl) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(RefCountMonitor refCountMonitor) {
        refCountMonitor.onDestroy(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ VideoFrame.I420Buffer lambda$toI420$1() {
        return this.yuvConverter.convert(this);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i9, int i10, int i11, int i12, int i13, int i14) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(i9 / this.width, (r1 - (i10 + i12)) / this.height);
        matrix.preScale(i11 / this.width, i12 / this.height);
        return applyTransformMatrix(matrix, Math.round((this.unscaledWidth * i11) / this.width), Math.round((this.unscaledHeight * i12) / this.height), i13, i14);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final /* synthetic */ int getBufferType() {
        return a0.a(this);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.id;
    }

    public Handler getToI420Handler() {
        return this.toI420Handler;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getUnscaledHeight() {
        return this.unscaledHeight;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    public YuvConverter getYuvConverter() {
        return this.yuvConverter;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.refCountMonitor.onRelease(this);
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.refCountMonitor.onRetain(this);
        this.refCountDelegate.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: org.webrtc.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                VideoFrame.I420Buffer lambda$toI420$1;
                lambda$toI420$1 = TextureBufferImpl.this.lambda$toI420$1();
                return lambda$toI420$1;
            }
        });
    }

    public TextureBufferImpl(int i9, int i10, VideoFrame.TextureBuffer.Type type, int i11, Matrix matrix, Handler handler, YuvConverter yuvConverter, RefCountMonitor refCountMonitor) {
        this(i9, i10, i9, i10, type, i11, matrix, handler, yuvConverter, refCountMonitor);
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public TextureBufferImpl applyTransformMatrix(Matrix matrix, int i9, int i10) {
        return applyTransformMatrix(matrix, i9, i10, i9, i10);
    }

    private TextureBufferImpl(int i9, int i10, int i11, int i12, VideoFrame.TextureBuffer.Type type, int i13, Matrix matrix, Handler handler, YuvConverter yuvConverter, RefCountMonitor refCountMonitor) {
        this.unscaledWidth = i9;
        this.unscaledHeight = i10;
        this.width = i11;
        this.height = i12;
        this.type = type;
        this.id = i13;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(new s(0, this, refCountMonitor));
        this.refCountMonitor = refCountMonitor;
    }

    private TextureBufferImpl applyTransformMatrix(Matrix matrix, int i9, int i10, int i11, int i12) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        retain();
        return new TextureBufferImpl(i9, i10, i11, i12, this.type, this.id, matrix2, this.toI420Handler, this.yuvConverter, new RefCountMonitor() { // from class: org.webrtc.TextureBufferImpl.2
            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                TextureBufferImpl.this.release();
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRelease(TextureBufferImpl textureBufferImpl) {
                TextureBufferImpl.this.refCountMonitor.onRelease(TextureBufferImpl.this);
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRetain(TextureBufferImpl textureBufferImpl) {
                TextureBufferImpl.this.refCountMonitor.onRetain(TextureBufferImpl.this);
            }
        });
    }
}
