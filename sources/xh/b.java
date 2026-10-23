package xh;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.za0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class b extends za0 {
    public final /* synthetic */ d b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, o2 o2Var, long j10) {
        super(o2Var, j10);
        this.b0 = dVar;
    }

    @Override // org.telegram.ui.Components.s71, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        d dVar = this.b0;
        b bVar = dVar.i;
        if (bVar != null && !bVar.U.b) {
            dVar.i = null;
        }
        super.dismiss();
    }
}
