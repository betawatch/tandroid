package y3;

import android.media.MediaCodec;
import android.os.HandlerThread;
import d5.f0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public androidx.mediarouter.app.d c;
    public final AtomicReference d;
    public final d5.c e;
    public boolean f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        d5.c cVar = new d5.c();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = cVar;
        this.d = new AtomicReference();
    }

    public static d b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void d(d dVar) {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    public final void a() {
        if (this.f) {
            try {
                androidx.mediarouter.app.d dVar = this.c;
                dVar.getClass();
                dVar.removeCallbacksAndMessages(null);
                d5.c cVar = this.e;
                cVar.b();
                androidx.mediarouter.app.d dVar2 = this.c;
                dVar2.getClass();
                dVar2.obtainMessage(2).sendToTarget();
                synchronized (cVar) {
                    while (!cVar.a) {
                        cVar.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void c(int i9, k3.d dVar, long j10) {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        d b10 = b();
        b10.a = i9;
        b10.b = 0;
        b10.d = j10;
        b10.e = 0;
        MediaCodec.CryptoInfo cryptoInfo = b10.c;
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
        if (f0.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.g, dVar.h));
        }
        this.c.obtainMessage(1, b10).sendToTarget();
    }
}
