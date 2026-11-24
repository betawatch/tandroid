// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sl7 extends View implements tjb {
    public final Paint a;
    public final Paint b;
    public final lm c;
    public final gn d;
    public int e;
    public float f;
    public ValueAnimator h;

    public sl7(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        s33 s33Var = s33.h;
        this.c = new lm(this, 0L, 320L, s33Var);
        gn gnVar = new gn(false, true, true);
        this.d = gnVar;
        this.f = 1.0f;
        paint.setColor(bkb.w0(null, bkb.Ei, false));
        paint2.setColor(bkb.w0(null, bkb.g5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(gl.L(4.0f));
        gnVar.setCallback(this);
        gnVar.n(0.35f, 200L, s33Var);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = gnVar.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(gl.L(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        gnVar.w(gl.L(13.3f));
        gnVar.u(bkb.w0(null, bkb.Ii, false));
        gnVar.N = gl.L(64.0f);
        gnVar.b = 1;
    }

    public final boolean a(int i) {
        int i2 = this.e;
        if (i2 != i) {
            r1 = i2 < i;
            this.e = i;
            this.d.t(i > 0 ? String.valueOf(i) : "", true, true);
            if (r1) {
                ValueAnimator valueAnimator = this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.h = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.h = ofFloat;
                ofFloat.addUpdateListener(new ni4(this, (byte) 25));
                this.h.addListener(new v85(this, (byte) 19));
                b00.n(2.0f, this.h);
                this.h.setDuration(200L);
                this.h.start();
            }
        }
        return r1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float e = this.c.e(false, this.e > 0 ? 1.0f : 0.0f);
        canvas.save();
        float f = this.f;
        canvas.scale(f * e, f * e, getWidth() / 2.0f, getHeight() / 2.0f);
        gn gnVar = this.d;
        float N = gl.N(12.66f) + gnVar.c();
        float N2 = gl.N(20.3f);
        RectF rectF = gl.P;
        rectF.set((getWidth() - N) / 2.0f, (getHeight() - N2) / 2.0f, (getWidth() + N) / 2.0f, (getHeight() + N2) / 2.0f);
        int i = (int) (e * 255.0f);
        Paint paint = this.b;
        paint.setAlpha(i);
        canvas.drawRoundRect(rectF, gl.L(30.0f), gl.L(30.0f), paint);
        Paint paint2 = this.a;
        paint2.setAlpha(i);
        canvas.drawRoundRect(rectF, gl.L(30.0f), gl.L(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -gl.L(1.0f));
        gnVar.setBounds(0, 0, getWidth(), getHeight());
        gnVar.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.a.setColor(bkb.w0(null, bkb.Ei, false));
            this.b.setColor(bkb.w0(null, bkb.g5, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
