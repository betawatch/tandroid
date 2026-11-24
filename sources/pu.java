// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pu extends View {
    public final RectF a;

    public pu(Activity activity) {
        super(activity);
        this.a = new RectF();
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 3;
        float L = gl.L(10.0f);
        RectF rectF = this.a;
        rectF.set(measuredWidth, gl.L(8.0f), measuredWidth << 1, L);
        canvas.drawRoundRect(rectF, gl.L(1.0f), gl.L(1.0f), o.t1);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(18.0f));
    }
}
