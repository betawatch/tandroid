package t2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import g2.n0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e implements m {
    public static final ArrayDeque h = new ArrayDeque();
    public static final Object n = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public android.support.v4.media.session.q c;
    public final AtomicReference d;
    public final g2.j e;
    public boolean f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        g2.j jVar = new g2.j();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = jVar;
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

    public static void e(d dVar) {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    @Override // t2.m
    public final void a(int i3, j2.d dVar, long j10, int i10) {
        d();
        d c2 = c();
        c2.a = i3;
        c2.b = 0;
        c2.d = j10;
        c2.e = i10;
        MediaCodec.CryptoInfo cryptoInfo = c2.c;
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
        String str = n0.a;
        qVar.obtainMessage(2, c2).sendToTarget();
    }

    @Override // t2.m
    public final void b(int i3, int i10, int i11, long j10) {
        d();
        d c2 = c();
        c2.a = i3;
        c2.b = i10;
        c2.d = j10;
        c2.e = i11;
        android.support.v4.media.session.q qVar = this.c;
        String str = n0.a;
        qVar.obtainMessage(1, c2).sendToTarget();
    }

    @Override // t2.m
    public final void d() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // t2.m
    public final void flush() {
        if (this.f) {
            try {
                android.support.v4.media.session.q qVar = this.c;
                qVar.getClass();
                qVar.removeCallbacksAndMessages(null);
                g2.j jVar = this.e;
                synchronized (jVar) {
                    jVar.b = false;
                }
                android.support.v4.media.session.q qVar2 = this.c;
                qVar2.getClass();
                qVar2.obtainMessage(3).sendToTarget();
                jVar.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // t2.m
    public final void setParameters(Bundle bundle) {
        d();
        android.support.v4.media.session.q qVar = this.c;
        String str = n0.a;
        qVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // t2.m
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // t2.m
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
