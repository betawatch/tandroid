package tg;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
