package xh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ya0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class b extends ya0 {
    public final /* synthetic */ d a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, n2 n2Var, long j10) {
        super(n2Var, j10);
        this.a0 = dVar;
    }

    @Override // org.telegram.ui.Components.j71, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        d dVar = this.a0;
        b bVar = dVar.i;
        if (bVar != null && !bVar.U.b) {
            dVar.i = null;
        }
        super.dismiss();
    }
}
