package xh;

import android.os.Bundle;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class i8 extends eo {
    public final /* synthetic */ boolean Qc;
    public final /* synthetic */ r8 Rc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(r8 r8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Rc = r8Var;
        this.Qc = z10;
    }

    @Override // org.telegram.ui.eo, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Qc) {
            return;
        }
        this.Rc.show();
    }
}
