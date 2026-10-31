package vh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.o71;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y0 extends o71 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ u1 c;

    public y0(u1 u1Var, boolean z10, Context context) {
        this.c = u1Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.o71
    public final void b(View view, int i10, int i11) {
        h1 h1Var = (h1) view;
        if (this.a) {
            i10 = 1;
        }
        h1Var.a(i10);
    }

    @Override // org.telegram.ui.Components.o71
    public final View d(int i10) {
        Context context = this.b;
        u1 u1Var = this.c;
        return i10 == 1 ? new g1(u1Var, context) : new l1(u1Var, context);
    }

    @Override // org.telegram.ui.Components.o71
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.o71
    public final int h(int i10) {
        return (i10 == 0 || i10 == 1) ? 0 : 1;
    }
}
