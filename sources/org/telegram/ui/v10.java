package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        org.telegram.ui.Components.h10 h10Var = (org.telegram.ui.Components.h10) view;
        c40 c40Var = this.e3;
        k30 k30Var = c40Var.H1;
        z10 z10Var = c40Var.R3;
        if (z10Var.r == null && !c40Var.E4.k()) {
            h10Var.setAlpha(1.0f);
            h10Var.setTranslationX(0.0f);
            h10Var.setTranslationY(0.0f);
        }
        v10 v10Var = c40Var.d4;
        h10Var.getClass();
        v10Var.getClass();
        if (RecyclerView.R(h10Var) == -1 && h10Var.getRenderer() != null) {
            return true;
        }
        if (h10Var.getTranslationY() == 0.0f || h10Var.getRenderer() == null || h10Var.getRenderer().c == null) {
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
