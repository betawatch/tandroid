// default package

import android.os.Bundle;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class zf1 extends mu1 {
    public final /* synthetic */ fx0 vd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf1(Bundle bundle, fx0 fx0Var) {
        super(bundle);
        this.vd = fx0Var;
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        fx0 fx0Var = this.vd;
        fx0Var.X(null);
        fx0Var.show();
    }
}
