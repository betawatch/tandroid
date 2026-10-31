package r2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import e2.l0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e implements m {
    public static final ArrayDeque h = new ArrayDeque();
    public static final Object n = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public android.support.v4.media.session.q c;
    public final AtomicReference d;
    public final e2.i e;
    public boolean f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        e2.i iVar = new e2.i();
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

    @Override // r2.m
    public final void a(int i10, int i11, int i12, long j10) {
        x();
        d c10 = c();
        c10.a = i10;
        c10.b = i11;
        c10.d = j10;
        c10.e = i12;
        android.support.v4.media.session.q qVar = this.c;
        String str = l0.a;
        qVar.obtainMessage(1, c10).sendToTarget();
    }

    @Override // r2.m
    public final void b(int i10, h2.d dVar, long j10, int i11) {
        x();
        d c10 = c();
        c10.a = i10;
        c10.b = 0;
        c10.d = j10;
        c10.e = i11;
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
        String str = l0.a;
        qVar.obtainMessage(2, c10).sendToTarget();
    }

    @Override // r2.m
    public final void flush() {
        if (this.f) {
            try {
                android.support.v4.media.session.q qVar = this.c;
                qVar.getClass();
                qVar.removeCallbacksAndMessages(null);
                e2.i iVar = this.e;
                synchronized (iVar) {
                    iVar.b = false;
                }
                android.support.v4.media.session.q qVar2 = this.c;
                qVar2.getClass();
                qVar2.obtainMessage(3).sendToTarget();
                iVar.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // r2.m
    public final void setParameters(Bundle bundle) {
        x();
        android.support.v4.media.session.q qVar = this.c;
        String str = l0.a;
        qVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // r2.m
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // r2.m
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new android.support.v4.media.session.q(this, handlerThread.getLooper(), 14);
        this.f = true;
    }

    @Override // r2.m
    public final void x() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
