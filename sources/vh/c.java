package vh;

import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.na0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c extends na0 {
    public final /* synthetic */ e a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, p2 p2Var, long j3) {
        super(p2Var, j3);
        this.a0 = eVar;
    }

    @Override // org.telegram.ui.Components.b71, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        e eVar = this.a0;
        c cVar = eVar.i;
        if (cVar != null && !cVar.U.b) {
            eVar.i = null;
        }
        super.dismiss();
    }
}
