// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class s61 extends View implements snb {
    public Paint a;
    public Paint b;
    public float c;
    public mm d;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, hl.L(3.0f), hl.L(3.0f), this.b);
        rectF.set(0.0f, 0.0f, this.d.e(false, this.c) * getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, hl.L(3.0f), hl.L(3.0f), this.a);
    }

    @Override // snb
    public final void updateColors() {
        try {
            Paint paint = this.a;
            int i = aob.N6;
            paint.setColor(aob.w0(null, i, false));
            this.b.setColor(aob.p1(0.2f, aob.w0(null, i, false)));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
