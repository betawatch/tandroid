// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qw0 extends View {
    public final Paint a;
    public float b;
    public int c;
    public int d;
    public final RectF e;
    public final gec f;
    public final int h;
    public int n;
    public int r;

    public qw0(Context context, gec gecVar, int i) {
        super(context);
        this.a = new Paint(1);
        this.e = new RectF();
        this.n = -1;
        this.r = -1;
        this.f = gecVar;
        this.h = i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        gl.L(5.0f);
        int i = this.n;
        Paint paint = this.a;
        if (i >= 0) {
            paint.setColor((bkb.w0(null, i, false) & 16777215) | (-1275068416));
        } else {
            paint.setColor(bkb.B0().o() ? -11184811 : -4473925);
        }
        this.d = this.f.getCurrentItem();
        int i2 = 0;
        while (true) {
            int i3 = this.h;
            rectF = this.e;
            if (i2 >= i3) {
                break;
            }
            if (i2 != this.d) {
                rectF.set(gl.L(11.0f) * i2, 0.0f, gl.L(5.0f) + r5, gl.L(5.0f));
                canvas.drawRoundRect(rectF, gl.L(2.5f), gl.L(2.5f), paint);
            }
            i2++;
        }
        int i4 = this.r;
        if (i4 >= 0) {
            paint.setColor(bkb.w0(null, i4, false));
        } else {
            paint.setColor(-14509328);
        }
        int L = gl.L(11.0f) * this.d;
        if (this.b == 0.0f) {
            rectF.set(L, 0.0f, gl.L(5.0f) + L, gl.L(5.0f));
        } else if (this.c >= this.d) {
            rectF.set(L, 0.0f, (gl.L(11.0f) * this.b) + gl.L(5.0f) + L, gl.L(5.0f));
        } else {
            rectF.set(ls6.B(1.0f, this.b, gl.L(11.0f), L), 0.0f, gl.L(5.0f) + L, gl.L(5.0f));
        }
        canvas.drawRoundRect(rectF, gl.L(2.5f), gl.L(2.5f), paint);
    }

    public void setCurrentPage(int i) {
        this.d = i;
        invalidate();
    }
}
