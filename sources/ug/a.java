package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.pj0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class a extends FrameLayout implements l0 {
    public final h6 a;
    public final pj0 b;
    public final v4.b0 c;

    public a(Context context, h6 h6Var) {
        super(context);
        this.a = h6Var;
        pj0 pj0Var = new pj0(context, h6Var);
        this.b = pj0Var;
        pj0Var.setNestedScrollingEnabled(true);
        pj0Var.setAdapter(a());
        v4.b0 b0Var = new v4.b0(1, false);
        this.c = b0Var;
        pj0Var.setLayoutManager(b0Var);
        pj0Var.setClipToPadding(false);
        addView(pj0Var, ha.c(-1.0f, -1));
    }

    public abstract v4.g0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint W0 = m6.W0("paintDivider", this.a);
        if (W0 == null) {
            W0 = m6.k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, W0);
    }

    @Override // ug.l0
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            pj0 pj0Var = this.b;
            if (pj0Var.K(0) == null || pj0Var.K(0).a.getTop() != pj0Var.getPaddingTop()) {
                pj0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i7) {
        this.b.setPadding(0, i7, 0, 0);
    }
}
