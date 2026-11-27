// default package

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class yw7 extends pa9 {
    public final /* synthetic */ vab F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw7(vab vabVar, Context context, nx7 nx7Var, Bitmap bitmap, Bitmap bitmap2, tl0 tl0Var) {
        super(context, nx7Var, bitmap, bitmap2, tl0Var);
        this.F = vabVar;
    }

    @Override // pa9
    public final void g(v01 v01Var) {
        int indexOf = v01.a.indexOf(v01Var);
        int i = indexOf + 1;
        if (i <= 1) {
            indexOf = i;
        }
        vab vabVar = this.F;
        vabVar.U0.b(indexOf);
        vabVar.s(v01Var);
    }
}
