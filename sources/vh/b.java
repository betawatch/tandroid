package vh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.f10;
import r0.l1;
import r0.m;
import v4.p;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements f10, m {
    public final /* synthetic */ g a;

    public /* synthetic */ b(g gVar) {
        this.a = gVar;
    }

    @Override // r0.m
    public l1 P0(View view, l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        g gVar = this.a;
        gVar.t0(g10);
        gVar.U1.a(l1Var.a.f(8).d > 0, true);
        return l1.b;
    }

    @Override // org.telegram.ui.Components.f10
    public void a(int i7) {
        int min = Math.min(i7, g0.L(144.0f));
        if (i7 > 0) {
            min -= g0.L(8.0f);
        }
        g gVar = this.a;
        if (gVar.h2 != min) {
            gVar.h2 = min;
            gVar.T1.a(min);
            gVar.d2.postOnAnimation(new p(gVar, 4));
        }
    }
}
