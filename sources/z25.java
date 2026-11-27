// default package

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class z25 implements AutoCloseable {
    public TL_wallet.sendTransfer a;
    public c35 b;
    public byte[] c;

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
