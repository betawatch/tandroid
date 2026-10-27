package sg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.pt0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c0 extends rg.c1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ pt0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(pt0 pt0Var, Context context, rg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = pt0Var;
        this.E = bitmap2;
    }

    @Override // rg.c1
    public final void g(rg.m mVar) {
        int indexOf = rg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        pt0 pt0Var = this.F;
        pt0Var.i1.b(indexOf);
        pt0Var.i(mVar);
    }
}
