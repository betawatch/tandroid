package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.vl0;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class b extends FrameLayout implements n0 {
    public final f6 a;
    public final vl0 b;
    public final s4.c0 c;

    public b(Context context, f6 f6Var) {
        super(context);
        this.a = f6Var;
        vl0 vl0Var = new vl0(context, f6Var);
        this.b = vl0Var;
        vl0Var.setNestedScrollingEnabled(true);
        vl0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.c = c0Var;
        vl0Var.setLayoutManager(c0Var);
        vl0Var.setClipToPadding(false);
        addView(vl0Var, a6.c(-1.0f, -1));
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

    @Override // qg.n0
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            vl0 vl0Var = this.b;
            if (vl0Var.K(0) == null || vl0Var.K(0).a.getTop() != vl0Var.getPaddingTop()) {
                vl0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.b.setPadding(0, i10, 0, 0);
    }
}
