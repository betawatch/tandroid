// default package

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class se0 implements ve0 {
    public final /* synthetic */ we0 a;
    public final /* synthetic */ wpd[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ ir5[] d;

    public /* synthetic */ se0(we0 we0Var, wpd[] wpdVarArr, Runnable[] runnableArr, ir5[] ir5VarArr) {
        this.a = we0Var;
        this.b = wpdVarArr;
        this.c = runnableArr;
        this.d = ir5VarArr;
    }

    @Override // ve0
    public final void dispose() {
        we0 we0Var = this.a;
        wpd[] wpdVarArr = this.b;
        Runnable[] runnableArr = this.c;
        ir5[] ir5VarArr = this.d;
        wpdVarArr[0] = null;
        if (we0Var.e.contains(runnableArr)) {
            mp3 mp3Var = Utilities.e;
            mp3Var.getClass();
            for (Runnable runnable : runnableArr) {
                mp3Var.a(runnable);
            }
            we0Var.e.remove(runnableArr);
        }
        for (ir5 ir5Var : ir5VarArr) {
            Bitmap bitmap = (Bitmap) we0Var.b.remove(ir5Var);
            we0Var.c.remove(ir5Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
