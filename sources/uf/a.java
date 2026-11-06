package uf;

import ab.d;
import java.io.InputStream;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a extends d {
    public final long d;

    public a(InputStream inputStream, long j3, long j10) {
        super(inputStream, j3);
        this.d = j3 + j10;
    }

    public final long e() {
        return this.d - this.b;
    }

    @Override // ab.d, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.b == this.d) {
            return -1;
        }
        return super.read();
    }

    @Override // ab.d, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j3) {
        long j10 = this.b;
        long j11 = j10 + j3;
        long j12 = this.d;
        if (j11 > j12) {
            j3 = (int) (j12 - j10);
        }
        return super.skip(j3);
    }

    @Override // ab.d, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        long j3 = this.b;
        long j10 = i10 + j3;
        long j11 = this.d;
        if (j10 <= j11 || (i10 = (int) (j11 - j3)) != 0) {
            return super.read(bArr, i7, i10);
        }
        return -1;
    }
}
