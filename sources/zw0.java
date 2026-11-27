// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zw0 extends View {
    public final Paint a;
    public float b;
    public int c;
    public int d;
    public final RectF e;
    public final fic f;
    public final int h;
    public int n;
    public int r;

    public zw0(Context context, fic ficVar, int i) {
        super(context);
        this.a = new Paint(1);
        this.e = new RectF();
        this.n = -1;
        this.r = -1;
        this.f = ficVar;
        this.h = i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        hl.L(5.0f);
        int i = this.n;
        Paint paint = this.a;
        if (i >= 0) {
            paint.setColor((aob.w0(null, i, false) & 16777215) | (-1275068416));
        } else {
            paint.setColor(aob.B0().o() ? -11184811 : -4473925);
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
                rectF.set(hl.L(11.0f) * i2, 0.0f, hl.L(5.0f) + r5, hl.L(5.0f));
                canvas.drawRoundRect(rectF, hl.L(2.5f), hl.L(2.5f), paint);
            }
            i2++;
        }
        int i4 = this.r;
        if (i4 >= 0) {
            paint.setColor(aob.w0(null, i4, false));
        } else {
            paint.setColor(-14509328);
        }
        int L = hl.L(11.0f) * this.d;
        if (this.b == 0.0f) {
            rectF.set(L, 0.0f, hl.L(5.0f) + L, hl.L(5.0f));
        } else if (this.c >= this.d) {
            rectF.set(L, 0.0f, (hl.L(11.0f) * this.b) + hl.L(5.0f) + L, hl.L(5.0f));
        } else {
            rectF.set(qu6.B(1.0f, this.b, hl.L(11.0f), L), 0.0f, hl.L(5.0f) + L, hl.L(5.0f));
        }
        canvas.drawRoundRect(rectF, hl.L(2.5f), hl.L(2.5f), paint);
    }

    public void setCurrentPage(int i) {
        this.d = i;
        invalidate();
    }
}
