package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class x30 extends org.telegram.ui.Components.vl0 {
    public final /* synthetic */ j60 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.X2 = j60Var;
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) view;
        j60 j60Var = this.X2;
        p50 p50Var = j60Var.Q;
        b40 b40Var = j60Var.a2;
        if (b40Var.r == null && !j60Var.N2.k()) {
            a30Var.setAlpha(1.0f);
            a30Var.setTranslationX(0.0f);
            a30Var.setTranslationY(0.0f);
        }
        x30 x30Var = j60Var.m2;
        a30Var.getClass();
        x30Var.getClass();
        if (RecyclerView.R(a30Var) == -1 && a30Var.getRenderer() != null) {
            return true;
        }
        if (a30Var.getTranslationY() == 0.0f || a30Var.getRenderer() == null || a30Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j3);
        }
        float top = p50Var.getTop() - getTop();
        float measuredHeight = p50Var.getMeasuredHeight() + top;
        float f7 = b40Var.c;
        canvas.save();
        float f10 = 1.0f - f7;
        canvas.clipRect(0.0f, top * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
