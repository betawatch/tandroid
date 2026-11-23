package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class a extends FrameLayout implements n0 {
    public final i6 a;
    public final ek0 b;
    public final v4.c0 c;

    public a(Context context, i6 i6Var) {
        super(context);
        this.a = i6Var;
        ek0 ek0Var = new ek0(context, i6Var);
        this.b = ek0Var;
        ek0Var.setNestedScrollingEnabled(true);
        ek0Var.setAdapter(a());
        v4.c0 c0Var = new v4.c0(1, false);
        this.c = c0Var;
        ek0Var.setLayoutManager(c0Var);
        ek0Var.setClipToPadding(false);
        addView(ek0Var, na.c(-1.0f, -1));
    }

    public abstract v4.i0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint W0 = n6.W0("paintDivider", this.a);
        if (W0 == null) {
            W0 = n6.k0;
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
