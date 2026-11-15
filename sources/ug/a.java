package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class a extends FrameLayout implements m0 {
    public final e6 a;
    public final uj0 b;
    public final v4.b0 c;

    public a(Context context, e6 e6Var) {
        super(context);
        this.a = e6Var;
        uj0 uj0Var = new uj0(context, e6Var);
        this.b = uj0Var;
        uj0Var.setNestedScrollingEnabled(true);
        uj0Var.setAdapter(a());
        v4.b0 b0Var = new v4.b0(1, false);
        this.c = b0Var;
        uj0Var.setLayoutManager(b0Var);
        uj0Var.setClipToPadding(false);
        addView(uj0Var, ja.c(-1.0f, -1));
    }

    public abstract v4.h0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint W0 = j6.W0("paintDivider", this.a);
        if (W0 == null) {
            W0 = j6.k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, W0);
    }

    @Override // ug.m0
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            uj0 uj0Var = this.b;
            if (uj0Var.K(0) == null || uj0Var.K(0).a.getTop() != uj0Var.getPaddingTop()) {
                uj0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i7) {
        this.b.setPadding(0, i7, 0, 0);
    }
}
