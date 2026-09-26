package wh;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.pa0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class b extends pa0 {
    public final /* synthetic */ d a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, m2 m2Var, long j3) {
        super(m2Var, j3);
        this.a0 = dVar;
    }

    @Override // org.telegram.ui.Components.b71, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        d dVar = this.a0;
        b bVar = dVar.i;
        if (bVar != null && !bVar.U.b) {
            dVar.i = null;
        }
        super.dismiss();
    }
}
