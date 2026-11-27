// default package

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ud0 implements xd0 {
    public final /* synthetic */ yd0 a;
    public final /* synthetic */ ksd[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ lr5[] d;

    public /* synthetic */ ud0(yd0 yd0Var, ksd[] ksdVarArr, Runnable[] runnableArr, lr5[] lr5VarArr) {
        this.a = yd0Var;
        this.b = ksdVarArr;
        this.c = runnableArr;
        this.d = lr5VarArr;
    }

    @Override // xd0
    public final void dispose() {
        yd0 yd0Var = this.a;
        ksd[] ksdVarArr = this.b;
        Runnable[] runnableArr = this.c;
        lr5[] lr5VarArr = this.d;
        ksdVarArr[0] = null;
        if (yd0Var.e.contains(runnableArr)) {
            to3 to3Var = Utilities.e;
            to3Var.getClass();
            for (Runnable runnable : runnableArr) {
                to3Var.a(runnable);
            }
            yd0Var.e.remove(runnableArr);
        }
        for (lr5 lr5Var : lr5VarArr) {
            Bitmap bitmap = (Bitmap) yd0Var.b.remove(lr5Var);
            yd0Var.c.remove(lr5Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
