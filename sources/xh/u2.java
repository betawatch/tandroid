package xh;

import android.os.Bundle;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u2 extends un {
    public final /* synthetic */ org.telegram.ui.ActionBar.z2 jd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Bundle bundle, org.telegram.ui.ActionBar.z2 z2Var) {
        super(bundle);
        this.jd = z2Var;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.z2 z2Var = this.jd;
        z2Var.a0(null);
        z2Var.show();
    }
}
