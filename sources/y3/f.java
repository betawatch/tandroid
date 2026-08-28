package y3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import c2.b1;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public long k;
    public boolean l;
    public IllegalStateException m;
    public final Object a = new Object();
    public final b1 d = new b1();
    public final b1 e = new b1();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        b1 b1Var = this.d;
        b1Var.a = 0;
        b1Var.b = -1;
        b1Var.c = 0;
        b1 b1Var2 = this.e;
        b1Var2.a = 0;
        b1Var2.b = -1;
        b1Var2.c = 0;
        this.f.clear();
        arrayDeque.clear();
        this.j = null;
    }

    public final void b(MediaCodec mediaCodec) {
        d5.a.i(this.c == null);
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.a) {
            this.m = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i9) {
        synchronized (this.a) {
            this.d.d(i9);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i9, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.e.d(-2);
                    this.g.add(mediaFormat);
                    this.i = null;
                }
                this.e.d(i9);
                this.f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.e.d(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
