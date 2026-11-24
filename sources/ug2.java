// default package

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ug2 extends InputStream {
    public final o63 a;
    public final byte[] b = new byte[1];
    public long c;

    public ug2(o63 o63Var, u63 u63Var) {
        this.a = o63Var;
        try {
            this.c = o63Var.open(u63Var);
        } catch (IOException e) {
            sdb.b(e);
            throw null;
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
        o63 o63Var = this.a;
        byte[] bArr = this.b;
        int read = o63Var.read(bArr, 0, 1);
        this.c--;
        if (read == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int read = this.a.read(bArr, i, i2);
        this.c -= read;
        return read;
    }
}
