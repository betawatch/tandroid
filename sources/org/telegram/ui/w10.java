package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class w10 extends org.telegram.ui.Components.ek0 {
    public final /* synthetic */ e40 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f3 = e40Var;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.s10 s10Var = (org.telegram.ui.Components.s10) view;
        e40 e40Var = this.f3;
        m30 m30Var = e40Var.L1;
        a20 a20Var = e40Var.Z3;
        if (a20Var.r == null && !e40Var.M4.k()) {
            s10Var.setAlpha(1.0f);
            s10Var.setTranslationX(0.0f);
            s10Var.setTranslationY(0.0f);
        }
        w10 w10Var = e40Var.l4;
        s10Var.getClass();
        w10Var.getClass();
        if (RecyclerView.R(s10Var) == -1 && s10Var.getRenderer() != null) {
            return true;
        }
        if (s10Var.getTranslationY() == 0.0f || s10Var.getRenderer() == null || s10Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j3);
        }
        float top = m30Var.getTop() - getTop();
        float measuredHeight = m30Var.getMeasuredHeight() + top;
        float f10 = a20Var.c;
        canvas.save();
        float f11 = 1.0f - f10;
        canvas.clipRect(0.0f, top * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
