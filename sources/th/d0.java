package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import org.telegram.messenger.zs;
import rh.s8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d0 extends LinearLayout {
    public s8 a;
    public final Path b;
    public final Paint c;
    public long d;
    public final org.telegram.ui.Components.t5 e;
    public final /* synthetic */ g0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, Context context) {
        super(context);
        this.f = g0Var;
        this.b = new Path();
        this.c = new Paint(1);
        this.d = 0L;
        this.e = new org.telegram.ui.Components.t5(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.b;
        path.rewind();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        g0 g0Var = this.f;
        i0 i0Var = g0Var.f;
        if (i0Var != null) {
            int b10 = o.b(i0Var.a, i0Var.b(), 3);
            i0 i0Var2 = g0Var.f;
            int b11 = o.b(i0Var2.a, i0Var2.b(), 5);
            canvas.drawColor(b10);
            long j10 = this.d;
            i0 i0Var3 = g0Var.f;
            long j11 = i0Var3.b;
            org.telegram.ui.Components.t5 t5Var = this.e;
            if (j10 != j11) {
                t5Var.e(true, i0Var3.a());
            }
            float e = t5Var.e(false, g0Var.f.a());
            this.d = g0Var.f.b;
            Paint paint = this.c;
            paint.setColor(b11);
            paint.setAlpha(zs.L1);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * e, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.a == null) {
            this.a = new s8(1, zs.Z3);
        }
        this.a.f(0, 0, getWidth(), getHeight());
        s8 s8Var = this.a;
        s8Var.h = 30.0f;
        s8Var.d();
        this.a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
