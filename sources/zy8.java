// default package

import java.io.InputStream;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zy8 extends a51 {
    public final long d;

    public zy8(InputStream inputStream, long j, long j2) {
        super(inputStream, j);
        this.d = j + j2;
    }

    public final long e() {
        return this.d - this.b;
    }

    @Override // a51, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.b;
        long j2 = i2 + j;
        long j3 = this.d;
        if (j2 <= j3 || (i2 = (int) (j3 - j)) != 0) {
            return super.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // a51, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j2 = this.b;
        long j3 = j2 + j;
        long j4 = this.d;
        if (j3 > j4) {
            j = (int) (j4 - j2);
        }
        return super.skip(j);
    }

    @Override // a51, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.b == this.d) {
            return -1;
        }
        return super.read();
    }
}
