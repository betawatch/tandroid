package rf;

import java.io.InputStream;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends a {
    public final long d;

    public b(InputStream inputStream, long j10, long j11) {
        super(inputStream, j10);
        this.d = j10 + j11;
    }

    public final long e() {
        return this.d - this.b;
    }

    @Override // rf.a, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.b == this.d) {
            return -1;
        }
        return super.read();
    }

    @Override // rf.a, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long j11 = this.b;
        long j12 = j11 + j10;
        long j13 = this.d;
        if (j12 > j13) {
            j10 = (int) (j13 - j11);
        }
        return super.skip(j10);
    }

    @Override // rf.a, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i3, int i10) {
        long j10 = this.b;
        long j11 = i10 + j10;
        long j12 = this.d;
        if (j11 <= j12 || (i10 = (int) (j12 - j10)) != 0) {
            return super.read(bArr, i3, i10);
        }
        return -1;
    }
}
