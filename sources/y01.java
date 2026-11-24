// default package

import android.media.MediaDataSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y01 extends MediaDataSource {
    public final byte[] a;

    public y01(byte[] bArr) {
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
