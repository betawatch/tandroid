package y3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import d5.f0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x implements k {
    public final MediaCodec a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;

    public x(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (f0.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // y3.k
    public final void a(long j10, int i9, int i10, int i11) {
        this.a.queueInputBuffer(i9, 0, i10, j10, i11);
    }

    @Override // y3.k
    public final void b(int i9, long j10) {
        this.a.releaseOutputBuffer(i9, j10);
    }

    @Override // y3.k
    public final int c() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // y3.k
    public final int d(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && f0.a < 21) {
                this.c = mediaCodec.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // y3.k
    public final void e(int i9, k3.d dVar, long j10) {
        this.a.queueSecureInputBuffer(i9, 0, dVar.i, j10, 0);
    }

    @Override // y3.k
    public final void f(int i9) {
        this.a.setVideoScalingMode(i9);
    }

    @Override // y3.k
    public final void flush() {
        this.a.flush();
    }

    @Override // y3.k
    public final void g(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // y3.k
    public final ByteBuffer getInputBuffer(int i9) {
        return f0.a >= 21 ? this.a.getInputBuffer(i9) : this.b[i9];
    }

    @Override // y3.k
    public final ByteBuffer getOutputBuffer(int i9) {
        return f0.a >= 21 ? this.a.getOutputBuffer(i9) : this.c[i9];
    }

    @Override // y3.k
    public final MediaFormat getOutputFormat() {
        return this.a.getOutputFormat();
    }

    @Override // y3.k
    public final void h(e5.i iVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new a(this, iVar, 1), handler);
    }

    @Override // y3.k
    public final void release() {
        this.b = null;
        this.c = null;
        this.a.release();
    }

    @Override // y3.k
    public final void releaseOutputBuffer(int i9, boolean z10) {
        this.a.releaseOutputBuffer(i9, z10);
    }

    @Override // y3.k
    public final void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }
}
