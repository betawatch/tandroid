package vh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.w00;
import r0.k1;
import r0.m;
import vg.o;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements w00, m {
    public final /* synthetic */ h a;

    public /* synthetic */ b(h hVar) {
        this.a = hVar;
    }

    @Override // r0.m
    public k1 M0(View view, k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        h hVar = this.a;
        hVar.t0(g10);
        hVar.U1.a(k1Var.a.f(8).d > 0, true);
        return k1.b;
    }

    @Override // org.telegram.ui.Components.w00
    public void a(int i7) {
        int min = Math.min(i7, g0.L(144.0f));
        if (i7 > 0) {
            min -= g0.L(8.0f);
        }
        h hVar = this.a;
        if (hVar.h2 != min) {
            hVar.h2 = min;
            hVar.T1.a(min);
            hVar.d2.postOnAnimation(new o(hVar, 1));
        }
    }
}
