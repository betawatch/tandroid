package rh;

import android.os.Bundle;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class p8 extends un {
    public final /* synthetic */ boolean kd;
    public final /* synthetic */ y8 ld;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(y8 y8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.ld = y8Var;
        this.kd = z10;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.kd) {
            return;
        }
        this.ld.show();
    }
}
