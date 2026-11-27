// default package

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yw7 extends pa9 {
    public final /* synthetic */ wab F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw7(wab wabVar, Context context, nx7 nx7Var, Bitmap bitmap, Bitmap bitmap2, tl0 tl0Var) {
        super(context, nx7Var, bitmap, bitmap2, tl0Var);
        this.F = wabVar;
    }

    @Override // pa9
    public final void g(v01 v01Var) {
        int indexOf = v01.a.indexOf(v01Var);
        int i = indexOf + 1;
        if (i <= 1) {
            indexOf = i;
        }
        wab wabVar = this.F;
        wabVar.U0.b(indexOf);
        wabVar.s(v01Var);
    }
}
