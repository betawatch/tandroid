package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.zl0;
import w7.z5;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public abstract class b extends FrameLayout implements m0 {
    public final d6 a;
    public final zl0 b;
    public final s4.c0 c;

    public b(Context context, d6 d6Var) {
        super(context);
        this.a = d6Var;
        zl0 zl0Var = new zl0(context, d6Var);
        this.b = zl0Var;
        zl0Var.setNestedScrollingEnabled(true);
        zl0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.c = c0Var;
        zl0Var.setLayoutManager(c0Var);
        zl0Var.setClipToPadding(false);
        addView(zl0Var, z5.c(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = i6.T0("paintDivider", this.a);
        if (T0 == null) {
            T0 = i6.k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override // rg.m0
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            zl0 zl0Var = this.b;
            if (zl0Var.K(0) == null || zl0Var.K(0).a.getTop() != zl0Var.getPaddingTop()) {
                zl0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.b.setPadding(0, i10, 0, 0);
    }
}
