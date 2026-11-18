package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class a extends FrameLayout implements o0 {
    public final i6 a;
    public final ck0 b;
    public final v4.c0 c;

    public a(Context context, i6 i6Var) {
        super(context);
        this.a = i6Var;
        ck0 ck0Var = new ck0(context, i6Var);
        this.b = ck0Var;
        ck0Var.setNestedScrollingEnabled(true);
        ck0Var.setAdapter(a());
        v4.c0 c0Var = new v4.c0(1, false);
        this.c = c0Var;
        ck0Var.setLayoutManager(c0Var);
        ck0Var.setClipToPadding(false);
        addView(ck0Var, ma.c(-1.0f, -1));
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

    @Override // ug.o0
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            ck0 ck0Var = this.b;
            if (ck0Var.K(0) == null || ck0Var.K(0).a.getTop() != ck0Var.getPaddingTop()) {
                ck0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i7) {
        this.b.setPadding(0, i7, 0, 0);
    }
}
