package rh;

import android.os.Bundle;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class y2 extends zn {
    public final /* synthetic */ org.telegram.ui.ActionBar.g3 Nc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(Bundle bundle, org.telegram.ui.ActionBar.g3 g3Var) {
        super(bundle);
        this.Nc = g3Var;
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.g3 g3Var = this.Nc;
        g3Var.makeAttached(null);
        g3Var.show();
    }
}
