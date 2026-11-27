// default package

import java.io.InputStream;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class x54 extends t54 {
    public x54(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(ConnectionsManager.DEFAULT_DATACENTER_ID);
        } else {
            lq5.j("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void b(long j) {
        int i = this.c;
        if (i > j) {
            this.c = 0;
            this.a.reset();
        } else {
            j -= i;
        }
        a((int) j);
    }

    public x54(byte[] bArr) {
        super(bArr);
        this.a.mark(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }
}
