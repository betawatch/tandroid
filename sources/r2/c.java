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
import e2.d0;
import java.nio.ByteBuffer;
import k2.g0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    public static void l(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        j jVar;
        f fVar = cVar.b;
        MediaCodec mediaCodec = cVar.a;
        fVar.b(mediaCodec);
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

    public static String m(int i10, String str) {
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
    public final void a(long j3, int i10, int i11, int i12) {
        this.c.a(j3, i10, i11, i12);
    }

    @Override // r2.l
    public final void b(int i10, h2.d dVar, long j3, int i11) {
        this.c.b(i10, dVar, j3, i11);
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
    public final void f(int i10, long j3) {
        this.a.releaseOutputBuffer(i10, j3);
    }

    @Override // r2.l
    public final void flush() {
        this.c.flush();
        this.a.flush();
        f fVar = this.b;
        synchronized (fVar.a) {
            fVar.l++;
            Handler handler = fVar.c;
            String str = d0.a;
            handler.post(new org.telegram.ui.web.b(fVar, 17));
        }
        this.a.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[Catch: all -> 0x002e, DONT_GENERATE, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0021, B:18:0x002c, B:21:0x0030, B:26:0x004a, B:29:0x003e, B:30:0x004c, B:31:0x0051, B:33:0x0052, B:34:0x0054, B:35:0x0055, B:36:0x0057, B:37:0x0058, B:38:0x005a), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0021, B:18:0x002c, B:21:0x0030, B:26:0x004a, B:29:0x003e, B:30:0x004c, B:31:0x0051, B:33:0x0052, B:34:0x0054, B:35:0x0055, B:36:0x0057, B:37:0x0058, B:38:0x005a), top: B:3:0x000a }] */
    @Override // r2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g() {
        boolean z10;
        this.c.c();
        f fVar = this.b;
        synchronized (fVar.a) {
            try {
                IllegalStateException illegalStateException = fVar.n;
                if (illegalStateException != null) {
                    fVar.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.j;
                if (codecException != null) {
                    fVar.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = fVar.k;
                if (cryptoException != null) {
                    fVar.k = null;
                    throw cryptoException;
                }
                if (fVar.l <= 0 && !fVar.m) {
                    z10 = false;
                    int i10 = -1;
                    if (!z10) {
                        return -1;
                    }
                    a0.h hVar = fVar.d;
                    int i11 = hVar.a;
                    int i12 = hVar.b;
                    if (!(i11 == i12)) {
                        if (i11 == i12) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i10 = ((int[]) hVar.c)[i11];
                        hVar.a = (i11 + 1) & hVar.d;
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[Catch: all -> 0x002e, DONT_GENERATE, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0021, B:18:0x002c, B:21:0x0031, B:25:0x003c, B:28:0x0040, B:30:0x004e, B:31:0x0075, B:35:0x006b, B:36:0x0077, B:37:0x007c, B:39:0x007d, B:40:0x007f, B:41:0x0080, B:42:0x0082, B:43:0x0083, B:44:0x0085), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0021, B:18:0x002c, B:21:0x0031, B:25:0x003c, B:28:0x0040, B:30:0x004e, B:31:0x0075, B:35:0x006b, B:36:0x0077, B:37:0x007c, B:39:0x007d, B:40:0x007f, B:41:0x0080, B:42:0x0082, B:43:0x0083, B:44:0x0085), top: B:3:0x000a }] */
    @Override // r2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        boolean z10;
        this.c.c();
        f fVar = this.b;
        synchronized (fVar.a) {
            try {
                IllegalStateException illegalStateException = fVar.n;
                if (illegalStateException != null) {
                    fVar.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.j;
                if (codecException != null) {
                    fVar.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = fVar.k;
                if (cryptoException != null) {
                    fVar.k = null;
                    throw cryptoException;
                }
                if (fVar.l <= 0 && !fVar.m) {
                    z10 = false;
                    if (!z10) {
                        return -1;
                    }
                    a0.h hVar = fVar.e;
                    int i10 = hVar.a;
                    int i11 = hVar.b;
                    if (i10 == i11) {
                        return -1;
                    }
                    if (i10 == i11) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i12 = ((int[]) hVar.c)[i10];
                    hVar.a = (i10 + 1) & hVar.d;
                    if (i12 >= 0) {
                        e2.d.h(fVar.h);
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
    public final void i(int i10) {
        this.a.setVideoScalingMode(i10);
    }

    @Override // r2.l
    public final boolean j(g0 g0Var) {
        f fVar = this.b;
        synchronized (fVar.a) {
            fVar.o = g0Var;
        }
        return true;
    }

    @Override // r2.l
    public final void k(Surface surface) {
        this.a.setOutputSurface(surface);
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
