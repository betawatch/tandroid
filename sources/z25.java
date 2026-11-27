// default package

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
