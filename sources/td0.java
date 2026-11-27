// default package

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class td0 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ yd0 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ lr5 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ksd[] f;

    public /* synthetic */ td0(yd0 yd0Var, lr5 lr5Var, Runnable[] runnableArr, int i, ksd[] ksdVarArr) {
        this.b = yd0Var;
        this.d = lr5Var;
        this.c = runnableArr;
        this.e = i;
        this.f = ksdVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yd0 yd0Var = this.b;
                lr5 lr5Var = this.d;
                Runnable[] runnableArr = this.c;
                int i = this.e;
                ksd[] ksdVarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = yd0Var.getOrientation();
                    int[] iArr = yd0Var.a;
                    int i2 = lr5Var.a;
                    int i3 = lr5Var.b;
                    Rect d = yd0.d(orientation, i2, i3);
                    Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, d.left, d.top, d.right, d.bottom);
                    hl.c3(new te((Object) yd0Var, (Object) runnableArr, (Object) createBitmap, (Object) lr5Var, i, (Object) ksdVarArr, (byte) 2));
                    return;
                } catch (Throwable th) {
                    hl.c3(new td0(yd0Var, runnableArr, lr5Var, i, ksdVarArr));
                    throw th;
                }
            default:
                this.b.e(this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ td0(yd0 yd0Var, Runnable[] runnableArr, lr5 lr5Var, int i, ksd[] ksdVarArr) {
        this.b = yd0Var;
        this.c = runnableArr;
        this.d = lr5Var;
        this.e = i;
        this.f = ksdVarArr;
    }
}
