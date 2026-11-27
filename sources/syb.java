// default package

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class syb implements oz1, gc7, nr7, u69 {
    public final /* synthetic */ tzb a;

    public /* synthetic */ syb(tzb tzbVar) {
        this.a = tzbVar;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        int i = l2dVar.a.f(519).d;
        tzb tzbVar = this.a;
        tzbVar.h1 = i;
        ozb ozbVar = tzbVar.s0;
        if (ozbVar != null) {
            ozbVar.setPadding(0, 0, 0, i);
        }
        uxb uxbVar = tzbVar.n;
        if (uxbVar != null) {
            ((TextView) uxbVar.d).setTranslationY((-tzbVar.h1) - tzbVar.g1);
        }
        tzbVar.h.setTranslationY(((-tzbVar.Y0) - tzbVar.h1) - tzbVar.g1);
        tzbVar.C0();
        return l2d.b;
    }

    @Override // gc7
    public final boolean b(TLRPC.TL_error tL_error) {
        return this.a.K0(tL_error);
    }

    @Override // u69
    public final boolean d(float f, float f2, int i, View view) {
        return this.a.J0(view, f);
    }

    @Override // oz1
    public final void g(boolean z, boolean z2) {
        tzb tzbVar = this.a;
        tzbVar.V0.j(tzbVar.S0.b(), z, z2);
    }

    @Override // u69
    public final void f() {
    }

    @Override // u69
    public final void h(float f) {
    }
}
