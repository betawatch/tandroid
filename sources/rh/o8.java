package rh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class o8 extends ProfileActivity {
    public final /* synthetic */ boolean U6;
    public final /* synthetic */ y8 V6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(y8 y8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.V6 = y8Var;
        this.U6 = z10;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.U6) {
            return;
        }
        this.V6.show();
    }
}
