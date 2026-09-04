package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class h extends InputStream {
    public int a;
    public int b;
    public final /* synthetic */ j c;

    public h(j jVar, g gVar) {
        this.c = jVar;
        this.a = jVar.d(gVar.a + 4);
        this.b = gVar.b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.b;
        if (i12 <= 0) {
            return -1;
        }
        if (i11 > i12) {
            i11 = i12;
        }
        int i13 = this.a;
        j jVar = this.c;
        RandomAccessFile randomAccessFile = jVar.a;
        int d = jVar.d(i13);
        int i14 = d + i11;
        int i15 = jVar.b;
        if (i14 <= i15) {
            randomAccessFile.seek(d);
            randomAccessFile.readFully(bArr, i10, i11);
        } else {
            int i16 = i15 - d;
            randomAccessFile.seek(d);
            randomAccessFile.readFully(bArr, i10, i16);
            randomAccessFile.seek(16L);
            randomAccessFile.readFully(bArr, i10 + i16, i11 - i16);
        }
        this.a = jVar.d(this.a + i11);
        this.b -= i11;
        return i11;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.b == 0) {
            return -1;
        }
        j jVar = this.c;
        jVar.a.seek(this.a);
        int read = jVar.a.read();
        this.a = jVar.d(this.a + 1);
        this.b--;
        return read;
    }
}
