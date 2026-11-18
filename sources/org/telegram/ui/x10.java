package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x10 extends org.telegram.ui.Components.ck0 {
    public final /* synthetic */ f40 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x10(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f3 = f40Var;
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.r10 r10Var = (org.telegram.ui.Components.r10) view;
        f40 f40Var = this.f3;
        n30 n30Var = f40Var.L1;
        b20 b20Var = f40Var.Z3;
        if (b20Var.r == null && !f40Var.M4.k()) {
            r10Var.setAlpha(1.0f);
            r10Var.setTranslationX(0.0f);
            r10Var.setTranslationY(0.0f);
        }
        x10 x10Var = f40Var.l4;
        r10Var.getClass();
        x10Var.getClass();
        if (RecyclerView.R(r10Var) == -1 && r10Var.getRenderer() != null) {
            return true;
        }
        if (r10Var.getTranslationY() == 0.0f || r10Var.getRenderer() == null || r10Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j3);
        }
        float top = n30Var.getTop() - getTop();
        float measuredHeight = n30Var.getMeasuredHeight() + top;
        float f10 = b20Var.c;
        canvas.save();
        float f11 = 1.0f - f10;
        canvas.clipRect(0.0f, top * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
