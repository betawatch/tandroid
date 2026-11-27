// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class xn5 {
    public final TLObject a;
    public TLRPC.User b;
    public final byte c;
    public final boolean d;
    public boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public xn5(int i, TLObject tLObject) {
        this.a = tLObject;
        this.c = i;
        this.d = (tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self;
    }
}
