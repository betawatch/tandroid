package ph;

import android.os.Bundle;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class y2 extends tn {
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 Mc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(Bundle bundle, org.telegram.ui.ActionBar.f3 f3Var) {
        super(bundle);
        this.Mc = f3Var;
    }

    @Override // org.telegram.ui.tn, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.f3 f3Var = this.Mc;
        f3Var.makeAttached(null);
        f3Var.show();
    }
}
