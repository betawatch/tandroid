// default package

import android.os.Bundle;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class zf1 extends mu1 {
    public final /* synthetic */ fx0 wd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf1(Bundle bundle, fx0 fx0Var) {
        super(bundle);
        this.wd = fx0Var;
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        fx0 fx0Var = this.wd;
        fx0Var.X(null);
        fx0Var.show();
    }
}
