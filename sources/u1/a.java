package u1;

import android.media.MediaDataSource;
import java.io.IOException;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
    public final int readAt(long j3, byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (j3 < 0) {
            return -1;
        }
        try {
            long j10 = this.a;
            f fVar = this.b;
            if (j10 != j3) {
                if (j10 >= 0 && j3 >= j10 + fVar.a.available()) {
                    return -1;
                }
                fVar.b(j3);
                this.a = j3;
            }
            if (i10 > fVar.a.available()) {
                i10 = fVar.a.available();
            }
            int read = fVar.read(bArr, i7, i10);
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
