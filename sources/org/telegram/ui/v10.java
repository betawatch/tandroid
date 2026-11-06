package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class v10 extends org.telegram.ui.Components.pj0 {
    public final /* synthetic */ c40 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v10(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.e3 = c40Var;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) view;
        c40 c40Var = this.e3;
        k30 k30Var = c40Var.H1;
        z10 z10Var = c40Var.R3;
        if (z10Var.r == null && !c40Var.E4.k()) {
            g10Var.setAlpha(1.0f);
            g10Var.setTranslationX(0.0f);
            g10Var.setTranslationY(0.0f);
        }
        v10 v10Var = c40Var.d4;
        g10Var.getClass();
        v10Var.getClass();
        if (RecyclerView.R(g10Var) == -1 && g10Var.getRenderer() != null) {
            return true;
        }
        if (g10Var.getTranslationY() == 0.0f || g10Var.getRenderer() == null || g10Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j3);
        }
        float top = k30Var.getTop() - getTop();
        float measuredHeight = k30Var.getMeasuredHeight() + top;
        float f10 = z10Var.c;
        canvas.save();
        float f11 = 1.0f - f10;
        canvas.clipRect(0.0f, top * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
