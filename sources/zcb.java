// default package

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zcb implements ek6 {
    public final MediaCodec a;
    public final bg6 b;

    public zcb(MediaCodec mediaCodec, bg6 bg6Var) {
        this.a = mediaCodec;
        this.b = bg6Var;
        if (Build.VERSION.SDK_INT < 35 || bg6Var == null) {
            return;
        }
        bg6Var.a(mediaCodec);
    }

    @Override // ek6
    public final void a(int i, o33 o33Var, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, o33Var.i, j, i2);
    }

    @Override // ek6
    public final void b(int i, int i2, int i3, long j) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // ek6
    public final void c(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // ek6
    public final boolean d(s34 s34Var) {
        return false;
    }

    @Override // ek6
    public final void e() {
        this.a.detachOutputSurface();
    }

    @Override // ek6
    public final void f(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // ek6
    public final void flush() {
        this.a.flush();
    }

    @Override // ek6
    public final int g() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // ek6
    public final ByteBuffer getInputBuffer(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // ek6
    public final ByteBuffer getOutputBuffer(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // ek6
    public final MediaFormat getOutputFormat() {
        return this.a.getOutputFormat();
    }

    @Override // ek6
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // ek6
    public final void i(jnb jnbVar) {
        jnbVar.run();
    }

    @Override // ek6
    public final void j(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // ek6
    public final void k(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // ek6
    public final void l(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // ek6
    public final void m(uk6 uk6Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new ox(this, uk6Var, (byte) 1), handler);
    }

    @Override // ek6
    public final void n(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override // ek6
    public final void release() {
        bg6 bg6Var = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && bg6Var != null) {
                bg6Var.c(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && bg6Var != null) {
                bg6Var.c(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // ek6
    public final void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }
}
