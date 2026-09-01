package sh;

import android.os.Bundle;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class y2 extends xn {
    public final /* synthetic */ org.telegram.ui.ActionBar.h3 Nc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(Bundle bundle, org.telegram.ui.ActionBar.h3 h3Var) {
        super(bundle);
        this.Nc = h3Var;
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.h3 h3Var = this.Nc;
        h3Var.makeAttached(null);
        h3Var.show();
    }
}
