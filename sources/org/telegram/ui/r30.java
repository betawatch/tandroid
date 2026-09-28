package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class r30 extends org.telegram.ui.Components.yl0 {
    public final /* synthetic */ d60 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r30(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.X2 = d60Var;
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.u20 u20Var = (org.telegram.ui.Components.u20) view;
        d60 d60Var = this.X2;
        j50 j50Var = d60Var.Q;
        v30 v30Var = d60Var.a2;
        if (v30Var.r == null && !d60Var.N2.k()) {
            u20Var.setAlpha(1.0f);
            u20Var.setTranslationX(0.0f);
            u20Var.setTranslationY(0.0f);
        }
        r30 r30Var = d60Var.m2;
        u20Var.getClass();
        r30Var.getClass();
        if (RecyclerView.R(u20Var) == -1 && u20Var.getRenderer() != null) {
            return true;
        }
        if (u20Var.getTranslationY() == 0.0f || u20Var.getRenderer() == null || u20Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j3);
        }
        float top = j50Var.getTop() - getTop();
        float measuredHeight = j50Var.getMeasuredHeight() + top;
        float f7 = v30Var.c;
        canvas.save();
        float f10 = 1.0f - f7;
        canvas.clipRect(0.0f, top * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
