package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ll0;
import w7.x5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class b extends FrameLayout implements m0 {
    public final f6 a;
    public final ll0 b;
    public final s4.c0 c;

    public b(Context context, f6 f6Var) {
        super(context);
        this.a = f6Var;
        ll0 ll0Var = new ll0(context, f6Var);
        this.b = ll0Var;
        ll0Var.setNestedScrollingEnabled(true);
        ll0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.c = c0Var;
        ll0Var.setLayoutManager(c0Var);
        ll0Var.setClipToPadding(false);
        addView(ll0Var, x5.c(-1.0f, -1));
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

    @Override // sg.m0
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            ll0 ll0Var = this.b;
            if (ll0Var.K(0) == null || ll0Var.K(0).a.getTop() != ll0Var.getPaddingTop()) {
                ll0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.b.setPadding(0, i10, 0, 0);
    }
}
