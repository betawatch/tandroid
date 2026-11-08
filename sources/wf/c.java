package wf;

import j2.h;
import j2.m;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c extends InputStream {
    public final h a;
    public final byte[] b = new byte[1];
    public long c;

    public c(h hVar, m mVar) {
        this.a = hVar;
        try {
            this.c = hVar.open(mVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) this.c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        h hVar = this.a;
        byte[] bArr = this.b;
        int read = hVar.read(bArr, 0, 1);
        this.c--;
        if (read == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int read = this.a.read(bArr, i7, i10);
        this.c -= read;
        return read;
    }
}
