package rg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
