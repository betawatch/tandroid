package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u10 extends org.telegram.ui.Components.uj0 {
    public final /* synthetic */ c40 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u10(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f3 = c40Var;
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.k10 k10Var = (org.telegram.ui.Components.k10) view;
        c40 c40Var = this.f3;
        k30 k30Var = c40Var.L1;
        y10 y10Var = c40Var.Z3;
        if (y10Var.r == null && !c40Var.M4.k()) {
            k10Var.setAlpha(1.0f);
            k10Var.setTranslationX(0.0f);
            k10Var.setTranslationY(0.0f);
        }
        u10 u10Var = c40Var.l4;
        k10Var.getClass();
        u10Var.getClass();
        if (RecyclerView.R(k10Var) == -1 && k10Var.getRenderer() != null) {
            return true;
        }
        if (k10Var.getTranslationY() == 0.0f || k10Var.getRenderer() == null || k10Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j3);
        }
        float top = k30Var.getTop() - getTop();
        float measuredHeight = k30Var.getMeasuredHeight() + top;
        float f10 = y10Var.c;
        canvas.save();
        float f11 = 1.0f - f10;
        canvas.clipRect(0.0f, top * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
