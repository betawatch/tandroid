package ph;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class s4 extends cg.p1 {
    public final /* synthetic */ h9 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(h9 h9Var, Context context, cg.d1 d1Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ba baVar) {
        super(context, d1Var, bitmap, bitmap2, baVar);
        this.B = h9Var;
    }

    @Override // cg.p1
    public final void g(cg.m mVar) {
        int indexOf = cg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        h9 h9Var = this.B;
        h9Var.h1.b(indexOf);
        h9Var.x(mVar);
    }
}
