// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yi9 extends qi9 {
    public final Paint X;

    public yi9(uj9 uj9Var, Rect rect, int i) {
        super(uj9Var, rect, i);
        this.X = new Paint(1);
    }

    @Override // qi9
    public final int H() {
        Rect rect = this.b;
        return gm.L(12.0f) + rect.top + rect.bottom;
    }

    @Override // qi9
    public final int J() {
        return gm.L(32.0f);
    }

    @Override // qi9
    public final void V(Canvas canvas) {
        uj9 uj9Var = this.a;
        int i = uj9Var.C;
        int i2 = uj9Var.S;
        int i3 = i + i2 + uj9Var.T;
        Rect rect = this.b;
        int i4 = rect.left;
        int i5 = ((i3 - i4) - rect.right) / 2;
        float f = (((r1 - i5) / 2.0f) - i2) + i4;
        float L = (gm.L(12.0f) - gm.L(1.0f)) / 2.0f;
        int v0 = cmb.v0(uj9Var.D() ? cmb.ml : cmb.ll, uj9Var.D);
        Paint paint = this.X;
        paint.setColor(v0);
        RectF rectF = gm.P;
        rectF.set(f, L, i5 + f, gm.L(1.0f) + L);
        canvas.drawRoundRect(rectF, gm.L(0.5f), gm.L(0.5f), paint);
    }
}
