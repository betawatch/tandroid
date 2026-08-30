package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class r30 extends org.telegram.ui.Components.sl0 {
    public final /* synthetic */ c60 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r30(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.U2 = c60Var;
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) view;
        c60 c60Var = this.U2;
        j50 j50Var = c60Var.N;
        v30 v30Var = c60Var.X1;
        if (v30Var.r == null && !c60Var.K2.k()) {
            s20Var.setAlpha(1.0f);
            s20Var.setTranslationX(0.0f);
            s20Var.setTranslationY(0.0f);
        }
        r30 r30Var = c60Var.j2;
        s20Var.getClass();
        r30Var.getClass();
        if (RecyclerView.R(s20Var) == -1 && s20Var.getRenderer() != null) {
            return true;
        }
        if (s20Var.getTranslationY() == 0.0f || s20Var.getRenderer() == null || s20Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j10);
        }
        float top = j50Var.getTop() - getTop();
        float measuredHeight = j50Var.getMeasuredHeight() + top;
        float f10 = v30Var.c;
        canvas.save();
        float f11 = 1.0f - f10;
        canvas.clipRect(0.0f, top * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
