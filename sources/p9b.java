// default package

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class p9b extends q9b {
    public final /* synthetic */ hh3 g;
    public final /* synthetic */ float h;

    public p9b(hh3 hh3Var, float f) {
        this.g = hh3Var;
        this.h = f;
    }

    @Override // q9b
    public final void a(Canvas canvas, float f) {
        float pow = (float) Math.pow(f, 16.0d);
        hh3 hh3Var = this.g;
        float f2 = this.h;
        hh3Var.c(canvas, f2, f2, pow);
    }

    @Override // q9b
    public final void e() {
        hh3 hh3Var = this.g;
        hh3Var.post(new gh3(hh3Var, (byte) 1));
    }

    @Override // q9b
    public final void f(boolean z) {
        hh3 hh3Var = this.g;
        hh3Var.x = true;
        hh3Var.invalidate();
        if (z) {
            hh3Var.getLocationInWindow(new int[2]);
            LaunchActivity.a0((hh3Var.getWidth() / 2.0f) + r5[0], (hh3Var.getHeight() / 2.0f) + r5[1], 1.0f);
        }
    }
}
