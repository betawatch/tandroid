package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mm0;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class b extends FrameLayout implements l0 {
    public final c6 a;
    public final mm0 b;
    public final s4.b0 c;

    public b(Context context, c6 c6Var) {
        super(context);
        this.a = c6Var;
        mm0 mm0Var = new mm0(context, c6Var);
        this.b = mm0Var;
        mm0Var.setNestedScrollingEnabled(true);
        mm0Var.setAdapter(a());
        s4.b0 b0Var = new s4.b0(1, false);
        this.c = b0Var;
        mm0Var.setLayoutManager(b0Var);
        mm0Var.setClipToPadding(false);
        addView(mm0Var, z5.d(-1.0f, -1));
    }

    public abstract s4.g0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint U0 = g6.U0("paintDivider", this.a);
        if (U0 == null) {
            U0 = g6.k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, U0);
    }

    @Override // sg.l0
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            mm0 mm0Var = this.b;
            if (mm0Var.K(0) == null || mm0Var.K(0).a.getTop() != mm0Var.getPaddingTop()) {
                mm0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.b.setPadding(0, i10, 0, 0);
    }
}
