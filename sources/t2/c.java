package t2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import b8.zb;
import g2.n0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Components.i9;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public static void o(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i3) {
        j jVar;
        f fVar = cVar.b;
        MediaCodec mediaCodec = cVar.a;
        HandlerThread handlerThread = fVar.b;
        zb.p(fVar.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i3);
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

    public static String p(int i3, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i3 == 1) {
            sb2.append("Audio");
        } else if (i3 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i3);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // t2.l
    public final void a(int i3, j2.d dVar, long j10, int i10) {
        this.c.a(i3, dVar, j10, i10);
    }

    @Override // t2.l
    public final void b(int i3, int i10, int i11, long j10) {
        this.c.b(i3, i10, i11, j10);
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x003e, B:23:0x0034, B:24:0x0040, B:25:0x0045), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x003e, B:23:0x0034, B:24:0x0040, B:25:0x0045), top: B:3:0x000a }] */
    @Override // t2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f() {
        boolean z10;
        this.c.d();
        f fVar = this.b;
        synchronized (fVar.a) {
            try {
                fVar.b();
                if (fVar.l <= 0 && !fVar.m) {
                    z10 = false;
                    int i3 = -1;
                    if (!z10) {
                        return -1;
                    }
                    g2.g gVar = fVar.d;
                    int i10 = gVar.a;
                    int i11 = gVar.b;
                    if (!(i10 == i11)) {
                        if (i10 == i11) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i3 = gVar.d[i10];
                        gVar.a = (i10 + 1) & gVar.c;
                    }
                    return i3;
                }
                z10 = true;
                int i32 = -1;
                if (!z10) {
                }
            } finally {
            }
        }
    }

    @Override // t2.l
    public final void flush() {
        this.c.flush();
        this.a.flush();
        f fVar = this.b;
        synchronized (fVar.a) {
            fVar.l++;
            Handler handler = fVar.c;
            String str = n0.a;
            handler.post(new r4.u(fVar, 3));
        }
        this.a.start();
    }

    @Override // t2.l
    public final void g(hc1 hc1Var) {
        f fVar = this.b;
        hc1 hc1Var2 = new hc1(23, this, hc1Var);
        synchronized (fVar.a) {
            fVar.b();
            hc1Var2.run();
        }
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

    @Override // t2.l
    public final void h(c3.k kVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new a(this, kVar, 0), handler);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0042, B:25:0x0069, B:29:0x005f, B:30:0x006b, B:31:0x0070), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0042, B:25:0x0069, B:29:0x005f, B:30:0x006b, B:31:0x0070), top: B:3:0x000a }] */
    @Override // t2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        boolean z10;
        this.c.d();
        f fVar = this.b;
        synchronized (fVar.a) {
            try {
                fVar.b();
                if (fVar.l <= 0 && !fVar.m) {
                    z10 = false;
                    if (!z10) {
                        return -1;
                    }
                    g2.g gVar = fVar.e;
                    int i3 = gVar.a;
                    int i10 = gVar.b;
                    if (i3 == i10) {
                        return -1;
                    }
                    if (i3 == i10) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i11 = gVar.d[i3];
                    gVar.a = gVar.c & (i3 + 1);
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

    @Override // t2.l
    public final void j(int i3) {
        this.a.setVideoScalingMode(i3);
    }

    @Override // t2.l
    public final boolean k(i9 i9Var) {
        f fVar = this.b;
        synchronized (fVar.a) {
            fVar.o = i9Var;
        }
        return true;
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
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30 && i3 < 33) {
                    this.a.stop();
                }
                if (i3 >= 35 && (jVar2 = this.d) != null) {
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

    @Override // t2.l
    public final void setParameters(Bundle bundle) {
        this.c.setParameters(bundle);
    }
}
