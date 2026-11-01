package xh;

import android.os.Bundle;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class a1 extends zx {
    public final /* synthetic */ org.telegram.tgnet.e B4;
    public final /* synthetic */ c1 C4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, Bundle bundle, org.telegram.tgnet.e eVar) {
        super(bundle);
        this.C4 = c1Var;
        this.B4 = eVar;
    }

    @Override // org.telegram.ui.zx
    public final boolean U3() {
        return true;
    }

    @Override // org.telegram.ui.zx, org.telegram.ui.ActionBar.k2
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
