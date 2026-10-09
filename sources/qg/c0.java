package qg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.bu0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class c0 extends pg.e1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ bu0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(bu0 bu0Var, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, s0Var, bitmap, null, null);
        this.F = bu0Var;
        this.E = bitmap2;
    }

    @Override // pg.e1
    public final void g(pg.m mVar) {
        int indexOf = pg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        bu0 bu0Var = this.F;
        bu0Var.t1.b(indexOf);
        bu0Var.b(mVar);
    }
}
