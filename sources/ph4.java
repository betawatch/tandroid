// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ph4 extends age {
    public final /* synthetic */ uh4 a;

    public ph4(uh4 uh4Var) {
        this.a = uh4Var;
    }

    @Override // age
    public final boolean b(int i, int i2) {
        uh4 uh4Var = this.a;
        sh4 sh4Var = (sh4) uh4Var.g3.get(i);
        sh4 sh4Var2 = (sh4) uh4Var.f3.get(i2);
        if (!sh4Var.b(sh4Var2)) {
            return false;
        }
        byte b = sh4Var.d;
        if (b != 4) {
            return b == 6 ? sh4Var.c.equals(sh4Var2.c) : b == 7;
        }
        TLObject tLObject = sh4Var.f;
        if (tLObject instanceof TLRPC.User) {
            TLObject tLObject2 = sh4Var2.f;
            if (tLObject2 instanceof TLRPC.User) {
                return ((TLRPC.User) tLObject).id == ((TLRPC.User) tLObject2).id;
            }
        }
        if (!(tLObject instanceof TLRPC.Chat)) {
            return false;
        }
        TLObject tLObject3 = sh4Var2.f;
        return (tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).id == ((TLRPC.Chat) tLObject3).id;
    }

    @Override // age
    public final int c() {
        return this.a.f3.size();
    }

    @Override // age
    public final int d() {
        return this.a.g3.size();
    }
}
