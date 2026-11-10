package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Components.qt;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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

    @Override // u2.l
    public final void a(int i7, int i10, int i11, long j3) {
        this.a.queueInputBuffer(i7, 0, i10, j3, i11);
    }

    @Override // u2.l
    public final void b(int i7, k2.d dVar, long j3, int i10) {
        this.a.queueSecureInputBuffer(i7, 0, dVar.i, j3, i10);
    }

    @Override // u2.l
    public final void c(int i7) {
        this.a.releaseOutputBuffer(i7, false);
    }

    @Override // u2.l
    public final void d() {
        this.a.detachOutputSurface();
    }

    @Override // u2.l
    public final void e(int i7, long j3) {
        this.a.releaseOutputBuffer(i7, j3);
    }

    @Override // u2.l
    public final int f() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // u2.l
    public final void flush() {
        this.a.flush();
    }

    @Override // u2.l
    public final int g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // u2.l
    public final ByteBuffer getInputBuffer(int i7) {
        return this.a.getInputBuffer(i7);
    }

    @Override // u2.l
    public final ByteBuffer getOutputBuffer(int i7) {
        return this.a.getOutputBuffer(i7);
    }

    @Override // u2.l
    public final MediaFormat getOutputFormat() {
        return this.a.getOutputFormat();
    }

    @Override // u2.l
    public final void h(d3.k kVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new a(this, kVar, 1), handler);
    }

    @Override // u2.l
    public final void i(int i7) {
        this.a.setVideoScalingMode(i7);
    }

    @Override // u2.l
    public final void j(org.telegram.ui.web.s sVar) {
        sVar.run();
    }

    @Override // u2.l
    public final void k(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // u2.l
    public final /* synthetic */ boolean l(qt qtVar) {
        return false;
    }

    @Override // u2.l
    public final void m(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // u2.l
    public final void n(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override // u2.l
    public final void release() {
        j jVar = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30 && i7 < 33) {
                mediaCodec.stop();
            }
            if (i7 >= 35 && jVar != null) {
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

    @Override // u2.l
    public final void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }
}
