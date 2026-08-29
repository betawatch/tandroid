package rf;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c0 extends f2.q {
    public final /* synthetic */ h0 b;

    public c0(h0 h0Var) {
        this.b = h0Var;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        h0 h0Var = this.b;
        f0 f0Var = (f0) h0Var.U2.get(i10);
        f0 f0Var2 = (f0) h0Var.T2.get(i11);
        if (!f0Var.b(f0Var2)) {
            return false;
        }
        int i12 = f0Var.d;
        if (i12 != 4) {
            return i12 == 6 ? f0Var.c.equals(f0Var2.c) : i12 == 7;
        }
        TLObject tLObject = f0Var.f;
        if (tLObject instanceof TLRPC.User) {
            TLObject tLObject2 = f0Var2.f;
            if (tLObject2 instanceof TLRPC.User) {
                return ((TLRPC.User) tLObject).id == ((TLRPC.User) tLObject2).id;
            }
        }
        if (!(tLObject instanceof TLRPC.Chat)) {
            return false;
        }
        TLObject tLObject3 = f0Var2.f;
        return (tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).id == ((TLRPC.Chat) tLObject3).id;
    }

    @Override // f2.q
    public final int d() {
        return this.b.T2.size();
    }

    @Override // f2.q
    public final int e() {
        return this.b.U2.size();
    }
}
