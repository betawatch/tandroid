package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ml0;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class b extends FrameLayout implements l0 {
    public final f6 a;
    public final ml0 b;
    public final s4.c0 c;

    public b(Context context, f6 f6Var) {
        super(context);
        this.a = f6Var;
        ml0 ml0Var = new ml0(context, f6Var);
        this.b = ml0Var;
        ml0Var.setNestedScrollingEnabled(true);
        ml0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.c = c0Var;
        ml0Var.setLayoutManager(c0Var);
        ml0Var.setClipToPadding(false);
        addView(ml0Var, x5.c(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = j6.T0("paintDivider", this.a);
        if (T0 == null) {
            T0 = j6.k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override // rg.l0
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            ml0 ml0Var = this.b;
            if (ml0Var.L(0) == null || ml0Var.L(0).a.getTop() != ml0Var.getPaddingTop()) {
                ml0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.b.setPadding(0, i10, 0, 0);
    }
}
