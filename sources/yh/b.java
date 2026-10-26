package yh;

import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.va0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b extends va0 {
    public final /* synthetic */ d b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, r2 r2Var, long j10) {
        super(r2Var, j10);
        this.b0 = dVar;
    }

    @Override // org.telegram.ui.Components.b81, org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        d dVar = this.b0;
        b bVar = dVar.i;
        if (bVar != null && !bVar.U.b) {
            dVar.i = null;
        }
        super.dismiss();
    }
}
