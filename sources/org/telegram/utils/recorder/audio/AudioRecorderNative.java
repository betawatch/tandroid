package org.telegram.utils.recorder.audio;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
final class AudioRecorderNative {
    public long a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public AudioRecorderNative(long j10) {
        this.a = j10;
    }

    public static AudioRecorderNative a(File file, File file2) {
        long nCreate = nCreate(file.getAbsolutePath(), 48000, file2 == null ? null : file2.getAbsolutePath());
        if (nCreate == 0) {
            return null;
        }
        return new AudioRecorderNative(nCreate);
    }

    public static boolean b(String str, String str2, long j10, long j11) {
        return nCropOpusFile(str, str2, j10, j11);
    }

    public static byte[] e(String str) {
        return nGetWaveform(str);
    }

    private static native long nCreate(String str, int i10, String str2);

    private static native boolean nCropOpusFile(String str, String str2, long j10, long j11);

    private static native void nDestroy(long j10);

    private static native boolean nFinish(long j10);

    private static native long nFlush(long j10);

    private static native byte[] nGetWaveform(String str);

    private static native int nWriteFrame(long j10, ByteBuffer byteBuffer, int i10);

    public final boolean c() {
        if (!this.b.compareAndSet(false, true)) {
            return false;
        }
        long j10 = this.a;
        this.a = 0L;
        return j10 != 0 && nFinish(j10);
    }

    public final long d() {
        if (this.b.get()) {
            throw new IllegalStateException("Native audio recorder is already released");
        }
        return nFlush(this.a);
    }

    public final void f() {
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
            f();
        } finally {
            super.finalize();
        }
    }

    public final int g(ByteBuffer byteBuffer, int i10) {
        if (this.b.get()) {
            throw new IllegalStateException("Native audio recorder is already released");
        }
        return nWriteFrame(this.a, byteBuffer, i10);
    }
}
