package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        int i10 = 2;
        m2 m2Var = new m2(this, i10);
        pr prVar = pr.h;
        this.b = new org.telegram.ui.Components.e6(m2Var, 420L, prVar, 0);
        this.c = new org.telegram.ui.Components.e6(new m2(this, i10), 420L, prVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float d = this.b.d(this.d, false);
        float e7 = this.c.e(this.d > 0.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f7 = this.e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f7, height - f7, width + f7, height + f7);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.25f, -1);
        Paint paint = this.a;
        paint.setColor(l1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e7 > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(e7, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
