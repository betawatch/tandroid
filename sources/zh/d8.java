package zh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final class d8 extends ProfileActivity {
    public final /* synthetic */ boolean w6;
    public final /* synthetic */ n8 x6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(n8 n8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.x6 = n8Var;
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
