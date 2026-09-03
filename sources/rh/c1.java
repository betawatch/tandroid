package rh;

import android.os.Bundle;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class c1 extends qy {
    public final /* synthetic */ kh.a0 y4;
    public final /* synthetic */ e1 z4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e1 e1Var, Bundle bundle, kh.a0 a0Var) {
        super(bundle);
        this.z4 = e1Var;
        this.y4 = a0Var;
    }

    @Override // org.telegram.ui.qy
    public final boolean I3() {
        return true;
    }

    @Override // org.telegram.ui.qy, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        e1 e1Var = this.z4;
        if (e1Var.Z) {
            return;
        }
        e1Var.Z = true;
        this.y4.run("USER_DECLINED", null);
    }
}
