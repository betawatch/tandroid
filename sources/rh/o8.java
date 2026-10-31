package rh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o8 extends ProfileActivity {
    public final /* synthetic */ boolean T6;
    public final /* synthetic */ y8 U6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(y8 y8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.U6 = y8Var;
        this.T6 = z10;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.T6) {
            return;
        }
        this.U6.show();
    }
}
