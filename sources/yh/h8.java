package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class h8 extends ProfileActivity {
    public final /* synthetic */ boolean w6;
    public final /* synthetic */ r8 x6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(r8 r8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.x6 = r8Var;
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
