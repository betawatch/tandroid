package qg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.au0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class d0 extends pg.f1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ au0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(au0 au0Var, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, s0Var, bitmap, null, null);
        this.F = au0Var;
        this.E = bitmap2;
    }

    @Override // pg.f1
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
