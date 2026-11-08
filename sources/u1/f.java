package u1;

import java.io.InputStream;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.a.mark(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public final void b(long j3) {
        int i7 = this.c;
        if (i7 > j3) {
            this.c = 0;
            this.a.reset();
        } else {
            j3 -= i7;
        }
        a((int) j3);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(ConnectionsManager.DEFAULT_DATACENTER_ID);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
