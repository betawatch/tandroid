package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class t30 extends org.telegram.ui.Components.ml0 {
    public final /* synthetic */ f60 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t30(f60 f60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.X2 = f60Var;
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) view;
        f60 f60Var = this.X2;
        l50 l50Var = f60Var.Q;
        x30 x30Var = f60Var.a2;
        if (x30Var.r == null && !f60Var.N2.k()) {
            s20Var.setAlpha(1.0f);
            s20Var.setTranslationX(0.0f);
            s20Var.setTranslationY(0.0f);
        }
        t30 t30Var = f60Var.m2;
        s20Var.getClass();
        t30Var.getClass();
        if (RecyclerView.R(s20Var) == -1 && s20Var.getRenderer() != null) {
            return true;
        }
        if (s20Var.getTranslationY() == 0.0f || s20Var.getRenderer() == null || s20Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j3);
        }
        float top = l50Var.getTop() - getTop();
        float measuredHeight = l50Var.getMeasuredHeight() + top;
        float f7 = x30Var.c;
        canvas.save();
        float f10 = 1.0f - f7;
        canvas.clipRect(0.0f, top * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
