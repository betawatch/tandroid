package t2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Components.i9;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // t2.l
    public final void a(int i3, j2.d dVar, long j10, int i10) {
        this.a.queueSecureInputBuffer(i3, 0, dVar.i, j10, i10);
    }

    @Override // t2.l
    public final void b(int i3, int i10, int i11, long j10) {
        this.a.queueInputBuffer(i3, 0, i10, j10, i11);
    }

    @Override // t2.l
    public final void c(int i3) {
        this.a.releaseOutputBuffer(i3, false);
    }

    @Override // t2.l
    public final void d() {
        this.a.detachOutputSurface();
    }

    @Override // t2.l
    public final void e(int i3, long j10) {
        this.a.releaseOutputBuffer(i3, j10);
    }

    @Override // t2.l
    public final int f() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // t2.l
    public final void flush() {
        this.a.flush();
    }

    @Override // t2.l
    public final void g(hc1 hc1Var) {
        hc1Var.run();
    }

    @Override // t2.l
    public final ByteBuffer getInputBuffer(int i3) {
        return this.a.getInputBuffer(i3);
    }

    @Override // t2.l
    public final ByteBuffer getOutputBuffer(int i3) {
        return this.a.getOutputBuffer(i3);
    }

    @Override // t2.l
    public final MediaFormat getOutputFormat() {
        return this.a.getOutputFormat();
    }

    @Override // t2.l
    public final void h(c3.k kVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new a(this, kVar, 1), handler);
    }

    @Override // t2.l
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // t2.l
    public final void j(int i3) {
        this.a.setVideoScalingMode(i3);
    }

    @Override // t2.l
    public final /* synthetic */ boolean k(i9 i9Var) {
        return false;
    }

    @Override // t2.l
    public final void l(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // t2.l
    public final void m(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // t2.l
    public final void n(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override // t2.l
    public final void release() {
        j jVar = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30 && i3 < 33) {
                mediaCodec.stop();
            }
            if (i3 >= 35 && jVar != null) {
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

    @Override // t2.l
    public final void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }
}
