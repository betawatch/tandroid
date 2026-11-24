// default package

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class swb implements j02, ac7, qq7, i59 {
    public final /* synthetic */ sxb a;

    public /* synthetic */ swb(sxb sxbVar) {
        this.a = sxbVar;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        int i = wzcVar.a.f(519).d;
        sxb sxbVar = this.a;
        sxbVar.h1 = i;
        nxb nxbVar = sxbVar.s0;
        if (nxbVar != null) {
            nxbVar.setPadding(0, 0, 0, i);
        }
        uvb uvbVar = sxbVar.n;
        if (uvbVar != null) {
            ((TextView) uvbVar.d).setTranslationY((-sxbVar.h1) - sxbVar.g1);
        }
        sxbVar.h.setTranslationY(((-sxbVar.Y0) - sxbVar.h1) - sxbVar.g1);
        sxbVar.C0();
        return wzc.b;
    }

    @Override // ac7
    public final boolean b(TLRPC.TL_error tL_error) {
        return this.a.K0(tL_error);
    }

    @Override // i59
    public final boolean d(float f, float f2, int i, View view) {
        return this.a.J0(view, f);
    }

    @Override // j02
    public final void e(boolean z, boolean z2) {
        sxb sxbVar = this.a;
        sxbVar.V0.j(sxbVar.S0.b(), z, z2);
    }

    @Override // i59
    public final void i() {
    }

    @Override // i59
    public final void k(float f) {
    }
}
