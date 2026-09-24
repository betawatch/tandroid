package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class e8 extends ProfileActivity {
    public final /* synthetic */ boolean w6;
    public final /* synthetic */ o8 x6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(o8 o8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.x6 = o8Var;
        this.w6 = z10;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.w6) {
            return;
        }
        this.x6.show();
    }
}
