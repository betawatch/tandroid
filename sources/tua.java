// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class tua extends rp2 {
    public final c51 c;
    public final Paint d;
    public final Path e;
    public final long f;
    public float h;

    public tua(c51 c51Var, int i) {
        super(c51Var);
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.e = path;
        this.f = System.currentTimeMillis();
        this.h = 1.0f;
        this.c = c51Var;
        ((Paint) this.b).setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(i);
        path.rewind();
        path.moveTo(-hl.N(2.91f), hl.N(1.08f));
        path.lineTo(0.0f, -hl.N(1.08f));
        path.lineTo(hl.N(2.91f), hl.N(1.08f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = (Paint) this.b;
        paint.setAlpha((int) (this.h * 255.0f));
        canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
        float currentTimeMillis = ((System.currentTimeMillis() - this.f) % 400) / 400.0f;
        Paint paint2 = this.d;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * this.h));
        paint2.setStrokeWidth(hl.N(1.33f));
        canvas.save();
        uh9.n(bp1.e(1.166f, 2.0f, hl.N(2.16f) * 3.0f), 2.0f, getBounds().centerY(), getBounds().centerX(), canvas);
        int i = 0;
        while (i < 4) {
            float f = i == 0 ? 1.0f - currentTimeMillis : i == 3 ? currentTimeMillis : 1.0f;
            paint2.setAlpha((int) (f * 255.0f * this.h));
            canvas.save();
            float R1 = hl.R1(0.5f, 1.0f, f);
            canvas.scale(R1, R1);
            canvas.drawPath(this.e, paint2);
            canvas.restore();
            canvas.translate(0.0f, hl.N(3.3260002f) * f);
            i++;
        }
        canvas.restore();
        paint2.setAlpha(alpha);
        c51 c51Var = this.c;
        if (c51Var != null) {
            c51Var.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return hl.L(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return hl.L(18.0f);
    }

    @Override // rp2, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.h = i / 255.0f;
    }
}
