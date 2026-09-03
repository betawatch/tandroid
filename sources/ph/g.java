package ph;

import android.content.Context;
import oh.l6;
import org.telegram.ui.Components.zw0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        zw0 zw0Var = lVar.y;
        if (zw0Var != null) {
            l6 l6Var = this.e;
            zw0Var.e(l6Var != null && l6Var.k(), true);
        }
    }
}
