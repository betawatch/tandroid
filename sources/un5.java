// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class un5 {
    public final TLObject a;
    public TLRPC.User b;
    public final byte c;
    public final boolean d;
    public boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public un5(int i, TLObject tLObject) {
        this.a = tLObject;
        this.c = i;
        this.d = (tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self;
    }
}
