package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class w30 extends org.telegram.ui.Components.zl0 {
    public final /* synthetic */ h60 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(h60 h60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.e3 = h60Var;
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.v20 v20Var = (org.telegram.ui.Components.v20) view;
        h60 h60Var = this.e3;
        o50 o50Var = h60Var.Q;
        a40 a40Var = h60Var.a2;
        if (a40Var.r == null && !h60Var.N2.k()) {
            v20Var.setAlpha(1.0f);
            v20Var.setTranslationX(0.0f);
            v20Var.setTranslationY(0.0f);
        }
        w30 w30Var = h60Var.m2;
        v20Var.getClass();
        w30Var.getClass();
        if (RecyclerView.R(v20Var) == -1 && v20Var.getRenderer() != null) {
            return true;
        }
        if (v20Var.getTranslationY() == 0.0f || v20Var.getRenderer() == null || v20Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j3);
        }
        float top = o50Var.getTop() - getTop();
        float measuredHeight = o50Var.getMeasuredHeight() + top;
        float f7 = a40Var.c;
        canvas.save();
        float f10 = 1.0f - f7;
        canvas.clipRect(0.0f, top * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
