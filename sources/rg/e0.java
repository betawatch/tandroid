package rg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class e0 extends qg.c1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ zt0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(zt0 zt0Var, Context context, qg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = zt0Var;
        this.E = bitmap2;
    }

    @Override // qg.c1
    public final void g(qg.m mVar) {
        int indexOf = qg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        zt0 zt0Var = this.F;
        zt0Var.t1.b(indexOf);
        zt0Var.o(mVar);
    }
}
