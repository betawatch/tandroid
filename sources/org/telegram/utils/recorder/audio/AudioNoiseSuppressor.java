package org.telegram.utils.recorder.audio;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
final class AudioNoiseSuppressor {
    public long a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public AudioNoiseSuppressor(long j3) {
        this.a = j3;
    }

    public static AudioNoiseSuppressor a() {
        long nCreate = nCreate();
        if (nCreate == 0) {
            return null;
        }
        return new AudioNoiseSuppressor(nCreate);
    }

    private static native long nCreate();

    private static native void nDestroy(long j3);

    private static native boolean nProcess(long j3, ByteBuffer byteBuffer, int i7);

    public final boolean b(int i7, ByteBuffer byteBuffer) {
        if (this.b.get()) {
            throw new IllegalStateException("Native noise suppressor is already released");
        }
        return nProcess(this.a, byteBuffer, i7);
    }

    public final void c() {
        if (this.b.compareAndSet(false, true)) {
            long j3 = this.a;
            this.a = 0L;
            if (j3 != 0) {
                nDestroy(j3);
            }
        }
    }

    public final void finalize() {
        try {
            c();
        } finally {
            super.finalize();
        }
    }
}
