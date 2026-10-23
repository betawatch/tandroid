package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.jm0;
import w7.z5;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public abstract class b extends FrameLayout implements m0 {
    public final d6 a;
    public final jm0 b;
    public final s4.b0 c;

    public b(Context context, d6 d6Var) {
        super(context);
        this.a = d6Var;
        jm0 jm0Var = new jm0(context, d6Var);
        this.b = jm0Var;
        jm0Var.setNestedScrollingEnabled(true);
        jm0Var.setAdapter(a());
        s4.b0 b0Var = new s4.b0(1, false);
        this.c = b0Var;
        jm0Var.setLayoutManager(b0Var);
        jm0Var.setClipToPadding(false);
        addView(jm0Var, z5.c(-1.0f, -1));
    }

    public abstract s4.g0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint U0 = h6.U0("paintDivider", this.a);
        if (U0 == null) {
            U0 = h6.k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, U0);
    }

    @Override // sg.m0
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            jm0 jm0Var = this.b;
            if (jm0Var.K(0) == null || jm0Var.K(0).a.getTop() != jm0Var.getPaddingTop()) {
                jm0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.b.setPadding(0, i10, 0, 0);
    }
}
