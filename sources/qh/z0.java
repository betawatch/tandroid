package qh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d81;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class z0 extends d81 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ x1 c;

    public z0(x1 x1Var, boolean z4, Context context) {
        this.c = x1Var;
        this.a = z4;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.d81
    public final void b(View view, int i10, int i11) {
        i1 i1Var = (i1) view;
        if (this.a) {
            i10 = 1;
        }
        i1Var.a(i10);
    }

    @Override // org.telegram.ui.Components.d81
    public final View d(int i10) {
        Context context = this.b;
        x1 x1Var = this.c;
        return i10 == 1 ? new h1(x1Var, context) : new n1(x1Var, context);
    }

    @Override // org.telegram.ui.Components.d81
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.d81
    public final int h(int i10) {
        return (i10 == 0 || i10 == 1) ? 0 : 1;
    }
}
