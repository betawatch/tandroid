package org.telegram.utils.recorder.audio;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.ui.eo;
import org.telegram.ui.yb0;
import ri.i;
import ri.j;
import ri.p;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class b {
    public final File a;
    public final File b;
    public final i c;
    public final ri.b d;
    public final cc.e e;
    public final HandlerThread f;
    public final Handler g;
    public volatile boolean j;
    public AudioRecord k;
    public AudioRecorderNative l;
    public AudioNoiseSuppressor m;
    public boolean n;
    public Exception o;
    public long p;
    public long q;
    public long r;
    public long t;
    public long u;
    public long v;
    public final ByteBuffer h = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
    public final ByteBuffer i = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
    public double s = -1.0d;

    public b(File file, File file2, i iVar, ri.b bVar, cc.e eVar) {
        this.a = file;
        this.b = file2;
        this.c = iVar;
        this.d = bVar;
        this.e = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.f = handlerThread;
        handlerThread.start();
        this.g = new Handler(handlerThread.getLooper());
    }

    public static void a(b bVar) {
        long j10;
        if (bVar.n) {
            return;
        }
        if (bVar.j) {
            bVar.e();
            return;
        }
        try {
            bVar.h.clear();
            AudioRecord audioRecord = bVar.k;
            ByteBuffer byteBuffer = bVar.h;
            int read = audioRecord.read(byteBuffer, byteBuffer.capacity());
            if (read <= 0) {
                throw new IllegalStateException("AudioRecord read failed: " + read);
            }
            bVar.h.limit(read);
            int i10 = read / 2;
            long j11 = 0;
            for (int i11 = 0; i11 + 1 < read; i11 += 2) {
                long j12 = bVar.h.getShort(i11);
                j11 += j12 * j12;
            }
            bVar.p += i10;
            bVar.s = -1.0d;
            bVar.c();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - bVar.q >= 100) {
                j10 = bVar.l.d();
                bVar.q = elapsedRealtime;
            } else {
                j10 = -1;
            }
            if (elapsedRealtime - bVar.r >= 32) {
                double sqrt = i10 == 0 ? 0.0d : Math.sqrt(j11 / i10);
                double d = bVar.s;
                final double d10 = d >= 0.0d ? d : sqrt;
                final cc.e eVar = bVar.e;
                final long j13 = bVar.p;
                p pVar = (p) eVar.c;
                if (j10 >= 0) {
                    pVar.a((j) eVar.b, j10);
                }
                Handler handler = pVar.h;
                final long j14 = eVar.a;
                handler.post(new Runnable() { // from class: ri.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        p pVar2 = (p) cc.e.this.c;
                        if (j14 == pVar2.o && pVar2.m == n.c) {
                            pVar2.q = j13;
                            long j15 = pVar2.j();
                            double d11 = d10;
                            if (d11 >= 0.0d) {
                                pVar2.e.onRecordingProgress(j15, d11);
                            }
                        }
                    }
                });
                bVar.r = elapsedRealtime;
            } else if (j10 >= 0) {
                final cc.e eVar2 = bVar.e;
                final long j15 = bVar.p;
                p pVar2 = (p) eVar2.c;
                if (j10 >= 0) {
                    pVar2.a((j) eVar2.b, j10);
                }
                Handler handler2 = pVar2.h;
                final long j16 = eVar2.a;
                final double d11 = -1.0d;
                handler2.post(new Runnable() { // from class: ri.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        p pVar22 = (p) cc.e.this.c;
                        if (j16 == pVar22.o && pVar22.m == n.c) {
                            pVar22.q = j15;
                            long j152 = pVar22.j();
                            double d112 = d11;
                            if (d112 >= 0.0d) {
                                pVar22.e.onRecordingProgress(j152, d112);
                            }
                        }
                    }
                });
            }
            bVar.g.post(new ri.a(bVar, 1));
        } catch (Throwable th2) {
            if (bVar.j) {
                bVar.e();
                return;
            }
            bVar.d.a("capture failed", th2);
            bVar.j = true;
            bVar.o = b(th2);
            try {
                bVar.e();
            } catch (Throwable th3) {
                bVar.o.addSuppressed(th3);
            }
        }
    }

    public static Exception b(Throwable th2) {
        return th2 instanceof Exception ? (Exception) th2 : new RuntimeException(th2);
    }

    public final void c() {
        ByteBuffer byteBuffer = this.h;
        byteBuffer.position(0);
        while (byteBuffer.hasRemaining()) {
            int remaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = this.i;
            int min = Math.min(remaining, byteBuffer2.remaining());
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer2.put(byteBuffer);
            byteBuffer.limit(limit);
            if (!byteBuffer2.hasRemaining()) {
                d(1920);
                byteBuffer2.clear();
            }
        }
    }

    public final void d(int i10) {
        ByteBuffer byteBuffer = this.i;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.m != null) {
            long nanoTime = System.nanoTime();
            int i11 = i10 / 2;
            boolean b10 = this.m.b(i11, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.t++;
            this.u += nanoTime2;
            this.v = Math.max(this.v, nanoTime2);
            ri.b bVar = this.d;
            if (b10) {
                long j10 = 0;
                for (int i12 = 0; i12 + 1 < i10; i12 += 2) {
                    long j11 = byteBuffer.getShort(i12);
                    j10 += j11 * j11;
                }
                this.s = i11 == 0 ? 0.0d : Math.sqrt(j10 / i11);
                if (this.t % 100 == 0) {
                    bVar.b("RNNoise processing: averageMs=" + ((this.u / this.t) / 1000000.0d) + ", maxMs=" + (this.v / 1000000.0d));
                }
            } else {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.m.c();
                this.m = null;
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.l;
        if (audioRecorderNative == null || audioRecorderNative.g(byteBuffer, i10) == 0) {
            throw new IllegalStateException("Native Opus encoding failed");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        AudioRecorderNative audioRecorderNative;
        ByteBuffer byteBuffer = this.i;
        if (this.n) {
            return;
        }
        this.n = true;
        Exception exc = this.o;
        try {
            AudioRecord audioRecord = this.k;
            if (audioRecord != null) {
                try {
                    if (audioRecord.getRecordingState() == 3) {
                        this.k.stop();
                    }
                    this.k.release();
                    this.k = null;
                } catch (Throwable th2) {
                    this.k.release();
                    this.k = null;
                    throw th2;
                }
            }
            if (this.l != null && byteBuffer.position() > 0) {
                d(byteBuffer.position());
                byteBuffer.clear();
            }
            AudioNoiseSuppressor audioNoiseSuppressor = this.m;
            if (audioNoiseSuppressor != null) {
                audioNoiseSuppressor.c();
                this.m = null;
            }
            audioRecorderNative = this.l;
        } catch (Throwable th3) {
            try {
                exc = b(th3);
                AudioNoiseSuppressor audioNoiseSuppressor2 = this.m;
                if (audioNoiseSuppressor2 != null) {
                    audioNoiseSuppressor2.c();
                    this.m = null;
                }
                AudioRecorderNative audioRecorderNative2 = this.l;
                if (audioRecorderNative2 != null) {
                    try {
                        audioRecorderNative2.c();
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        if (audioRecorderNative != null) {
            try {
                if (!audioRecorderNative.c() && exc == null) {
                    exc = new IllegalStateException("Unable to finalize native Opus recorder");
                }
            } catch (Throwable th4) {
                if (exc == null) {
                    exc = b(th4);
                }
            }
            this.l.f();
            this.l = null;
        }
        Exception exc2 = exc;
        File file = this.a;
        long length = file.isFile() ? file.length() : 0L;
        long j10 = this.t;
        ri.b bVar = this.d;
        if (j10 > 0) {
            bVar.b("RNNoise summary: frames=" + this.t + ", averageMs=" + ((this.u / this.t) / 1000000.0d) + ", maxMs=" + (this.v / 1000000.0d));
        }
        bVar.b("capture stopped: samples=" + this.p + ", durationMs=" + ((this.p * 1000) / 48000) + ", bytes=" + length);
        cc.e eVar = this.e;
        if (exc2 == null) {
            long j11 = this.p;
            p pVar = (p) eVar.c;
            pVar.a((j) eVar.b, length);
            pVar.h.post(new eo(eVar, eVar.a, j11, 3));
        } else {
            ((p) eVar.c).h.post(new yb0(eVar, eVar.a, exc2, 4));
        }
        this.f.quitSafely();
    }

    public final void f() {
        this.j = true;
        this.g.postAtFrontOfQueue(new ri.a(this, 0));
    }
}
