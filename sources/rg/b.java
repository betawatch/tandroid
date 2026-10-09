package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.qm0;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class b extends FrameLayout implements l0 {
    public final e6 a;
    public final qm0 b;
    public final s4.d0 c;

    public b(Context context, e6 e6Var) {
        super(context);
        this.a = e6Var;
        qm0 qm0Var = new qm0(context, e6Var);
        this.b = qm0Var;
        qm0Var.setNestedScrollingEnabled(true);
        qm0Var.setAdapter(a());
        s4.d0 d0Var = new s4.d0(1, false);
        this.c = d0Var;
        qm0Var.setLayoutManager(d0Var);
        qm0Var.setClipToPadding(false);
        addView(qm0Var, x5.d(-1.0f, -1));
    }

    public abstract s4.i0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint U0 = i6.U0("paintDivider", this.a);
        if (U0 == null) {
            U0 = i6.k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, U0);
    }

    @Override // rg.l0
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            qm0 qm0Var = this.b;
            if (qm0Var.K(0) == null || qm0Var.K(0).a.getTop() != qm0Var.getPaddingTop()) {
                qm0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.b.setPadding(0, i10, 0, 0);
    }
}
