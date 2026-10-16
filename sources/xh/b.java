package xh;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.eb0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class b extends eb0 {
    public final /* synthetic */ d a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, m2 m2Var, long j10) {
        super(m2Var, j10);
        this.a0 = dVar;
    }

    @Override // org.telegram.ui.Components.r71, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        d dVar = this.a0;
        b bVar = dVar.i;
        if (bVar != null && !bVar.U.b) {
            dVar.i = null;
        }
        super.dismiss();
    }
}
