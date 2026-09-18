package wh;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.da0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class b extends da0 {
    public final /* synthetic */ d a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, o2 o2Var, long j3) {
        super(o2Var, j3);
        this.a0 = dVar;
    }

    @Override // org.telegram.ui.Components.p61, org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        d dVar = this.a0;
        b bVar = dVar.i;
        if (bVar != null && !bVar.U.b) {
            dVar.i = null;
        }
        super.dismiss();
    }
}
