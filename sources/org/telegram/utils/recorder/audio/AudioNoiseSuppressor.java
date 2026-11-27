package org.telegram.utils.recorder.audio;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
final class AudioNoiseSuppressor {
    public long a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public AudioNoiseSuppressor(long j) {
        this.a = j;
    }

    public static AudioNoiseSuppressor a() {
        long nCreate = nCreate();
        if (nCreate == 0) {
            return null;
        }
        return new AudioNoiseSuppressor(nCreate);
    }

    private static native long nCreate();

    private static native void nDestroy(long j);

    private static native boolean nProcess(long j, ByteBuffer byteBuffer, int i);

    public final boolean b(int i, ByteBuffer byteBuffer) {
        if (!this.b.get()) {
            return nProcess(this.a, byteBuffer, i);
        }
        grb.i("Native noise suppressor is already released");
        return false;
    }

    public final void c() {
        if (this.b.compareAndSet(false, true)) {
            long j = this.a;
            this.a = 0L;
            if (j != 0) {
                nDestroy(j);
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
