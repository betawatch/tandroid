package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.wl0;
import w7.y5;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public abstract class b extends FrameLayout implements l0 {
    public final d6 a;
    public final wl0 b;
    public final s4.c0 c;

    public b(Context context, d6 d6Var) {
        super(context);
        this.a = d6Var;
        wl0 wl0Var = new wl0(context, d6Var);
        this.b = wl0Var;
        wl0Var.setNestedScrollingEnabled(true);
        wl0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.c = c0Var;
        wl0Var.setLayoutManager(c0Var);
        wl0Var.setClipToPadding(false);
        addView(wl0Var, y5.c(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = h6.T0("paintDivider", this.a);
        if (T0 == null) {
            T0 = h6.k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override // rg.l0
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            wl0 wl0Var = this.b;
            if (wl0Var.K(0) == null || wl0Var.K(0).a.getTop() != wl0Var.getPaddingTop()) {
                wl0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.b.setPadding(0, i10, 0, 0);
    }
}
