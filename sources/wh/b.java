package wh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.o00;
import r0.k1;
import r0.m;
import r4.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements o00, m {
    public final /* synthetic */ h a;

    public /* synthetic */ b(h hVar) {
        this.a = hVar;
    }

    @Override // r0.m
    public k1 R0(View view, k1 k1Var) {
        WindowInsets g7 = k1Var.g();
        h hVar = this.a;
        hVar.t0(g7);
        hVar.R1.a(k1Var.a.f(8).d > 0, true);
        return k1.b;
    }

    @Override // org.telegram.ui.Components.o00
    public void a(int i3) {
        int min = Math.min(i3, g0.L(144.0f));
        if (i3 > 0) {
            min -= g0.L(8.0f);
        }
        h hVar = this.a;
        if (hVar.e2 != min) {
            hVar.e2 = min;
            hVar.Q1.a(min);
            hVar.a2.postOnAnimation(new u(hVar, 28));
        }
    }
}
