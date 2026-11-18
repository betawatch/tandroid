package u2;

import a8.la;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import h2.l0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.web.z0;
import p4.o0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class c implements l {
    public final MediaCodec a;
    public final f b;
    public final m c;
    public final j d;
    public boolean e;
    public int f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.a = mediaCodec;
        this.b = new f(handlerThread);
        this.c = mVar;
        this.d = jVar;
    }

    public static void a(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
        j jVar;
        f fVar = cVar.b;
        MediaCodec mediaCodec = cVar.a;
        HandlerThread handlerThread = fVar.b;
        la.p(fVar.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i7);
        Trace.endSection();
        cVar.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f = 1;
    }

    public static String p(int i7, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i7 == 1) {
            sb2.append("Audio");
        } else if (i7 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i7);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // u2.l
    public final void b(int i7, int i10, int i11, long j3) {
        this.c.b(i7, i10, i11, j3);
    }

    @Override // u2.l
    public final void c(int i7, k2.d dVar, long j3, int i10) {
        this.c.c(i7, dVar, j3, i10);
    }

    @Override // u2.l
    public final void d(int i7) {
        this.a.releaseOutputBuffer(i7, false);
    }

    @Override // u2.l
    public final void e() {
        this.a.detachOutputSurface();
    }

    @Override // u2.l
    public final void f(int i7, long j3) {
        this.a.releaseOutputBuffer(i7, j3);
    }

    @Override // u2.l
    public final void flush() {
        this.c.flush();
        this.a.flush();
        f fVar = this.b;
        synchronized (fVar.a) {
            fVar.l++;
            Handler handler = fVar.c;
            String str = l0.a;
            handler.post(new z0(fVar, 22));
        }
        this.a.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x003e, B:23:0x0034, B:24:0x0040, B:25:0x0045), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x003e, B:23:0x0034, B:24:0x0040, B:25:0x0045), top: B:3:0x000a }] */
    @Override // u2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g() {
        boolean z10;
        this.c.j();
        f fVar = this.b;
        synchronized (fVar.a) {
            try {
                fVar.b();
                if (fVar.l <= 0 && !fVar.m) {
                    z10 = false;
                    int i7 = -1;
                    if (!z10) {
                        return -1;
                    }
                    h2.f fVar2 = fVar.d;
                    int i10 = fVar2.a;
                    int i11 = fVar2.b;
                    if (!(i10 == i11)) {
                        if (i10 == i11) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i7 = fVar2.d[i10];
                        fVar2.a = (i10 + 1) & fVar2.c;
                    }
                    return i7;
                }
                z10 = true;
                int i72 = -1;
                if (!z10) {
                }
            } finally {
            }
        }
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
        MediaFormat mediaFormat;
        f fVar = this.b;
        synchronized (fVar.a) {
            try {
                mediaFormat = fVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // u2.l
    public final void h(o0 o0Var) {
        f fVar = this.b;
        o0 o0Var2 = new o0(13, this, o0Var);
        synchronized (fVar.a) {
            fVar.b();
            o0Var2.run();
        }
    }

    @Override // u2.l
    public final boolean i(c5 c5Var) {
        f fVar = this.b;
        synchronized (fVar.a) {
            fVar.o = c5Var;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0042, B:25:0x0069, B:29:0x005f, B:30:0x006b, B:31:0x0070), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0042, B:25:0x0069, B:29:0x005f, B:30:0x006b, B:31:0x0070), top: B:3:0x000a }] */
    @Override // u2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        boolean z10;
        this.c.j();
        f fVar = this.b;
        synchronized (fVar.a) {
            try {
                fVar.b();
                if (fVar.l <= 0 && !fVar.m) {
                    z10 = false;
                    if (!z10) {
                        return -1;
                    }
                    h2.f fVar2 = fVar.e;
                    int i7 = fVar2.a;
                    int i10 = fVar2.b;
                    if (i7 == i10) {
                        return -1;
                    }
                    if (i7 == i10) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i11 = fVar2.d[i7];
                    fVar2.a = fVar2.c & (i7 + 1);
                    if (i11 >= 0) {
                        fVar.h.getClass();
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) fVar.f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i11 == -2) {
                        fVar.h = (MediaFormat) fVar.g.remove();
                    }
                    return i11;
                }
                z10 = true;
                if (!z10) {
                }
            } finally {
            }
        }
    }

    @Override // u2.l
    public final void k(d3.k kVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new a(this, kVar, 0), handler);
    }

    @Override // u2.l
    public final void l(int i7) {
        this.a.setVideoScalingMode(i7);
    }

    @Override // u2.l
    public final void m(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // u2.l
    public final void n(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // u2.l
    public final void o(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override // u2.l
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f == 1) {
                this.c.shutdown();
                f fVar = this.b;
                synchronized (fVar.a) {
                    fVar.m = true;
                    fVar.b.quit();
                    fVar.a();
                }
            }
            this.f = 2;
            if (this.e) {
                return;
            }
            try {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 30 && i7 < 33) {
                    this.a.stop();
                }
                if (i7 >= 35 && (jVar2 = this.d) != null) {
                    jVar2.c(this.a);
                }
                this.a.release();
                this.e = true;
            } finally {
            }
        } catch (Throwable th2) {
            if (!this.e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.a.stop();
                    }
                    if (i10 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.a);
                    }
                    this.a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override // u2.l
    public final void setParameters(Bundle bundle) {
        this.c.setParameters(bundle);
    }
}
