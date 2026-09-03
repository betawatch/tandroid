package qh;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class d6 implements og.g {
    public final /* synthetic */ i6 a;

    public d6(i6 i6Var) {
        this.a = i6Var;
    }

    @Override // og.g
    public final void P(g.x xVar) {
        xVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        xVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // og.g
    public final void i(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        i6 i6Var = this.a;
        canvas.drawColor(i6Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            i6Var.i0.b(canvas, -2);
        }
    }
}
