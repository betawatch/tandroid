package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class u30 extends org.telegram.ui.Components.qm0 {
    public final /* synthetic */ g60 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u30(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.V2 = g60Var;
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.i30 i30Var = (org.telegram.ui.Components.i30) view;
        g60 g60Var = this.V2;
        m50 m50Var = g60Var.Q;
        y30 y30Var = g60Var.a2;
        if (y30Var.r == null && !g60Var.N2.k()) {
            i30Var.setAlpha(1.0f);
            i30Var.setTranslationX(0.0f);
            i30Var.setTranslationY(0.0f);
        }
        u30 u30Var = g60Var.m2;
        i30Var.getClass();
        u30Var.getClass();
        if (RecyclerView.R(i30Var) == -1 && i30Var.getRenderer() != null) {
            return true;
        }
        if (i30Var.getTranslationY() == 0.0f || i30Var.getRenderer() == null || i30Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j3);
        }
        float top = m50Var.getTop() - getTop();
        float measuredHeight = m50Var.getMeasuredHeight() + top;
        float f7 = y30Var.c;
        canvas.save();
        float f10 = 1.0f - f7;
        canvas.clipRect(0.0f, top * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
