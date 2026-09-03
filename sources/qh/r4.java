package qh;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class r4 extends dg.o1 {
    public final /* synthetic */ e9 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(e9 e9Var, Context context, dg.c1 c1Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ba baVar) {
        super(context, c1Var, bitmap, bitmap2, baVar);
        this.B = e9Var;
    }

    @Override // dg.o1
    public final void g(dg.m mVar) {
        int indexOf = dg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        e9 e9Var = this.B;
        e9Var.h1.b(indexOf);
        e9Var.g(mVar);
    }
}
