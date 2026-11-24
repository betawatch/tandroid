// default package

import android.media.MediaDataSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rz0 extends MediaDataSource {
    public final byte[] a;

    public rz0(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.a.length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.a;
        if (j >= bArr2.length) {
            return -1;
        }
        int min = (int) Math.min(i2, bArr2.length - j);
        System.arraycopy(bArr2, (int) j, bArr, i, min);
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
