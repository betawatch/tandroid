// default package

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v25 implements AutoCloseable {
    public TL_wallet.sendTransfer a;
    public y25 b;
    public byte[] c;

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
