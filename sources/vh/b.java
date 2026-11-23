package vh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.d10;
import r0.l1;
import r0.m;
import ug.u1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements d10, m {
    public final /* synthetic */ g a;

    public /* synthetic */ b(g gVar) {
        this.a = gVar;
    }

    @Override // org.telegram.ui.Components.d10
    public void a(int i7) {
        int min = Math.min(i7, g0.L(144.0f));
        if (i7 > 0) {
            min -= g0.L(8.0f);
        }
        g gVar = this.a;
        if (gVar.h2 != min) {
            gVar.h2 = min;
            gVar.T1.a(min);
            gVar.d2.postOnAnimation(new u1(gVar, 5));
        }
    }

    @Override // r0.m
    public l1 l1(View view, l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        g gVar = this.a;
        gVar.t0(g10);
        gVar.U1.a(l1Var.a.f(8).d > 0, true);
        return l1.b;
    }
}
