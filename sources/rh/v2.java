package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v2 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.t5 b;
    public final org.telegram.ui.Components.t5 c;
    public float d;
    public float e;

    public v2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        ph.x1 x1Var = new ph.x1(this, 19);
        gr grVar = gr.h;
        this.b = new org.telegram.ui.Components.t5(x1Var, 420L, grVar, 0);
        this.c = new org.telegram.ui.Components.t5(new ph.x1(this, 19), 420L, grVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float e = this.b.e(false, this.d);
        float d = this.c.d(this.d > 0.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f7 = this.e;
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(width - f7, height - f7, width + f7, height + f7);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.25f, -1);
        Paint paint = this.a;
        paint.setColor(r12);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (d > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(d, -1));
            canvas.drawArc(rectF, 135.0f, e * 270.0f, false, paint);
        }
    }
}
