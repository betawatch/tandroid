package ri;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class c implements a {
    public final Paint a = new Paint(1);
    public int b;

    public final void a(int i7) {
        if (this.b != i7) {
            this.b = i7;
            this.a.setColor(i7);
        }
    }

    @Override // ri.a
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.drawRect(f10, f11, f12, f13, this.a);
    }
}
