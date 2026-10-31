package xh;

import android.os.Bundle;
import org.telegram.ui.ay;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a1 extends ay {
    public final /* synthetic */ org.telegram.tgnet.e B4;
    public final /* synthetic */ c1 C4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, Bundle bundle, org.telegram.tgnet.e eVar) {
        super(bundle);
        this.C4 = c1Var;
        this.B4 = eVar;
    }

    @Override // org.telegram.ui.ay
    public final boolean T3() {
        return true;
    }

    @Override // org.telegram.ui.ay, org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        c1 c1Var = this.C4;
        if (c1Var.U1) {
            return;
        }
        c1Var.U1 = true;
        this.B4.a("USER_DECLINED", null);
    }
}
