package zf;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b0 extends s4.n {
    public final /* synthetic */ g0 b;

    public b0(g0 g0Var) {
        this.b = g0Var;
    }

    @Override // s4.n
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // s4.n
    public final boolean b(int i10, int i11) {
        g0 g0Var = this.b;
        e0 e0Var = (e0) g0Var.f3.get(i10);
        e0 e0Var2 = (e0) g0Var.e3.get(i11);
        if (!e0Var.b(e0Var2)) {
            return false;
        }
        int i12 = e0Var.d;
        if (i12 != 4) {
            return i12 == 6 ? e0Var.c.equals(e0Var2.c) : i12 == 7;
        }
        TLObject tLObject = e0Var.f;
        if (tLObject instanceof TLRPC.User) {
            TLObject tLObject2 = e0Var2.f;
            if (tLObject2 instanceof TLRPC.User) {
                return ((TLRPC.User) tLObject).id == ((TLRPC.User) tLObject2).id;
            }
        }
        if (!(tLObject instanceof TLRPC.Chat)) {
            return false;
        }
        TLObject tLObject3 = e0Var2.f;
        return (tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).id == ((TLRPC.Chat) tLObject3).id;
    }

    @Override // s4.n
    public final int d() {
        return this.b.e3.size();
    }

    @Override // s4.n
    public final int e() {
        return this.b.f3.size();
    }
}
