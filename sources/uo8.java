// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class uo8 extends Drawable {
    public final gn a;
    public final Paint b;
    public int c;
    public float d;
    public float e;
    public final bj1 f;
    public uk1 g;

    public uo8(String str) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.d = 1.0f;
        this.e = 1.0f;
        this.f = new bj1(this);
        gn gnVar = new gn(false, false, false);
        this.a = gnVar;
        gnVar.setCallback(new in(this, (byte) 7));
        gnVar.t(str, true, true);
        gnVar.w(gl.L(11.0f));
        gnVar.b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i) {
        Paint paint = this.b;
        if (paint.getColor() != i) {
            paint.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.d * this.e;
        if (f <= 0.0f) {
            return;
        }
        RectF rectF = gl.P;
        rectF.set(getBounds());
        canvas.save();
        float a = this.f.a(0.1f);
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        Paint paint = this.b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f));
        canvas.drawRoundRect(rectF, gl.L(20.0f), gl.L(20.0f), paint);
        paint.setAlpha(alpha);
        int i = this.c;
        gn gnVar = this.a;
        gnVar.u(i);
        gnVar.C = (int) (f * 255.0f);
        gnVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        gnVar.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return (int) (this.d * 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return gl.L(17.33f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (this.a.d + gl.L(11.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d = i / 255.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
