package ph;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class h6 implements ng.g {
    public final /* synthetic */ m6 a;

    public h6(m6 m6Var) {
        this.a = m6Var;
    }

    @Override // ng.g
    public final void Y(g.x xVar) {
        xVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        xVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // ng.g
    public final void k(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        m6 m6Var = this.a;
        canvas.drawColor(m6Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            m6Var.i0.b(canvas, -2);
        }
    }
}
