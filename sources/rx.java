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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class rx implements ek6 {
    public final MediaCodec a;
    public final ux b;
    public final gk6 c;
    public final bg6 d;
    public boolean e;
    public byte f = 0;

    public rx(MediaCodec mediaCodec, HandlerThread handlerThread, gk6 gk6Var, bg6 bg6Var) {
        this.a = mediaCodec;
        this.b = new ux(handlerThread);
        this.c = gk6Var;
        this.d = bg6Var;
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

    @Override // ek6
    public final void a(int i, o33 o33Var, long j, int i2) {
        this.c.a(i, o33Var, j, i2);
    }

    @Override // ek6
    public final void b(int i, int i2, int i3, long j) {
        this.c.b(i, i2, i3, j);
    }

    @Override // ek6
    public final void c(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // ek6
    public final boolean d(s34 s34Var) {
        ux uxVar = this.b;
        synchronized (uxVar.a) {
            uxVar.o = s34Var;
        }
        return true;
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
        this.c.flush();
        this.a.flush();
        ux uxVar = this.b;
        synchronized (uxVar.a) {
            uxVar.l++;
            Handler handler = uxVar.c;
            String str = g8c.a;
            handler.post(new b1(uxVar, (byte) 26));
        }
        this.a.start();
    }

    @Override // ek6
    public final int g() {
        this.c.c();
        ux uxVar = this.b;
        synchronized (uxVar.a) {
            uxVar.b();
            int i = -1;
            if (uxVar.l > 0 || uxVar.m) {
                return -1;
            }
            on onVar = uxVar.d;
            int i2 = onVar.b;
            int i3 = onVar.c;
            if (!(i2 == i3)) {
                if (i2 == i3) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                i = onVar.a[i2];
                onVar.b = (i2 + 1) & onVar.d;
            }
            return i;
        }
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
        MediaFormat mediaFormat;
        ux uxVar = this.b;
        synchronized (uxVar.a) {
            mediaFormat = uxVar.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // ek6
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        this.c.c();
        ux uxVar = this.b;
        synchronized (uxVar.a) {
            uxVar.b();
            if (uxVar.l > 0 || uxVar.m) {
                return -1;
            }
            on onVar = uxVar.e;
            int i = onVar.b;
            int i2 = onVar.c;
            if (i == i2) {
                return -1;
            }
            if (i == i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = onVar.a[i];
            onVar.b = (i + 1) & onVar.d;
            if (i3 >= 0) {
                uxVar.h.getClass();
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) uxVar.f.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (i3 == -2) {
                uxVar.h = (MediaFormat) uxVar.g.remove();
            }
            return i3;
        }
    }

    @Override // ek6
    public final void i(jnb jnbVar) {
        ux uxVar = this.b;
        synchronized (uxVar.a) {
            uxVar.b();
            this.c.c();
            jnbVar.run();
        }
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
        this.a.setOnFrameRenderedListener(new ox(this, uk6Var, (byte) 0), handler);
    }

    @Override // ek6
    public final void n(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    public final void p(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        bg6 bg6Var;
        ux uxVar = this.b;
        HandlerThread handlerThread = uxVar.b;
        gre.p(uxVar.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.a;
        mediaCodec.setCallback(uxVar, handler);
        uxVar.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        this.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (bg6Var = this.d) != null) {
            bg6Var.a(mediaCodec);
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
    @Override // ek6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void release() {
        bg6 bg6Var;
        bg6 bg6Var2;
        bg6 bg6Var3;
        try {
            if (this.f == 1) {
                this.c.shutdown();
                ux uxVar = this.b;
                synchronized (uxVar.a) {
                    try {
                        uxVar.m = true;
                        uxVar.b.quit();
                        uxVar.a();
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
                if (i >= 35 && (bg6Var3 = this.d) != null) {
                    bg6Var3.c(this.a);
                }
                this.a.release();
                this.e = true;
            } catch (Throwable th) {
                th = th;
                if (Build.VERSION.SDK_INT >= 35) {
                    bg6Var = this.d;
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
                    if (i2 >= 35 && (bg6Var2 = this.d) != null) {
                        bg6Var2.c(this.a);
                    }
                    this.a.release();
                    this.e = true;
                } catch (Throwable th3) {
                    th = th3;
                    if (Build.VERSION.SDK_INT >= 35) {
                        bg6Var = this.d;
                    }
                    this.a.release();
                    this.e = true;
                    throw th;
                }
            }
            throw th2;
        }
    }

    @Override // ek6
    public final void setParameters(Bundle bundle) {
        this.c.setParameters(bundle);
    }
}
