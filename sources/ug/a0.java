package ug;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.lp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a0 extends tg.u0 {
    public final /* synthetic */ Bitmap F;
    public final /* synthetic */ lp0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(lp0 lp0Var, Context context, tg.i0 i0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, i0Var, bitmap, null, null);
        this.G = lp0Var;
        this.F = bitmap2;
    }

    @Override // tg.u0
    public final void g(tg.h hVar) {
        int indexOf = tg.h.a.indexOf(hVar);
        int i3 = indexOf + 1;
        if (i3 <= 1 || this.F != null) {
            indexOf = i3;
        }
        lp0 lp0Var = this.G;
        lp0Var.d1.b(indexOf);
        lp0Var.C(hVar);
    }
}
