package rg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.gu0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class d0 extends qg.c1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ gu0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(gu0 gu0Var, Context context, qg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = gu0Var;
        this.E = bitmap2;
    }

    @Override // qg.c1
    public final void g(qg.m mVar) {
        int indexOf = qg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        gu0 gu0Var = this.F;
        gu0Var.t1.b(indexOf);
        gu0Var.o(mVar);
    }
}
