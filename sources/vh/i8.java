package vh;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i8 extends j8 {
    public final /* synthetic */ th.l g;
    public final /* synthetic */ float h;

    public i8(th.l lVar, float f7) {
        this.g = lVar;
        this.h = f7;
    }

    @Override // vh.j8
    public final void a(Canvas canvas, float f7) {
        float pow = (float) Math.pow(f7, 16.0d);
        th.l lVar = this.g;
        float f10 = this.h;
        lVar.c(canvas, f10, f10, pow);
    }

    @Override // vh.j8
    public final void e() {
        th.l lVar = this.g;
        lVar.post(new th.k(lVar, 1));
    }

    @Override // vh.j8
    public final void f(boolean z10) {
        th.l lVar = this.g;
        lVar.x = true;
        lVar.invalidate();
        if (z10) {
            lVar.getLocationInWindow(new int[2]);
            LaunchActivity.b0((lVar.getWidth() / 2.0f) + r6[0], (lVar.getHeight() / 2.0f) + r6[1], 1.0f);
        }
    }
}
