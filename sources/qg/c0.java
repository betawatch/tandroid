package qg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.vt0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class c0 extends pg.f1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ vt0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(vt0 vt0Var, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, s0Var, bitmap, null, null);
        this.F = vt0Var;
        this.E = bitmap2;
    }

    @Override // pg.f1
    public final void g(pg.m mVar) {
        int indexOf = pg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        vt0 vt0Var = this.F;
        vt0Var.t1.b(indexOf);
        vt0Var.b(mVar);
    }
}
