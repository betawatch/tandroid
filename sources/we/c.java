package we;

import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.q;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends InputStream {
    public final m a;
    public final byte[] b = new byte[1];
    public long c;

    public c(m mVar, q qVar) {
        this.a = mVar;
        try {
            this.c = mVar.open(qVar);
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
        m mVar = this.a;
        byte[] bArr = this.b;
        int read = mVar.read(bArr, 0, 1);
        this.c--;
        if (read == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int read = this.a.read(bArr, i9, i10);
        this.c -= read;
        return read;
    }
}
