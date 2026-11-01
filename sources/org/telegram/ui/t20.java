package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class t20 extends org.telegram.ui.Components.uk0 {
    public final /* synthetic */ a50 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.e3 = a50Var;
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) view;
        a50 a50Var = this.e3;
        h40 h40Var = a50Var.H1;
        x20 x20Var = a50Var.R3;
        if (x20Var.r == null && !a50Var.E4.k()) {
            y10Var.setAlpha(1.0f);
            y10Var.setTranslationX(0.0f);
            y10Var.setTranslationY(0.0f);
        }
        t20 t20Var = a50Var.d4;
        y10Var.getClass();
        t20Var.getClass();
        if (RecyclerView.R(y10Var) == -1 && y10Var.getRenderer() != null) {
            return true;
        }
        if (y10Var.getTranslationY() == 0.0f || y10Var.getRenderer() == null || y10Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j10);
        }
        float top = h40Var.getTop() - getTop();
        float measuredHeight = h40Var.getMeasuredHeight() + top;
        float f7 = x20Var.c;
        canvas.save();
        float f10 = 1.0f - f7;
        canvas.clipRect(0.0f, top * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
