package y3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import c2.a1;
import d5.g0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements k {
    public final MediaCodec a;
    public final f b;
    public final e c;
    public boolean d;
    public int e = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.a = mediaCodec;
        this.b = new f(handlerThread);
        this.c = new e(mediaCodec, handlerThread2);
    }

    public static void i(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        f fVar = cVar.b;
        MediaCodec mediaCodec = cVar.a;
        fVar.b(mediaCodec);
        d5.a.c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        d5.a.q();
        e eVar = cVar.c;
        HandlerThread handlerThread = eVar.b;
        if (!eVar.f) {
            handlerThread.start();
            eVar.c = new androidx.mediarouter.app.c(eVar, handlerThread.getLooper());
            eVar.f = true;
        }
        d5.a.c("startCodec");
        mediaCodec.start();
        d5.a.q();
        cVar.e = 1;
    }

    public static String j(int i10, String str) {
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

    @Override // y3.k
    public final void a(long j10, int i10, int i11, int i12) {
        e eVar = this.c;
        RuntimeException runtimeException = (RuntimeException) eVar.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        d b10 = e.b();
        b10.a = i10;
        b10.b = i11;
        b10.d = j10;
        b10.e = i12;
        androidx.mediarouter.app.c cVar = eVar.c;
        int i13 = g0.a;
        cVar.obtainMessage(0, b10).sendToTarget();
    }

    @Override // y3.k
    public final void b(int i10, long j10) {
        this.a.releaseOutputBuffer(i10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[Catch: all -> 0x001c, DONT_GENERATE, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0005, B:6:0x000f, B:12:0x001a, B:15:0x001e, B:17:0x0023, B:19:0x0027, B:24:0x0036, B:26:0x0032, B:28:0x0038, B:29:0x003a, B:30:0x003b, B:31:0x003d), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0005, B:6:0x000f, B:12:0x001a, B:15:0x001e, B:17:0x0023, B:19:0x0027, B:24:0x0036, B:26:0x0032, B:28:0x0038, B:29:0x003a, B:30:0x003b, B:31:0x003d), top: B:3:0x0005 }] */
    @Override // y3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c() {
        boolean z10;
        f fVar = this.b;
        synchronized (fVar.a) {
            try {
                boolean z11 = true;
                if (fVar.k <= 0 && !fVar.l) {
                    z10 = false;
                    int i10 = -1;
                    if (!z10) {
                        return -1;
                    }
                    IllegalStateException illegalStateException = fVar.m;
                    if (illegalStateException != null) {
                        fVar.m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = fVar.j;
                    if (codecException != null) {
                        fVar.j = null;
                        throw codecException;
                    }
                    a1 a1Var = fVar.d;
                    if (a1Var.c != 0) {
                        z11 = false;
                    }
                    if (!z11) {
                        i10 = a1Var.e();
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[Catch: all -> 0x001c, DONT_GENERATE, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0005, B:6:0x000f, B:12:0x001a, B:15:0x001f, B:17:0x0024, B:19:0x0028, B:23:0x0032, B:25:0x0034, B:27:0x003a, B:28:0x0061, B:32:0x0057, B:34:0x0063, B:35:0x0065, B:36:0x0066, B:37:0x0068), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001f A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0005, B:6:0x000f, B:12:0x001a, B:15:0x001f, B:17:0x0024, B:19:0x0028, B:23:0x0032, B:25:0x0034, B:27:0x003a, B:28:0x0061, B:32:0x0057, B:34:0x0063, B:35:0x0065, B:36:0x0066, B:37:0x0068), top: B:3:0x0005 }] */
    @Override // y3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(MediaCodec.BufferInfo bufferInfo) {
        boolean z10;
        f fVar = this.b;
        synchronized (fVar.a) {
            try {
                boolean z11 = true;
                if (fVar.k <= 0 && !fVar.l) {
                    z10 = false;
                    if (!z10) {
                        return -1;
                    }
                    IllegalStateException illegalStateException = fVar.m;
                    if (illegalStateException != null) {
                        fVar.m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = fVar.j;
                    if (codecException != null) {
                        fVar.j = null;
                        throw codecException;
                    }
                    a1 a1Var = fVar.e;
                    if (a1Var.c != 0) {
                        z11 = false;
                    }
                    if (z11) {
                        return -1;
                    }
                    int e9 = a1Var.e();
                    if (e9 >= 0) {
                        d5.a.j(fVar.h);
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) fVar.f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (e9 == -2) {
                        fVar.h = (MediaFormat) fVar.g.remove();
                    }
                    return e9;
                }
                z10 = true;
                if (!z10) {
                }
            } finally {
            }
        }
    }

    @Override // y3.k
    public final void e(int i10, k3.d dVar, long j10) {
        this.c.c(i10, dVar, j10);
    }

    @Override // y3.k
    public final void f(int i10) {
        this.a.setVideoScalingMode(i10);
    }

    @Override // y3.k
    public final void flush() {
        this.c.a();
        this.a.flush();
        f fVar = this.b;
        synchronized (fVar.a) {
            fVar.k++;
            Handler handler = fVar.c;
            int i10 = g0.a;
            handler.post(new qf.b(fVar, 18));
        }
        this.a.start();
    }

    @Override // y3.k
    public final void g(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // y3.k
    public final ByteBuffer getInputBuffer(int i10) {
        return this.a.getInputBuffer(i10);
    }

    @Override // y3.k
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.a.getOutputBuffer(i10);
    }

    @Override // y3.k
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.b;
        synchronized (fVar.a) {
            try {
                mediaFormat = fVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // y3.k
    public final void h(e5.h hVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new a(this, hVar, 0), handler);
    }

    @Override // y3.k
    public final void release() {
        try {
            if (this.e == 1) {
                e eVar = this.c;
                if (eVar.f) {
                    eVar.a();
                    eVar.b.quit();
                }
                eVar.f = false;
                f fVar = this.b;
                synchronized (fVar.a) {
                    fVar.l = true;
                    fVar.b.quit();
                    fVar.a();
                }
            }
            this.e = 2;
            if (this.d) {
                return;
            }
            this.a.release();
            this.d = true;
        } catch (Throwable th) {
            if (!this.d) {
                this.a.release();
                this.d = true;
            }
            throw th;
        }
    }

    @Override // y3.k
    public final void releaseOutputBuffer(int i10, boolean z10) {
        this.a.releaseOutputBuffer(i10, z10);
    }

    @Override // y3.k
    public final void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }
}
