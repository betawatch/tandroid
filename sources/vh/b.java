package vh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.t00;
import r0.k1;
import r0.m;
import sg.t0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements t00, m {
    public final /* synthetic */ g a;

    public /* synthetic */ b(g gVar) {
        this.a = gVar;
    }

    @Override // r0.m
    public k1 S0(View view, k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        g gVar = this.a;
        gVar.t0(g10);
        gVar.Q1.a(k1Var.a.f(8).d > 0, true);
        return k1.b;
    }

    @Override // org.telegram.ui.Components.t00
    public void a(int i7) {
        int min = Math.min(i7, g0.L(144.0f));
        if (i7 > 0) {
            min -= g0.L(8.0f);
        }
        g gVar = this.a;
        if (gVar.d2 != min) {
            gVar.d2 = min;
            gVar.P1.a(min);
            gVar.Z1.postOnAnimation(new t0(gVar, 27));
        }
    }
}
