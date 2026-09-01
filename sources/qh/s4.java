package qh;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class s4 extends dg.o1 {
    public final /* synthetic */ f9 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(f9 f9Var, Context context, dg.c1 c1Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ba baVar) {
        super(context, c1Var, bitmap, bitmap2, baVar);
        this.B = f9Var;
    }

    @Override // dg.o1
    public final void g(dg.m mVar) {
        int indexOf = dg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        f9 f9Var = this.B;
        f9Var.h1.b(indexOf);
        f9Var.g(mVar);
    }
}
