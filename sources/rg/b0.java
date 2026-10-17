package rg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.it0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class b0 extends qg.e1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ it0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(it0 it0Var, Context context, qg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, s0Var, bitmap, null, null);
        this.F = it0Var;
        this.E = bitmap2;
    }

    @Override // qg.e1
    public final void g(qg.m mVar) {
        int indexOf = qg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        it0 it0Var = this.F;
        it0Var.t1.b(indexOf);
        it0Var.o(mVar);
    }
}
