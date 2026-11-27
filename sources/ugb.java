// default package

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ugb implements jm6 {
    public final MediaCodec a;
    public final fi6 b;

    public ugb(MediaCodec mediaCodec, fi6 fi6Var) {
        this.a = mediaCodec;
        this.b = fi6Var;
        if (Build.VERSION.SDK_INT < 35 || fi6Var == null) {
            return;
        }
        fi6Var.a(mediaCodec);
    }

    @Override // jm6
    public final void a(int i, g43 g43Var, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, g43Var.i, j, i2);
    }

    @Override // jm6
    public final void b(int i, int i2, int i3, long j) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // jm6
    public final void c(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // jm6
    public final boolean d(aj3 aj3Var) {
        return false;
    }

    @Override // jm6
    public final void e() {
        this.a.detachOutputSurface();
    }

    @Override // jm6
    public final void f(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // jm6
    public final void flush() {
        this.a.flush();
    }

    @Override // jm6
    public final int g() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // jm6
    public final ByteBuffer getInputBuffer(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // jm6
    public final ByteBuffer getOutputBuffer(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // jm6
    public final MediaFormat getOutputFormat() {
        return this.a.getOutputFormat();
    }

    @Override // jm6
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // jm6
    public final void i(jrb jrbVar) {
        jrbVar.run();
    }

    @Override // jm6
    public final void j(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // jm6
    public final void k(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // jm6
    public final void l(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // jm6
    public final void m(an6 an6Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new px(this, an6Var, (byte) 1), handler);
    }

    @Override // jm6
    public final void n(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override // jm6
    public final void release() {
        fi6 fi6Var = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && fi6Var != null) {
                fi6Var.c(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && fi6Var != null) {
                fi6Var.c(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // jm6
    public final void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }
}
