package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z5 extends FrameLayout {
    public final Paint a;
    public final org.telegram.ui.Components.t5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c;
    public final /* synthetic */ c6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(c6 c6Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.d = c6Var;
        this.c = p6Var;
        this.a = new Paint(1);
        this.b = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.c);
        Paint paint = this.a;
        paint.setColor(w02);
        c6 c6Var = this.d;
        float max = Math.max(0.0f, c6Var.I0());
        boolean z10 = max < ((float) org.telegram.messenger.i0.m);
        org.telegram.ui.Components.t5 t5Var = this.b;
        float T1 = org.telegram.messenger.i0.T1(max, 0.0f, t5Var.d(z10));
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(c6Var.t0, T1, getWidth() - c6Var.t0, org.telegram.messenger.i0.L(14.0f) + getHeight());
        float L = (1.0f - t5Var.c) * org.telegram.messenger.i0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        c6Var.n1.setTranslationY(Math.max(org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.m, org.telegram.messenger.i0.L(14.0f) + T1));
        canvas.save();
        canvas.clipRect(c6Var.t0, org.telegram.messenger.i0.L(14.0f) + org.telegram.messenger.i0.m, getWidth() - c6Var.t0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y3 = motionEvent.getY();
        c6 c6Var = this.d;
        if (y3 >= c6Var.I0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        c6Var.dismiss();
        return true;
    }
}
