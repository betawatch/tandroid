// default package

import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wc5 extends TextView {
    public boolean a;

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth(), getHeight() - 1, bkb.j0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(48.0f) + 1);
    }

    public void setNeedDivider(boolean z) {
        this.a = z;
    }
}
