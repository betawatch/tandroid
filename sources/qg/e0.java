package qg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.cu0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class e0 extends pg.c1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ cu0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(cu0 cu0Var, Context context, pg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = cu0Var;
        this.E = bitmap2;
    }

    @Override // pg.c1
    public final void g(pg.m mVar) {
        int indexOf = pg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        cu0 cu0Var = this.F;
        cu0Var.t1.b(indexOf);
        cu0Var.b(mVar);
    }
}
