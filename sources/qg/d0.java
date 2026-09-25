package qg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.st0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class d0 extends pg.f1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ st0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(st0 st0Var, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, s0Var, bitmap, null, null);
        this.F = st0Var;
        this.E = bitmap2;
    }

    @Override // pg.f1
    public final void g(pg.m mVar) {
        int indexOf = pg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        st0 st0Var = this.F;
        st0Var.t1.b(indexOf);
        st0Var.b(mVar);
    }
}
