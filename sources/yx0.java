// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yx0 extends View {
    public final Paint a;
    public float b;
    public int c;
    public int d;
    public final RectF e;
    public final ggc f;
    public final int h;
    public int n;
    public int r;

    public yx0(Context context, ggc ggcVar, int i) {
        super(context);
        this.a = new Paint(1);
        this.e = new RectF();
        this.n = -1;
        this.r = -1;
        this.f = ggcVar;
        this.h = i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        gm.L(5.0f);
        int i = this.n;
        Paint paint = this.a;
        if (i >= 0) {
            paint.setColor((cmb.w0(null, i, false) & 16777215) | (-1275068416));
        } else {
            paint.setColor(cmb.B0().o() ? -11184811 : -4473925);
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
                rectF.set(gm.L(11.0f) * i2, 0.0f, gm.L(5.0f) + r5, gm.L(5.0f));
                canvas.drawRoundRect(rectF, gm.L(2.5f), gm.L(2.5f), paint);
            }
            i2++;
        }
        int i4 = this.r;
        if (i4 >= 0) {
            paint.setColor(cmb.w0(null, i4, false));
        } else {
            paint.setColor(-14509328);
        }
        int L = gm.L(11.0f) * this.d;
        if (this.b == 0.0f) {
            rectF.set(L, 0.0f, gm.L(5.0f) + L, gm.L(5.0f));
        } else if (this.c >= this.d) {
            rectF.set(L, 0.0f, (gm.L(11.0f) * this.b) + gm.L(5.0f) + L, gm.L(5.0f));
        } else {
            rectF.set(kt6.B(1.0f, this.b, gm.L(11.0f), L), 0.0f, gm.L(5.0f) + L, gm.L(5.0f));
        }
        canvas.drawRoundRect(rectF, gm.L(2.5f), gm.L(2.5f), paint);
    }

    public void setCurrentPage(int i) {
        this.d = i;
        invalidate();
    }
}
