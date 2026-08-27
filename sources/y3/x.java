package y3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import d5.g0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x implements k {
    public final MediaCodec a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;

    public x(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (g0.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // y3.k
    public final void a(long j10, int i10, int i11, int i12) {
        this.a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // y3.k
    public final void b(int i10, long j10) {
        this.a.releaseOutputBuffer(i10, j10);
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
            if (dequeueOutputBuffer == -3 && g0.a < 21) {
                this.c = mediaCodec.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // y3.k
    public final void e(int i10, k3.d dVar, long j10) {
        this.a.queueSecureInputBuffer(i10, 0, dVar.i, j10, 0);
    }

    @Override // y3.k
    public final void f(int i10) {
        this.a.setVideoScalingMode(i10);
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
    public final ByteBuffer getInputBuffer(int i10) {
        return g0.a >= 21 ? this.a.getInputBuffer(i10) : this.b[i10];
    }

    @Override // y3.k
    public final ByteBuffer getOutputBuffer(int i10) {
        return g0.a >= 21 ? this.a.getOutputBuffer(i10) : this.c[i10];
    }

    @Override // y3.k
    public final MediaFormat getOutputFormat() {
        return this.a.getOutputFormat();
    }

    @Override // y3.k
    public final void h(e5.h hVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new a(this, hVar, 1), handler);
    }

    @Override // y3.k
    public final void release() {
        this.b = null;
        this.c = null;
        this.a.release();
    }

    @Override // y3.k
    public final void releaseOutputBuffer(int i10, boolean z10) {
        this.a.releaseOutputBuffer(i10, z10);
    }

    @Override // y3.k
    public final void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }
}
