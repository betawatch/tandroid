package sg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.nt0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d0 extends rg.c1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ nt0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(nt0 nt0Var, Context context, rg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = nt0Var;
        this.E = bitmap2;
    }

    @Override // rg.c1
    public final void g(rg.m mVar) {
        int indexOf = rg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        nt0 nt0Var = this.F;
        nt0Var.i1.b(indexOf);
        nt0Var.i(mVar);
    }
}
