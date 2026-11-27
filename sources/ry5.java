// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ry5 extends a44 {
    public final Paint h;
    public long n;
    public float r;
    public float s;
    public final /* synthetic */ hc8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry5(hc8 hc8Var, Context context, kj4 kj4Var) {
        super(context, kj4Var);
        this.w = hc8Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        Canvas canvas2;
        super.onDraw(canvas);
        long min = Math.min(16L, System.currentTimeMillis() - this.n);
        this.n = System.currentTimeMillis();
        hc8 hc8Var = this.w;
        h44 h44Var = hc8Var.C0;
        if (h44Var == null || h44Var.r || !h44Var.n) {
            i = 0;
            i2 = 0;
        } else {
            i = h44Var.getStickyX();
            i2 = hc8Var.C0.getStickyY();
        }
        float f = this.r;
        if (i != 0) {
            if (f != 1.0f) {
                this.r = qu6.z(min, 150.0f, f, 1.0f);
                invalidate();
            }
        } else if (f != 0.0f) {
            this.r = bp1.x(min, 150.0f, f, 0.0f);
            invalidate();
        }
        float f2 = this.s;
        if (i2 != 0) {
            if (f2 != 1.0f) {
                this.s = qu6.z(min, 150.0f, f2, 1.0f);
                invalidate();
            }
        } else if (f2 != 0.0f) {
            this.s = bp1.x(min, 150.0f, f2, 0.0f);
            invalidate();
        }
        float f3 = this.s;
        Paint paint = this.h;
        if (f3 != 0.0f) {
            paint.setAlpha((int) (f3 * 255.0f));
            float measuredHeight = getMeasuredHeight() / 2.0f;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, paint);
        } else {
            canvas2 = canvas;
        }
        float f4 = this.r;
        if (f4 != 0.0f) {
            paint.setAlpha((int) (f4 * 255.0f));
            float measuredWidth = getMeasuredWidth() / 2.0f;
            canvas2.drawLine(measuredWidth, 0.0f, measuredWidth, getMeasuredHeight(), paint);
        }
    }
}
