// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xr3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yr3 b;

    public /* synthetic */ xr3(yr3 yr3Var, byte b) {
        this.a = b;
        this.b = yr3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yr3 yr3Var = this.b;
        switch (b) {
            case 0:
                try {
                    int i = yr3Var.x + 0;
                    Bitmap bitmap = yr3Var.b;
                    if (bitmap == null || bitmap.getWidth() != yr3Var.y || yr3Var.b.getHeight() != i) {
                        Bitmap bitmap2 = yr3Var.b;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        yr3Var.b = Bitmap.createBitmap(yr3Var.y, i, Bitmap.Config.ARGB_8888);
                        yr3Var.c = new Canvas(yr3Var.b);
                    }
                    yr3Var.b.eraseColor(0);
                    yr3Var.c.save();
                    yr3Var.c.translate(0.0f, 0);
                    yr3Var.c(yr3Var.c);
                    yr3Var.c.restore();
                    yr3Var.b.prepareToDraw();
                } catch (Exception e) {
                    fc4.g(e, true);
                    yr3Var.F = true;
                }
                gm.c3(yr3Var.I);
                break;
            default:
                yr3Var.f = false;
                yr3Var.g();
                if (!yr3Var.a) {
                    yr3Var.j();
                    break;
                } else if (yr3Var.w == yr3Var.K) {
                    yr3Var.H = true;
                    break;
                }
                break;
        }
    }
}
