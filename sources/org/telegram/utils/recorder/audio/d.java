package org.telegram.utils.recorder.audio;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import ki.g;
import ki.i;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class d {
    public long A;
    public long B;
    public final File a;
    public final File b;
    public final long c;
    public final long d;
    public final i e;
    public final ki.b f;
    public final g g;
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

    public d(File file, File file2, long j10, long j11, i iVar, ki.b bVar, g gVar) {
        this.a = file;
        this.b = file2;
        this.c = j10;
        this.d = j11;
        this.e = iVar;
        this.f = bVar;
        this.g = gVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.j = handlerThread2;
        handlerThread2.start();
        this.k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        return th2 instanceof Exception ? (Exception) th2 : new RuntimeException(th2);
    }

    public final void b(int i10) {
        ByteBuffer byteBuffer = this.s;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.u.b(i10 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            ki.b bVar = this.f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.u.c();
                this.u = null;
            } else if (this.z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.t;
        if (audioRecorderNative == null || audioRecorderNative.g(byteBuffer, i10) == 0) {
            throw new IllegalStateException("Native Opus encoding failed");
        }
    }

    public final void c(ByteBuffer byteBuffer) {
        if (this.w) {
            return;
        }
        this.l.offer(byteBuffer);
    }

    public final void d() {
        this.n = true;
        if (this.o) {
            return;
        }
        this.i.postAtFrontOfQueue(new ki.a(this, 1));
    }

    public final void e(Exception exc) {
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
