package wh;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.ra0;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class b extends ra0 {
    public final /* synthetic */ d a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, m2 m2Var, long j3) {
        super(m2Var, j3);
        this.a0 = dVar;
    }

    @Override // org.telegram.ui.Components.d71, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        d dVar = this.a0;
        b bVar = dVar.i;
        if (bVar != null && !bVar.U.b) {
            dVar.i = null;
        }
        super.dismiss();
    }
}
