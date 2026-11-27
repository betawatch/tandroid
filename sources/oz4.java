// default package

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class oz4 implements mz4 {
    public final Paint a = new Paint(1);
    public int b;

    public final void a(int i) {
        if (this.b != i) {
            this.b = i;
            this.a.setColor(i);
        }
    }

    @Override // mz4
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        canvas.drawRect(f, f2, f3, f4, this.a);
    }
}
