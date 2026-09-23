package qg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.tt0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class e0 extends pg.d1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ tt0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(tt0 tt0Var, Context context, pg.r0 r0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, r0Var, bitmap, null, null);
        this.F = tt0Var;
        this.E = bitmap2;
    }

    @Override // pg.d1
    public final void g(pg.m mVar) {
        int indexOf = pg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        tt0 tt0Var = this.F;
        tt0Var.t1.b(indexOf);
        tt0Var.b(mVar);
    }
}
