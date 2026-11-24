// default package

import android.media.MediaDataSource;
import android.net.Uri;
import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class u5b extends MediaDataSource {
    public final Uri a;
    public final long b;
    public volatile kd4 c;
    public long d = -1;
    public volatile boolean e;

    public u5b(long j, Uri uri) {
        this.a = uri;
        this.b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
        kd4 kd4Var = this.c;
        if (kd4Var != null) {
            try {
                kd4Var.close();
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
            kd4 kd4Var = this.c;
            this.c = null;
            if (kd4Var != null) {
                kd4Var.close();
            }
            kd4 kd4Var2 = new kd4();
            kd4Var2.open(new g83(j, this.a));
            this.c = kd4Var2;
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
