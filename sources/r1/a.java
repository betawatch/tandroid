package r1;

import android.media.MediaDataSource;
import java.io.IOException;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
    public final int readAt(long j3, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (j3 < 0) {
            return -1;
        }
        try {
            long j10 = this.a;
            if (j10 != j3) {
                if (j10 >= 0 && j3 >= j10 + this.b.a.available()) {
                    return -1;
                }
                this.b.b(j3);
                this.a = j3;
            }
            if (i11 > this.b.a.available()) {
                i11 = this.b.a.available();
            }
            int read = this.b.read(bArr, i10, i11);
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
