// default package

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
