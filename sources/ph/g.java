package ph;

import android.content.Context;
import oh.l6;
import org.telegram.ui.Components.ax0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class g extends k {
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, Context context) {
        super(lVar, context);
        this.v = lVar;
    }

    @Override // ph.k, f2.p0
    public final void l() {
        super.l();
        l lVar = this.v;
        if (lVar.r.getVisibility() == 0) {
            lVar.w.l();
        }
        ax0 ax0Var = lVar.y;
        if (ax0Var != null) {
            l6 l6Var = this.e;
            ax0Var.e(l6Var != null && l6Var.k(), true);
        }
    }
}
