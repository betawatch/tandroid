// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r71 extends View implements vlb {
    public Paint a;
    public Paint b;
    public float c;
    public ln d;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, gm.L(3.0f), gm.L(3.0f), this.b);
        rectF.set(0.0f, 0.0f, this.d.e(false, this.c) * getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, gm.L(3.0f), gm.L(3.0f), this.a);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            Paint paint = this.a;
            int i = cmb.M6;
            paint.setColor(cmb.w0(null, i, false));
            this.b.setColor(cmb.p1(0.2f, cmb.w0(null, i, false)));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
