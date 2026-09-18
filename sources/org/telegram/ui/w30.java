package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class w30 extends org.telegram.ui.Components.wl0 {
    public final /* synthetic */ i60 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.X2 = i60Var;
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) view;
        i60 i60Var = this.X2;
        o50 o50Var = i60Var.Q;
        a40 a40Var = i60Var.a2;
        if (a40Var.r == null && !i60Var.N2.k()) {
            r20Var.setAlpha(1.0f);
            r20Var.setTranslationX(0.0f);
            r20Var.setTranslationY(0.0f);
        }
        w30 w30Var = i60Var.m2;
        r20Var.getClass();
        w30Var.getClass();
        if (RecyclerView.S(r20Var) == -1 && r20Var.getRenderer() != null) {
            return true;
        }
        if (r20Var.getTranslationY() == 0.0f || r20Var.getRenderer() == null || r20Var.getRenderer().c == null) {
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
