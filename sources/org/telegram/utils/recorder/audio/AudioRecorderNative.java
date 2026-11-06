package org.telegram.utils.recorder.audio;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
final class AudioRecorderNative {
    public long a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public AudioRecorderNative(long j3) {
        this.a = j3;
    }

    public static AudioRecorderNative a(long j3, long j10, File file, File file2) {
        long nCreate = nCreate(file.getAbsolutePath(), 48000, file2 == null ? null : file2.getAbsolutePath(), j3, j10);
        if (nCreate == 0) {
            return null;
        }
        return new AudioRecorderNative(nCreate);
    }

    public static boolean b(String str, String str2, long j3, long j10) {
        return nCropOpusFile(str, str2, j3, j10);
    }

    public static byte[] e(String str) {
        return nGetWaveform(str);
    }

    private static native long nCreate(String str, int i7, String str2, long j3, long j10);

    private static native boolean nCropOpusFile(String str, String str2, long j3, long j10);

    private static native void nDestroy(long j3);

    private static native boolean nFinish(long j3);

    private static native long nFlush(long j3);

    private static native byte[] nGetWaveform(String str);

    private static native int nWriteFrame(long j3, ByteBuffer byteBuffer, int i7);

    public final boolean c() {
        if (!this.b.compareAndSet(false, true)) {
            return false;
        }
        long j3 = this.a;
        this.a = 0L;
        return j3 != 0 && nFinish(j3);
    }

    public final long d() {
        if (this.b.get()) {
            throw new IllegalStateException("Native audio recorder is already released");
        }
        return nFlush(this.a);
    }

    public final void f() {
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
            f();
        } finally {
            super.finalize();
        }
    }

    public final int g(ByteBuffer byteBuffer, int i7) {
        if (this.b.get()) {
            throw new IllegalStateException("Native audio recorder is already released");
        }
        return nWriteFrame(this.a, byteBuffer, i7);
    }
}
