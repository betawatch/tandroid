// default package

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vy extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public MediaCodec.CryptoException k;
    public long l;
    public boolean m;
    public IllegalStateException n;
    public fk3 o;
    public final Object a = new Object();
    public final po d = new po();
    public final po e = new po();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public vy(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        po poVar = this.d;
        poVar.c = poVar.b;
        po poVar2 = this.e;
        poVar2.c = poVar2.b;
        this.f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.n;
        if (illegalStateException != null) {
            this.n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.j;
        if (codecException != null) {
            this.j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.k;
        if (cryptoException == null) {
            return;
        }
        this.k = null;
        throw cryptoException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.a) {
            this.n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        l74 l74Var;
        synchronized (this.a) {
            this.d.a(i);
            fk3 fk3Var = this.o;
            if (fk3Var != null && (l74Var = ((om6) fk3Var.a).Y) != null) {
                l74Var.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        l74 l74Var;
        synchronized (this.a) {
            MediaFormat mediaFormat = this.i;
            if (mediaFormat != null) {
                this.e.a(-2);
                this.g.add(mediaFormat);
                this.i = null;
            }
            this.e.a(i);
            this.f.add(bufferInfo);
            fk3 fk3Var = this.o;
            if (fk3Var != null && (l74Var = ((om6) fk3Var.a).Y) != null) {
                l74Var.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.e.a(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
