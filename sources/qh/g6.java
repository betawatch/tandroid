package qh;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class g6 implements og.g {
    public final /* synthetic */ k6 a;

    public g6(k6 k6Var) {
        this.a = k6Var;
    }

    @Override // og.g
    public final void P(g.x xVar) {
        xVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        xVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // og.g
    public final void i(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        k6 k6Var = this.a;
        canvas.drawColor(k6Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            k6Var.i0.b(canvas, -3);
        }
    }
}
