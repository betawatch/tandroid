package rg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.hu0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class d0 extends qg.c1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ hu0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(hu0 hu0Var, Context context, qg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = hu0Var;
        this.E = bitmap2;
    }

    @Override // qg.c1
    public final void g(qg.m mVar) {
        int indexOf = qg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        hu0 hu0Var = this.F;
        hu0Var.t1.b(indexOf);
        hu0Var.o(mVar);
    }
}
