package u1;

import java.io.InputStream;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
