package ph;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class h6 implements ng.g {
    public final /* synthetic */ l6 a;

    public h6(l6 l6Var) {
        this.a = l6Var;
    }

    @Override // ng.g
    public final void D(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        l6 l6Var = this.a;
        canvas.drawColor(l6Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            l6Var.i0.b(canvas, -3);
        }
    }

    @Override // ng.g
    public final void D1(g.x xVar) {
        xVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        xVar.b(SharedConfig.chatBlurEnabled());
    }
}
