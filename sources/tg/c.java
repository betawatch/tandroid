package tg;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c implements a {
    public final Paint a = new Paint(1);

    @Override // tg.a
    public final void I(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.drawRect(f10, f11, f12, f13, this.a);
    }

    public final void a(int i10) {
        this.a.setColor(i10);
    }

    @Override // tg.a
    public final qg.b k() {
        return new qg.d(this);
    }

    @Override // tg.a
    public final /* synthetic */ void b() {
    }
}
