package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class x7 extends ProfileActivity {
    public final /* synthetic */ boolean w6;
    public final /* synthetic */ h8 x6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(h8 h8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.x6 = h8Var;
        this.w6 = z10;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.w6) {
            return;
        }
        this.x6.show();
    }
}
