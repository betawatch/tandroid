// default package

import java.io.InputStream;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class s63 extends InputStream {
    public final o63 a;
    public final u63 b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public s63(o63 o63Var, u63 u63Var) {
        this.a = o63Var;
        this.b = u63Var;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.close();
        this.e = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        gre.p(!this.e);
        boolean z = this.d;
        o63 o63Var = this.a;
        if (!z) {
            o63Var.open(this.b);
            this.d = true;
        }
        int read = o63Var.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
