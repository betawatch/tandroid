package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.ui.j4;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class r1 extends j4 {
    public final Path h;
    public final /* synthetic */ t1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(t1 t1Var, Context context) {
        super(context);
        this.n = t1Var;
        this.h = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.h);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.j4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Path path = this.h;
        path.reset();
        t1 t1Var = this.n;
        if (t1Var.d) {
            org.telegram.messenger.g0.P.set(0.0f, -t1Var.M, getMeasuredWidth(), getMeasuredHeight());
        } else {
            org.telegram.messenger.g0.P.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + t1Var.M));
        }
        float L = t1Var.M - org.telegram.messenger.g0.L(3.0f);
        path.addRoundRect(org.telegram.messenger.g0.P, L, L, Path.Direction.CW);
    }
}
