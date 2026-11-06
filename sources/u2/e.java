package u2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import h2.m0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class e implements m {
    public static final ArrayDeque h = new ArrayDeque();
    public static final Object n = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public android.support.v4.media.session.q c;
    public final AtomicReference d;
    public final h2.i e;
    public boolean f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        h2.i iVar = new h2.i();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = iVar;
        this.d = new AtomicReference();
    }

    public static d c() {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(d dVar) {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    @Override // u2.m
    public final void a(int i7, int i10, int i11, long j3) {
        i();
        d c10 = c();
        c10.a = i7;
        c10.b = i10;
        c10.d = j3;
        c10.e = i11;
        android.support.v4.media.session.q qVar = this.c;
        String str = m0.a;
        qVar.obtainMessage(1, c10).sendToTarget();
    }

    @Override // u2.m
    public final void b(int i7, k2.d dVar, long j3, int i10) {
        i();
        d c10 = c();
        c10.a = i7;
        c10.b = 0;
        c10.d = j3;
        c10.e = i10;
        MediaCodec.CryptoInfo cryptoInfo = c10.c;
        cryptoInfo.numSubSamples = dVar.f;
        int[] iArr = dVar.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = dVar.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = dVar.b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = dVar.a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = dVar.c;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.g, dVar.h));
        }
        android.support.v4.media.session.q qVar = this.c;
        String str = m0.a;
        qVar.obtainMessage(2, c10).sendToTarget();
    }

    @Override // u2.m
    public final void flush() {
        if (this.f) {
            try {
                android.support.v4.media.session.q qVar = this.c;
                qVar.getClass();
                qVar.removeCallbacksAndMessages(null);
                h2.i iVar = this.e;
                synchronized (iVar) {
                    iVar.b = false;
                }
                android.support.v4.media.session.q qVar2 = this.c;
                qVar2.getClass();
                qVar2.obtainMessage(3).sendToTarget();
                iVar.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // u2.m
    public final void i() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // u2.m
    public final void setParameters(Bundle bundle) {
        i();
        android.support.v4.media.session.q qVar = this.c;
        String str = m0.a;
        qVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // u2.m
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // u2.m
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new android.support.v4.media.session.q(this, handlerThread.getLooper(), 13);
        this.f = true;
    }
}
