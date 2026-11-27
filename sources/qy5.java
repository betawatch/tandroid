// default package

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qy5 extends pa9 {
    public final /* synthetic */ Bitmap F;
    public final /* synthetic */ hc8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy5(hc8 hc8Var, Context context, nx7 nx7Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, nx7Var, bitmap, null, null);
        this.G = hc8Var;
        this.F = bitmap2;
    }

    @Override // pa9
    public final void g(v01 v01Var) {
        int indexOf = v01.a.indexOf(v01Var);
        int i = indexOf + 1;
        if (i <= 1 || this.F != null) {
            indexOf = i;
        }
        hc8 hc8Var = this.G;
        hc8Var.d1.b(indexOf);
        hc8Var.s(v01Var);
    }
}
