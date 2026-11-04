package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.ui.l4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u1 extends l4 {
    public final Path h;
    public final /* synthetic */ w1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(w1 w1Var, Context context) {
        super(context);
        this.n = w1Var;
        this.h = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.h);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.l4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        Path path = this.h;
        path.reset();
        w1 w1Var = this.n;
        if (w1Var.d) {
            org.telegram.messenger.g0.P.set(0.0f, -w1Var.N, getMeasuredWidth(), getMeasuredHeight());
        } else {
            org.telegram.messenger.g0.P.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + w1Var.N));
        }
        float L = w1Var.N - org.telegram.messenger.g0.L(3.0f);
        path.addRoundRect(org.telegram.messenger.g0.P, L, L, Path.Direction.CW);
    }
}
