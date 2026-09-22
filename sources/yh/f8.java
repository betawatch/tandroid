package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class f8 extends ProfileActivity {
    public final /* synthetic */ boolean w6;
    public final /* synthetic */ p8 x6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(p8 p8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.x6 = p8Var;
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
