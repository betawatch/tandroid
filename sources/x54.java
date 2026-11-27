// default package

import java.io.InputStream;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
