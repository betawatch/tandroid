package rg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.jt0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class c0 extends qg.e1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ jt0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(jt0 jt0Var, Context context, qg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, s0Var, bitmap, null, null);
        this.F = jt0Var;
        this.E = bitmap2;
    }

    @Override // qg.e1
    public final void g(qg.m mVar) {
        int indexOf = qg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        jt0 jt0Var = this.F;
        jt0Var.t1.b(indexOf);
        jt0Var.n(mVar);
    }
}
