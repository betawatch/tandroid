package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class b extends FrameLayout implements l0 {
    public final u6 a;
    public final nm0 b;
    public final s4.c0 c;

    public b(Context context, u6 u6Var) {
        super(context);
        this.a = u6Var;
        nm0 nm0Var = new nm0(context, u6Var);
        this.b = nm0Var;
        nm0Var.setNestedScrollingEnabled(true);
        nm0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.c = c0Var;
        nm0Var.setLayoutManager(c0Var);
        nm0Var.setClipToPadding(false);
        addView(nm0Var, kb1.g(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint V0 = y6.V0("paintDivider", this.a);
        if (V0 == null) {
            V0 = y6.k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, V0);
    }

    @Override // tg.l0
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            nm0 nm0Var = this.b;
            if (nm0Var.K(0) == null || nm0Var.K(0).a.getTop() != nm0Var.getPaddingTop()) {
                nm0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.b.setPadding(0, i10, 0, 0);
    }
}
