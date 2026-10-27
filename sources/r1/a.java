package r1;

import android.media.MediaDataSource;
import java.io.IOException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a extends MediaDataSource {
    public long a;
    public final /* synthetic */ f b;

    public a(f fVar) {
        this.b = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (j10 < 0) {
            return -1;
        }
        try {
            long j11 = this.a;
            f fVar = this.b;
            if (j11 != j10) {
                if (j11 >= 0 && j10 >= j11 + fVar.a.available()) {
                    return -1;
                }
                fVar.b(j10);
                this.a = j10;
            }
            if (i11 > fVar.a.available()) {
                i11 = fVar.a.available();
            }
            int read = fVar.read(bArr, i10, i11);
            if (read >= 0) {
                this.a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
