// default package

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class sx implements jm6 {
    public final MediaCodec a;
    public final vx b;
    public final lm6 c;
    public final fi6 d;
    public boolean e;
    public byte f = 0;

    public sx(MediaCodec mediaCodec, HandlerThread handlerThread, lm6 lm6Var, fi6 fi6Var) {
        this.a = mediaCodec;
        this.b = new vx(handlerThread);
        this.c = lm6Var;
        this.d = fi6Var;
    }

    public static String o(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // jm6
    public final void a(int i, g43 g43Var, long j, int i2) {
        this.c.a(i, g43Var, j, i2);
    }

    @Override // jm6
    public final void b(int i, int i2, int i3, long j) {
        this.c.b(i, i2, i3, j);
    }

    @Override // jm6
    public final void c(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // jm6
    public final boolean d(aj3 aj3Var) {
        vx vxVar = this.b;
        synchronized (vxVar.a) {
            vxVar.o = aj3Var;
        }
        return true;
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
        this.c.flush();
        this.a.flush();
        vx vxVar = this.b;
        synchronized (vxVar.a) {
            vxVar.l++;
            Handler handler = vxVar.c;
            String str = gcc.a;
            handler.post(new c1(vxVar, (byte) 26));
        }
        this.a.start();
    }

    @Override // jm6
    public final int g() {
        this.c.c();
        vx vxVar = this.b;
        synchronized (vxVar.a) {
            vxVar.b();
            int i = -1;
            if (vxVar.l > 0 || vxVar.m) {
                return -1;
            }
            pn pnVar = vxVar.d;
            int i2 = pnVar.b;
            int i3 = pnVar.c;
            if (!(i2 == i3)) {
                if (i2 == i3) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                i = pnVar.a[i2];
                pnVar.b = (i2 + 1) & pnVar.d;
            }
            return i;
        }
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
        MediaFormat mediaFormat;
        vx vxVar = this.b;
        synchronized (vxVar.a) {
            mediaFormat = vxVar.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // jm6
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        this.c.c();
        vx vxVar = this.b;
        synchronized (vxVar.a) {
            vxVar.b();
            if (vxVar.l > 0 || vxVar.m) {
                return -1;
            }
            pn pnVar = vxVar.e;
            int i = pnVar.b;
            int i2 = pnVar.c;
            if (i == i2) {
                return -1;
            }
            if (i == i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = pnVar.a[i];
            pnVar.b = (i + 1) & pnVar.d;
            if (i3 >= 0) {
                vxVar.h.getClass();
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) vxVar.f.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (i3 == -2) {
                vxVar.h = (MediaFormat) vxVar.g.remove();
            }
            return i3;
        }
    }

    @Override // jm6
    public final void i(jrb jrbVar) {
        vx vxVar = this.b;
        synchronized (vxVar.a) {
            vxVar.b();
            this.c.c();
            jrbVar.run();
        }
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
        this.a.setOnFrameRenderedListener(new px(this, an6Var, (byte) 0), handler);
    }

    @Override // jm6
    public final void n(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    public final void p(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        fi6 fi6Var;
        vx vxVar = this.b;
        HandlerThread handlerThread = vxVar.b;
        yve.p(vxVar.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.a;
        mediaCodec.setCallback(vxVar, handler);
        vxVar.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        this.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (fi6Var = this.d) != null) {
            fi6Var.a(mediaCodec);
        }
        this.f = (byte) 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0051, code lost:
    
        if (r1 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        r1.c(r7.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x007f, code lost:
    
        if (r1 != null) goto L51;
     */
    @Override // jm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void release() {
        fi6 fi6Var;
        fi6 fi6Var2;
        fi6 fi6Var3;
        try {
            if (this.f == 1) {
                this.c.shutdown();
                vx vxVar = this.b;
                synchronized (vxVar.a) {
                    try {
                        vxVar.m = true;
                        vxVar.b.quit();
                        vxVar.a();
                    } finally {
                    }
                }
            }
            this.f = (byte) 2;
            if (this.e) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.a.stop();
                }
                if (i >= 35 && (fi6Var3 = this.d) != null) {
                    fi6Var3.c(this.a);
                }
                this.a.release();
                this.e = true;
            } catch (Throwable th) {
                th = th;
                if (Build.VERSION.SDK_INT >= 35) {
                    fi6Var = this.d;
                }
                this.a.release();
                this.e = true;
                throw th;
            }
        } catch (Throwable th2) {
            if (!this.e) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.a.stop();
                    }
                    if (i2 >= 35 && (fi6Var2 = this.d) != null) {
                        fi6Var2.c(this.a);
                    }
                    this.a.release();
                    this.e = true;
                } catch (Throwable th3) {
                    th = th3;
                    if (Build.VERSION.SDK_INT >= 35) {
                        fi6Var = this.d;
                    }
                    this.a.release();
                    this.e = true;
                    throw th;
                }
            }
            throw th2;
        }
    }

    @Override // jm6
    public final void setParameters(Bundle bundle) {
        this.c.setParameters(bundle);
    }
}
