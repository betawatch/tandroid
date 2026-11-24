// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pra extends View {
    public final Paint a;
    public final ln b;
    public final ln c;
    public float d;
    public float e;

    public pra(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        c0a c0aVar = new c0a(this, (byte) 28);
        d53 d53Var = d53.h;
        this.b = new ln(c0aVar, 420L, d53Var, 0);
        this.c = new ln(new c0a(this, (byte) 28), 420L, d53Var, 0);
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
        float f = this.e;
        RectF rectF = gm.P;
        rectF.set(width - f, height - f, width + f, height + f);
        int p1 = cmb.p1(0.25f, -1);
        Paint paint = this.a;
        paint.setColor(p1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (d > 0.0f) {
            paint.setColor(cmb.p1(d, -1));
            canvas.drawArc(rectF, 135.0f, e * 270.0f, false, paint);
        }
    }
}
