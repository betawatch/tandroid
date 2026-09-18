package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.w6) {
            return;
        }
        this.x6.show();
    }
}
