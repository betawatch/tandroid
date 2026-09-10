package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class x implements l {
    public final MediaCodec a;
    public final j b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.a = mediaCodec;
        this.b = jVar;
        if (Build.VERSION.SDK_INT < 35 || jVar == null) {
            return;
        }
        jVar.a(mediaCodec);
    }

    @Override // r2.l
    public final void a(long j3, int i10, int i11, int i12) {
        this.a.queueInputBuffer(i10, 0, i11, j3, i12);
    }

    @Override // r2.l
    public final void b(int i10, h2.d dVar, long j3, int i11) {
        this.a.queueSecureInputBuffer(i10, 0, dVar.i, j3, i11);
    }

    @Override // r2.l
    public final void c(int i10) {
        this.a.releaseOutputBuffer(i10, false);
    }

    @Override // r2.l
    public final void d(a3.m mVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new a(this, mVar, 1), handler);
    }

    @Override // r2.l
    public final void e() {
        this.a.detachOutputSurface();
    }

    @Override // r2.l
    public final void f(int i10, long j3) {
        this.a.releaseOutputBuffer(i10, j3);
    }

    @Override // r2.l
    public final void flush() {
        this.a.flush();
    }

    @Override // r2.l
    public final int g() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // r2.l
    public final ByteBuffer getInputBuffer(int i10) {
        return this.a.getInputBuffer(i10);
    }

    @Override // r2.l
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.a.getOutputBuffer(i10);
    }

    @Override // r2.l
    public final MediaFormat getOutputFormat() {
        return this.a.getOutputFormat();
    }

    @Override // r2.l
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // r2.l
    public final void i(int i10) {
        this.a.setVideoScalingMode(i10);
    }

    @Override // r2.l
    public final void j(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // r2.l
    public final /* synthetic */ boolean k(o0.b bVar) {
        return false;
    }

    @Override // r2.l
    public final void release() {
        j jVar = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && i10 < 33) {
                mediaCodec.stop();
            }
            if (i10 >= 35 && jVar != null) {
                jVar.c(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
                jVar.c(mediaCodec);
            }
            mediaCodec.release();
            throw th2;
        }
    }

    @Override // r2.l
    public final void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }
}
