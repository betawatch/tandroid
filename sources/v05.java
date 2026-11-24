// default package

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class v05 implements AutoCloseable {
    public TL_wallet.sendTransfer a;
    public y05 b;
    public byte[] c;

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
