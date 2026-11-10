package vh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.s00;
import r0.k1;
import r0.m;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements s00, m {
    public final /* synthetic */ g a;

    public /* synthetic */ b(g gVar) {
        this.a = gVar;
    }

    @Override // r0.m
    public k1 S0(View view, k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        g gVar = this.a;
        gVar.t0(g10);
        gVar.T1.a(k1Var.a.f(8).d > 0, true);
        return k1.b;
    }

    @Override // org.telegram.ui.Components.s00
    public void a(int i7) {
        int min = Math.min(i7, g0.L(144.0f));
        if (i7 > 0) {
            min -= g0.L(8.0f);
        }
        g gVar = this.a;
        if (gVar.g2 != min) {
            gVar.g2 = min;
            gVar.S1.a(min);
            gVar.c2.postOnAnimation(new sh.b(gVar, 25));
        }
    }
}
