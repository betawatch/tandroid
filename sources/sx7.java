// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class sx7 extends View implements tjb {
    public Paint a;
    public Paint b;
    public float c;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = (int) (getMeasuredWidth() * this.c);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.b);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.a);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.a.setColor(bkb.w0(null, bkb.Wi, false));
            this.b.setColor(bkb.w0(null, bkb.Xi, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
