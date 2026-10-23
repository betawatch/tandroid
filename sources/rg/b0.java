package rg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.gt0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class b0 extends qg.f1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ gt0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(gt0 gt0Var, Context context, qg.t0 t0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, t0Var, bitmap, null, null);
        this.F = gt0Var;
        this.E = bitmap2;
    }

    @Override // qg.f1
    public final void g(qg.m mVar) {
        int indexOf = qg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        gt0 gt0Var = this.F;
        gt0Var.t1.b(indexOf);
        gt0Var.o(mVar);
    }
}
