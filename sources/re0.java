// default package

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class re0 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ we0 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ ir5 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ wpd[] f;

    public /* synthetic */ re0(we0 we0Var, ir5 ir5Var, Runnable[] runnableArr, int i, wpd[] wpdVarArr) {
        this.b = we0Var;
        this.d = ir5Var;
        this.c = runnableArr;
        this.e = i;
        this.f = wpdVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                we0 we0Var = this.b;
                ir5 ir5Var = this.d;
                Runnable[] runnableArr = this.c;
                int i = this.e;
                wpd[] wpdVarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = we0Var.getOrientation();
                    int[] iArr = we0Var.a;
                    int i2 = ir5Var.a;
                    int i3 = ir5Var.b;
                    Rect d = we0.d(orientation, i2, i3);
                    Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, d.left, d.top, d.right, d.bottom);
                    gm.c3(new jg((Object) we0Var, (Object) runnableArr, (Object) createBitmap, (Object) ir5Var, i, (Object) wpdVarArr, (byte) 2));
                    return;
                } catch (Throwable th) {
                    gm.c3(new re0(we0Var, runnableArr, ir5Var, i, wpdVarArr));
                    throw th;
                }
            default:
                this.b.e(this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ re0(we0 we0Var, Runnable[] runnableArr, ir5 ir5Var, int i, wpd[] wpdVarArr) {
        this.b = we0Var;
        this.c = runnableArr;
        this.d = ir5Var;
        this.e = i;
        this.f = wpdVarArr;
    }
}
