package ze;

import com.google.firebase.messaging.d;
import java.io.InputStream;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a extends d {
    public final long d;

    public a(InputStream inputStream, long j10, long j11) {
        super(inputStream, j10);
        this.d = j10 + j11;
    }

    public final long e() {
        return this.d - this.b;
    }

    @Override // com.google.firebase.messaging.d, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.b == this.d) {
            return -1;
        }
        return super.read();
    }

    @Override // com.google.firebase.messaging.d, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long j11 = this.b;
        long j12 = j11 + j10;
        long j13 = this.d;
        if (j12 > j13) {
            j10 = (int) (j13 - j11);
        }
        return super.skip(j10);
    }

    @Override // com.google.firebase.messaging.d, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        long j10 = this.b;
        long j11 = i11 + j10;
        long j12 = this.d;
        if (j11 <= j12 || (i11 = (int) (j12 - j10)) != 0) {
            return super.read(bArr, i10, i11);
        }
        return -1;
    }
}
