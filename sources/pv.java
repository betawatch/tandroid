// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pv extends View {
    public final RectF a;

    public pv(Activity activity) {
        super(activity);
        this.a = new RectF();
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 3;
        float L = gm.L(10.0f);
        RectF rectF = this.a;
        rectF.set(measuredWidth, gm.L(8.0f), measuredWidth << 1, L);
        canvas.drawRoundRect(rectF, gm.L(1.0f), gm.L(1.0f), o.t1);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(18.0f));
    }
}
