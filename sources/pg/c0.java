package pg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c0 extends og.h1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ zt0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(zt0 zt0Var, Context context, og.v0 v0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, v0Var, bitmap, null, null);
        this.F = zt0Var;
        this.E = bitmap2;
    }

    @Override // og.h1
    public final void g(og.m mVar) {
        int indexOf = og.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        zt0 zt0Var = this.F;
        zt0Var.t1.b(indexOf);
        zt0Var.B(mVar);
    }
}
