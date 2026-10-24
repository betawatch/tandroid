package org.telegram.utils.recorder.audio;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
final class AudioNoiseSuppressor {
    public long a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public AudioNoiseSuppressor(long j10) {
        this.a = j10;
    }

    public static AudioNoiseSuppressor a() {
        long nCreate = nCreate();
        if (nCreate == 0) {
            return null;
        }
        return new AudioNoiseSuppressor(nCreate);
    }

    private static native long nCreate();

    private static native void nDestroy(long j10);

    private static native boolean nProcess(long j10, ByteBuffer byteBuffer, int i10);

    public final boolean b(int i10, ByteBuffer byteBuffer) {
        if (this.b.get()) {
            throw new IllegalStateException("Native noise suppressor is already released");
        }
        return nProcess(this.a, byteBuffer, i10);
    }

    public final void c() {
        if (this.b.compareAndSet(false, true)) {
            long j10 = this.a;
            this.a = 0L;
            if (j10 != 0) {
                nDestroy(j10);
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
