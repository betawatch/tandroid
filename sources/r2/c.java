package r2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import e2.l0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.web.v1;
import ph.x1;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    public static void o(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        j jVar;
        f fVar = cVar.b;
        MediaCodec mediaCodec = cVar.a;
        HandlerThread handlerThread = fVar.b;
        t6.p(fVar.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
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

    public static String p(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // r2.l
    public final void a(int i10, int i11, int i12, long j10) {
        this.c.a(i10, i11, i12, j10);
    }

    @Override // r2.l
    public final void b(int i10, h2.d dVar, long j10, int i11) {
        this.c.b(i10, dVar, j10, i11);
    }

    @Override // r2.l
    public final void c(int i10) {
        this.a.releaseOutputBuffer(i10, false);
    }

    @Override // r2.l
    public final void d(a3.m mVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new a(this, mVar, 0), handler);
    }

    @Override // r2.l
    public final void e() {
        this.a.detachOutputSurface();
    }

    @Override // r2.l
    public final void f(v1 v1Var) {
        f fVar = this.b;
        v1 v1Var2 = new v1(24, this, v1Var);
        synchronized (fVar.a) {
            fVar.b();
            v1Var2.run();
        }
    }

    @Override // r2.l
    public final void flush() {
        this.c.flush();
        this.a.flush();
        f fVar = this.b;
        synchronized (fVar.a) {
            fVar.l++;
            Handler handler = fVar.c;
            String str = l0.a;
            handler.post(new x1(fVar, 3));
        }
        this.a.start();
    }

    @Override // r2.l
    public final void g(int i10, long j10) {
        this.a.releaseOutputBuffer(i10, j10);
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x003e, B:23:0x0034, B:24:0x0040, B:25:0x0045), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x003e, B:23:0x0034, B:24:0x0040, B:25:0x0045), top: B:3:0x000a }] */
    @Override // r2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h() {
        boolean z10;
        this.c.x();
        f fVar = this.b;
        synchronized (fVar.a) {
            try {
                fVar.b();
                if (fVar.l <= 0 && !fVar.m) {
                    z10 = false;
                    int i10 = -1;
                    if (!z10) {
                        return -1;
                    }
                    e2.f fVar2 = fVar.d;
                    int i11 = fVar2.a;
                    int i12 = fVar2.b;
                    if (!(i11 == i12)) {
                        if (i11 == i12) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i10 = fVar2.d[i11];
                        fVar2.a = (i11 + 1) & fVar2.c;
                    }
                    return i10;
                }
                z10 = true;
                int i102 = -1;
                if (!z10) {
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0042, B:25:0x0069, B:29:0x005f, B:30:0x006b, B:31:0x0070), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0042, B:25:0x0069, B:29:0x005f, B:30:0x006b, B:31:0x0070), top: B:3:0x000a }] */
    @Override // r2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        boolean z10;
        this.c.x();
        f fVar = this.b;
        synchronized (fVar.a) {
            try {
                fVar.b();
                if (fVar.l <= 0 && !fVar.m) {
                    z10 = false;
                    if (!z10) {
                        return -1;
                    }
                    e2.f fVar2 = fVar.e;
                    int i10 = fVar2.a;
                    int i11 = fVar2.b;
                    if (i10 == i11) {
                        return -1;
                    }
                    if (i10 == i11) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i12 = fVar2.d[i10];
                    fVar2.a = fVar2.c & (i10 + 1);
                    if (i12 >= 0) {
                        fVar.h.getClass();
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) fVar.f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i12 == -2) {
                        fVar.h = (MediaFormat) fVar.g.remove();
                    }
                    return i12;
                }
                z10 = true;
                if (!z10) {
                }
            } finally {
            }
        }
    }

    @Override // r2.l
    public final boolean j(n2.u uVar) {
        f fVar = this.b;
        synchronized (fVar.a) {
            fVar.o = uVar;
        }
        return true;
    }

    @Override // r2.l
    public final void k(int i10) {
        this.a.setVideoScalingMode(i10);
    }

    @Override // r2.l
    public final void l(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // r2.l
    public final void m(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // r2.l
    public final void n(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override // r2.l
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
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30 && i10 < 33) {
                    this.a.stop();
                }
                if (i10 >= 35 && (jVar2 = this.d) != null) {
                    jVar2.c(this.a);
                }
                this.a.release();
                this.e = true;
            } finally {
            }
        } catch (Throwable th2) {
            if (!this.e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.a.stop();
                    }
                    if (i11 >= 35 && (jVar = this.d) != null) {
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

    @Override // r2.l
    public final void setParameters(Bundle bundle) {
        this.c.setParameters(bundle);
    }
}
