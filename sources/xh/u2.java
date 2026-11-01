package xh;

import android.os.Bundle;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class u2 extends un {
    public final /* synthetic */ org.telegram.ui.ActionBar.z2 kd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Bundle bundle, org.telegram.ui.ActionBar.z2 z2Var) {
        super(bundle);
        this.kd = z2Var;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.z2 z2Var = this.kd;
        z2Var.a0(null);
        z2Var.show();
    }
}
