package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class g8 extends ProfileActivity {
    public final /* synthetic */ boolean w6;
    public final /* synthetic */ q8 x6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(q8 q8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.x6 = q8Var;
        this.w6 = z10;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.w6) {
            return;
        }
        this.x6.show();
    }
}
