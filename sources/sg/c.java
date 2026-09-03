package sg;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c implements a {
    public final Paint a = new Paint(1);

    @Override // sg.a
    public final void H(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.drawRect(f10, f11, f12, f13, this.a);
    }

    public final void a(int i10) {
        this.a.setColor(i10);
    }

    @Override // sg.a
    public final pg.b k() {
        return new pg.d(this);
    }

    @Override // sg.a
    public final /* synthetic */ void b() {
    }
}
