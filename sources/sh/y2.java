package sh;

import android.os.Bundle;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
