package qh;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class v9 extends w9 {
    public final /* synthetic */ oh.o g;
    public final /* synthetic */ float h;

    public v9(oh.o oVar, float f10) {
        this.g = oVar;
        this.h = f10;
    }

    @Override // qh.w9
    public final void a(Canvas canvas, float f10) {
        float pow = (float) Math.pow(f10, 16.0d);
        oh.o oVar = this.g;
        float f11 = this.h;
        oVar.c(canvas, f11, f11, pow);
    }

    @Override // qh.w9
    public final void e() {
        oh.o oVar = this.g;
        oVar.post(new oh.n(oVar, 1));
    }

    @Override // qh.w9
    public final void f(boolean z4) {
        oh.o oVar = this.g;
        oVar.w = true;
        oVar.invalidate();
        if (z4) {
            oVar.getLocationInWindow(new int[2]);
            LaunchActivity.b0((oVar.getWidth() / 2.0f) + r6[0], (oVar.getHeight() / 2.0f) + r6[1], 1.0f);
        }
    }
}
