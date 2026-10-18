package rg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.it0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class b0 extends qg.e1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ it0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(it0 it0Var, Context context, qg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, s0Var, bitmap, null, null);
        this.F = it0Var;
        this.E = bitmap2;
    }

    @Override // qg.e1
    public final void g(qg.m mVar) {
        int indexOf = qg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        it0 it0Var = this.F;
        it0Var.t1.b(indexOf);
        it0Var.o(mVar);
    }
}
