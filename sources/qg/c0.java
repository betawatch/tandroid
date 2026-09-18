package qg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.au0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class c0 extends pg.e1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ au0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(au0 au0Var, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, s0Var, bitmap, null, null);
        this.F = au0Var;
        this.E = bitmap2;
    }

    @Override // pg.e1
    public final void g(pg.m mVar) {
        int indexOf = pg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        au0 au0Var = this.F;
        au0Var.t1.b(indexOf);
        au0Var.b(mVar);
    }
}
