package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u20 extends org.telegram.ui.Components.tk0 {
    public final /* synthetic */ b50 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u20(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.e3 = b50Var;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) view;
        b50 b50Var = this.e3;
        i40 i40Var = b50Var.H1;
        y20 y20Var = b50Var.R3;
        if (y20Var.r == null && !b50Var.E4.k()) {
            y10Var.setAlpha(1.0f);
            y10Var.setTranslationX(0.0f);
            y10Var.setTranslationY(0.0f);
        }
        u20 u20Var = b50Var.d4;
        y10Var.getClass();
        u20Var.getClass();
        if (RecyclerView.R(y10Var) == -1 && y10Var.getRenderer() != null) {
            return true;
        }
        if (y10Var.getTranslationY() == 0.0f || y10Var.getRenderer() == null || y10Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j10);
        }
        float top = i40Var.getTop() - getTop();
        float measuredHeight = i40Var.getMeasuredHeight() + top;
        float f7 = y20Var.c;
        canvas.save();
        float f10 = 1.0f - f7;
        canvas.clipRect(0.0f, top * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
