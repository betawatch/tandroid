// default package

import android.media.MediaDataSource;
import android.net.Uri;
import java.io.IOException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t3b extends MediaDataSource {
    public final Uri a;
    public final long b;
    public volatile kb4 c;
    public long d = -1;
    public volatile boolean e;

    public t3b(long j, Uri uri) {
        this.a = uri;
        this.b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
        kb4 kb4Var = this.c;
        if (kb4Var != null) {
            try {
                kb4Var.close();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.b;
    }

    @Override // android.media.MediaDataSource
    public final synchronized int readAt(long j, byte[] bArr, int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j >= this.b) {
            return -1;
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.c == null || j != this.d) {
            kb4 kb4Var = this.c;
            this.c = null;
            if (kb4Var != null) {
                kb4Var.close();
            }
            kb4 kb4Var2 = new kb4();
            kb4Var2.open(new u63(j, this.a));
            this.c = kb4Var2;
            this.d = j;
        }
        int read = this.c.read(bArr, i, i2);
        if (this.e) {
            throw new IOException("closed");
        }
        if (read <= 0) {
            return read == 0 ? 0 : -1;
        }
        this.d += read;
        return read;
    }
}
