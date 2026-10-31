package rh;

import android.os.Bundle;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p8 extends un {
    public final /* synthetic */ boolean jd;
    public final /* synthetic */ y8 kd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(y8 y8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.kd = y8Var;
        this.jd = z10;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.jd) {
            return;
        }
        this.kd.show();
    }
}
