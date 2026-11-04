package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class a extends FrameLayout implements k0 {
    public final e6 a;
    public final tj0 b;
    public final u4.b0 c;

    public a(Context context, e6 e6Var) {
        super(context);
        this.a = e6Var;
        tj0 tj0Var = new tj0(context, e6Var);
        this.b = tj0Var;
        tj0Var.setNestedScrollingEnabled(true);
        tj0Var.setAdapter(a());
        u4.b0 b0Var = new u4.b0(1, false);
        this.c = b0Var;
        tj0Var.setLayoutManager(b0Var);
        tj0Var.setClipToPadding(false);
        addView(tj0Var, mf.c(-1.0f, -1));
    }

    public abstract u4.h0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint W0 = k6.W0("paintDivider", this.a);
        if (W0 == null) {
            W0 = k6.k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, W0);
    }

    @Override // vg.k0
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            tj0 tj0Var = this.b;
            if (tj0Var.K(0) == null || tj0Var.K(0).a.getTop() != tj0Var.getPaddingTop()) {
                tj0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i3) {
        this.b.setPadding(0, i3, 0, 0);
    }
}
