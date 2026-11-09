package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.qj0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class a extends FrameLayout implements l0 {
    public final g6 a;
    public final qj0 b;
    public final v4.b0 c;

    public a(Context context, g6 g6Var) {
        super(context);
        this.a = g6Var;
        qj0 qj0Var = new qj0(context, g6Var);
        this.b = qj0Var;
        qj0Var.setNestedScrollingEnabled(true);
        qj0Var.setAdapter(a());
        v4.b0 b0Var = new v4.b0(1, false);
        this.c = b0Var;
        qj0Var.setLayoutManager(b0Var);
        qj0Var.setClipToPadding(false);
        addView(qj0Var, ha.c(-1.0f, -1));
    }

    public abstract v4.g0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint W0 = l6.W0("paintDivider", this.a);
        if (W0 == null) {
            W0 = l6.k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, W0);
    }

    @Override // ug.l0
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            qj0 qj0Var = this.b;
            if (qj0Var.K(0) == null || qj0Var.K(0).a.getTop() != qj0Var.getPaddingTop()) {
                qj0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i7) {
        this.b.setPadding(0, i7, 0, 0);
    }
}
