package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class a extends FrameLayout implements n0 {
    public final h6 a;
    public final ek0 b;
    public final v4.c0 c;

    public a(Context context, h6 h6Var) {
        super(context);
        this.a = h6Var;
        ek0 ek0Var = new ek0(context, h6Var);
        this.b = ek0Var;
        ek0Var.setNestedScrollingEnabled(true);
        ek0Var.setAdapter(a());
        v4.c0 c0Var = new v4.c0(1, false);
        this.c = c0Var;
        ek0Var.setLayoutManager(c0Var);
        ek0Var.setClipToPadding(false);
        addView(ek0Var, ma.c(-1.0f, -1));
    }

    public abstract v4.i0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint W0 = m6.W0("paintDivider", this.a);
        if (W0 == null) {
            W0 = m6.k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, W0);
    }

    @Override // ug.n0
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            ek0 ek0Var = this.b;
            if (ek0Var.K(0) == null || ek0Var.K(0).a.getTop() != ek0Var.getPaddingTop()) {
                ek0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i7) {
        this.b.setPadding(0, i7, 0, 0);
    }
}
