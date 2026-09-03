package tf;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b0 extends f2.q {
    public final /* synthetic */ g0 b;

    public b0(g0 g0Var) {
        this.b = g0Var;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        g0 g0Var = this.b;
        e0 e0Var = (e0) g0Var.V2.get(i10);
        e0 e0Var2 = (e0) g0Var.U2.get(i11);
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

    @Override // f2.q
    public final int d() {
        return this.b.U2.size();
    }

    @Override // f2.q
    public final int e() {
        return this.b.V2.size();
    }
}
