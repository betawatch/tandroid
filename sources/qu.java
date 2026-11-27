// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.o;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qu extends View {
    public final RectF a;

    public qu(Activity activity) {
        super(activity);
        this.a = new RectF();
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 3;
        float L = hl.L(10.0f);
        RectF rectF = this.a;
        rectF.set(measuredWidth, hl.L(8.0f), measuredWidth << 1, L);
        canvas.drawRoundRect(rectF, hl.L(1.0f), hl.L(1.0f), o.t1);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(18.0f));
    }
}
