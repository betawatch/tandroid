package xe;

import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.q;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c extends InputStream {
    public final m a;
    public final byte[] b = new byte[1];
    public long c;

    public c(m mVar, q qVar) {
        this.a = mVar;
        try {
            this.c = mVar.open(qVar);
        } catch (IOException e9) {
            throw new RuntimeException(e9);
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
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int read = this.a.read(bArr, i10, i11);
        this.c -= read;
        return read;
    }
}
