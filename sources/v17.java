// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class v17 extends zo {
    public final /* synthetic */ b27 c;

    public v17(b27 b27Var) {
        this.c = b27Var;
    }

    @Override // zo
    public final int i(int i) {
        b27 b27Var = this.c;
        r17 r17Var = b27Var.f;
        if (i == 0) {
            return 100;
        }
        int i2 = i - 1;
        Object J = r17Var.J(i2);
        if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
            return 100;
        }
        if (J instanceof TLRPC.Document) {
            return 20;
        }
        if (r17Var.I() != null || r17Var.V != null) {
            i = i2;
        }
        u17 u17Var = b27Var.d;
        u17Var.z1();
        return u17Var.R.get(i);
    }
}
