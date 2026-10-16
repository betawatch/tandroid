package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class n2 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.g6 b;
    public final org.telegram.ui.Components.g6 c;
    public float d;
    public float e;

    public n2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        int i10 = 11;
        zf.c cVar = new zf.c(this, i10);
        es esVar = es.h;
        this.b = new org.telegram.ui.Components.g6(cVar, 420L, esVar, 0);
        this.c = new org.telegram.ui.Components.g6(new zf.c(this, i10), 420L, esVar, 0);
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
        int m12 = org.telegram.ui.ActionBar.g6.m1(0.25f, -1);
        Paint paint = this.a;
        paint.setColor(m12);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.g6.m1(e, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
