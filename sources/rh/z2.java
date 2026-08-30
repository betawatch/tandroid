package rh;

import android.os.Bundle;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class z2 extends xn {
    public final /* synthetic */ org.telegram.ui.ActionBar.g3 Nc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(Bundle bundle, org.telegram.ui.ActionBar.g3 g3Var) {
        super(bundle);
        this.Nc = g3Var;
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.g3 g3Var = this.Nc;
        g3Var.makeAttached(null);
        g3Var.show();
    }
}
