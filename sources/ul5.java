// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ul5 {
    public final TLObject a;
    public TLRPC.User b;
    public final byte c;
    public final boolean d;
    public boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public ul5(int i, TLObject tLObject) {
        this.a = tLObject;
        this.c = i;
        this.d = (tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self;
    }
}
