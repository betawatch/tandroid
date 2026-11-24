package org.telegram.utils.recorder.audio;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class d {
    public long A;
    public long B;
    public final File a;
    public final File b;
    public final long c;
    public final long d;
    public final e30 e;
    public final q20 f;
    public final m20 g;
    public final HandlerThread h;
    public final Handler i;
    public final HandlerThread j;
    public final Handler k;
    public volatile boolean n;
    public volatile boolean o;
    public AudioRecord p;
    public long q;
    public long r;
    public AudioRecorderNative t;
    public AudioNoiseSuppressor u;
    public Exception v;
    public boolean w;
    public long x;
    public int y;
    public long z;
    public final ConcurrentLinkedQueue l = new ConcurrentLinkedQueue();
    public final AtomicInteger m = new AtomicInteger();
    public final ByteBuffer s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j, long j2, e30 e30Var, q20 q20Var, m20 m20Var) {
        this.a = file;
        this.b = file2;
        this.c = j;
        this.d = j2;
        this.e = e30Var;
        this.f = q20Var;
        this.g = m20Var;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.j = handlerThread2;
        handlerThread2.start();
        this.k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th) {
        return th instanceof Exception ? (Exception) th : new RuntimeException(th);
    }

    public final void b(int i) {
        ByteBuffer byteBuffer = this.s;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        if (this.u != null) {
            long nanoTime = System.nanoTime();
            boolean b = this.u.b(i / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            q20 q20Var = this.f;
            if (!b) {
                q20Var.b("RNNoise processing failed; recording unprocessed PCM");
                this.u.c();
                this.u = null;
            } else if (this.z % 100 == 0) {
                q20Var.b("RNNoise processing: averageMs=" + ((this.A / this.z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i);
        }
        AudioRecorderNative audioRecorderNative = this.t;
        if (audioRecorderNative == null || audioRecorderNative.g(byteBuffer, i) == 0) {
            sc8.j("Native Opus encoding failed");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        if (this.o) {
            return;
        }
        if (this.n) {
            f(null);
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.l.poll();
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
        }
        byteBuffer.clear();
        byte b = 0;
        try {
            int read = this.p.read(byteBuffer, byteBuffer.capacity());
            if (read <= 0) {
                throw new IllegalStateException("AudioRecord read failed: " + read);
            }
            byteBuffer.limit(read);
            gjc gjcVar = xxe.a;
            if (gjcVar != null && read > 0) {
                try {
                    gjcVar.n(byteBuffer, read, 48000, 2);
                } catch (Throwable th) {
                    fa4.g(th, true);
                }
            }
            int i = read / 2;
            long j = 0;
            for (int i2 = 0; i2 + 1 < read; i2 += 2) {
                long j2 = byteBuffer.getShort(i2);
                j += j2 * j2;
            }
            this.q += i;
            this.m.incrementAndGet();
            this.k.post(new c(this, byteBuffer, b));
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - this.r >= 32) {
                    final double sqrt = i == 0 ? 0.0d : Math.sqrt(j / i);
                    final m20 m20Var = this.g;
                    final long j3 = this.q;
                    Handler handler = ((h30) m20Var.c).i;
                    final long j4 = m20Var.a;
                    handler.post(new Runnable() { // from class: a30
                        @Override // java.lang.Runnable
                        public final void run() {
                            h30 h30Var = (h30) m20.this.c;
                            if (j4 == h30Var.o && h30Var.G == 3) {
                                h30Var.q = j3;
                                long j5 = h30Var.j();
                                double d = sqrt;
                                if (d >= 0.0d) {
                                    MediaController mediaController = ((ml6) h30Var.f.b).a;
                                    mediaController.l1 = j5;
                                    kk7.f(mediaController.i1).k(kk7.j2, Integer.valueOf(mediaController.h1), Double.valueOf(d / 2.0d));
                                }
                            }
                        }
                    });
                    this.r = elapsedRealtime;
                }
                this.i.post(new vz(this, (byte) 3));
            } catch (Throwable th2) {
                th = th2;
                b = 1;
                if (b == 0) {
                    d(byteBuffer);
                }
                f(this.n ? null : a(th));
            }
        } catch (Throwable th3) {
            th = th3;
            if (b == 0) {
            }
            f(this.n ? null : a(th));
        }
    }

    public final void d(ByteBuffer byteBuffer) {
        if (this.w) {
            return;
        }
        this.l.offer(byteBuffer);
    }

    public final void e() {
        byte b = 1;
        this.n = true;
        if (this.o) {
            return;
        }
        this.i.postAtFrontOfQueue(new vz(this, b));
    }

    public final void f(Exception exc) {
        if (this.o) {
            return;
        }
        this.o = true;
        this.n = true;
        if (exc != null) {
            this.f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.k.post(new b(this, this.q, exc));
        this.h.quitSafely();
    }
}
