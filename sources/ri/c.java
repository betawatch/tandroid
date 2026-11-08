package ri;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
