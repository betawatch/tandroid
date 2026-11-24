// default package

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rd0 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ wd0 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ ip5 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ tnd[] f;

    public /* synthetic */ rd0(wd0 wd0Var, ip5 ip5Var, Runnable[] runnableArr, int i, tnd[] tndVarArr) {
        this.b = wd0Var;
        this.d = ip5Var;
        this.c = runnableArr;
        this.e = i;
        this.f = tndVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wd0 wd0Var = this.b;
                ip5 ip5Var = this.d;
                Runnable[] runnableArr = this.c;
                int i = this.e;
                tnd[] tndVarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = wd0Var.getOrientation();
                    int[] iArr = wd0Var.a;
                    int i2 = ip5Var.a;
                    int i3 = ip5Var.b;
                    Rect d = wd0.d(orientation, i2, i3);
                    Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, d.left, d.top, d.right, d.bottom);
                    gl.c3(new jf((Object) wd0Var, (Object) runnableArr, (Object) createBitmap, (Object) ip5Var, i, (Object) tndVarArr, (byte) 2));
                    return;
                } catch (Throwable th) {
                    gl.c3(new rd0(wd0Var, runnableArr, ip5Var, i, tndVarArr));
                    throw th;
                }
            default:
                this.b.e(this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ rd0(wd0 wd0Var, Runnable[] runnableArr, ip5 ip5Var, int i, tnd[] tndVarArr) {
        this.b = wd0Var;
        this.c = runnableArr;
        this.d = ip5Var;
        this.e = i;
        this.f = tndVarArr;
    }
}
