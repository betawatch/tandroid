package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class s2 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.e6 b;
    public final org.telegram.ui.Components.e6 c;
    public float d;
    public float e;

    public s2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        int i10 = 0;
        r2 r2Var = new r2(this, i10);
        rr rrVar = rr.h;
        this.b = new org.telegram.ui.Components.e6(r2Var, 420L, rrVar, 0);
        this.c = new org.telegram.ui.Components.e6(new r2(this, i10), 420L, rrVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float d = this.b.d(this.d, false);
        float e = this.c.e(this.d > 0.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f7 = this.e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f7, height - f7, width + f7, height + f7);
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.25f, -1);
        Paint paint = this.a;
        paint.setColor(l1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.h6.l1(e, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
