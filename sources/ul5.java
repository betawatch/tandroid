// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
