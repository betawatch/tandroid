package qg;

import android.graphics.Canvas;
import android.graphics.Paint;
import ng.f;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c implements a {
    public final Paint a = new Paint(1);

    @Override // qg.a
    public final void E0(Canvas canvas, float f9, float f10, float f11, float f12) {
        canvas.drawRect(f9, f10, f11, f12, this.a);
    }

    public final void a(int i10) {
        this.a.setColor(i10);
    }

    @Override // qg.a
    public final ng.d v() {
        return new f(this);
    }

    @Override // qg.a
    public final /* synthetic */ void q() {
    }
}
