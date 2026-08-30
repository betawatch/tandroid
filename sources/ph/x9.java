package ph;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class x9 extends y9 {
    public final /* synthetic */ nh.p g;
    public final /* synthetic */ float h;

    public x9(nh.p pVar, float f10) {
        this.g = pVar;
        this.h = f10;
    }

    @Override // ph.y9
    public final void a(Canvas canvas, float f10) {
        float pow = (float) Math.pow(f10, 16.0d);
        nh.p pVar = this.g;
        float f11 = this.h;
        pVar.c(canvas, f11, f11, pow);
    }

    @Override // ph.y9
    public final void e() {
        nh.p pVar = this.g;
        pVar.post(new nh.o(pVar, 1));
    }

    @Override // ph.y9
    public final void f(boolean z4) {
        nh.p pVar = this.g;
        pVar.w = true;
        pVar.invalidate();
        if (z4) {
            pVar.getLocationInWindow(new int[2]);
            LaunchActivity.b0((pVar.getWidth() / 2.0f) + r6[0], (pVar.getHeight() / 2.0f) + r6[1], 1.0f);
        }
    }
}
