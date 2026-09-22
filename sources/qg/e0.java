package qg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.au0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class e0 extends pg.c1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ au0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(au0 au0Var, Context context, pg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = au0Var;
        this.E = bitmap2;
    }

    @Override // pg.c1
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
