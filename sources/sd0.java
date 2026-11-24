// default package

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sd0 implements vd0 {
    public final /* synthetic */ wd0 a;
    public final /* synthetic */ tnd[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ ip5[] d;

    public /* synthetic */ sd0(wd0 wd0Var, tnd[] tndVarArr, Runnable[] runnableArr, ip5[] ip5VarArr) {
        this.a = wd0Var;
        this.b = tndVarArr;
        this.c = runnableArr;
        this.d = ip5VarArr;
    }

    @Override // vd0
    public final void dispose() {
        wd0 wd0Var = this.a;
        tnd[] tndVarArr = this.b;
        Runnable[] runnableArr = this.c;
        ip5[] ip5VarArr = this.d;
        tndVarArr[0] = null;
        if (wd0Var.e.contains(runnableArr)) {
            co3 co3Var = Utilities.e;
            co3Var.getClass();
            for (Runnable runnable : runnableArr) {
                co3Var.a(runnable);
            }
            wd0Var.e.remove(runnableArr);
        }
        for (ip5 ip5Var : ip5VarArr) {
            Bitmap bitmap = (Bitmap) wd0Var.b.remove(ip5Var);
            wd0Var.c.remove(ip5Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
