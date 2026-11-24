// default package

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rub implements wy1, z97, no7, f39 {
    public final /* synthetic */ qvb a;

    public /* synthetic */ rub(qvb qvbVar) {
        this.a = qvbVar;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        int i = vxcVar.a.f(519).d;
        qvb qvbVar = this.a;
        qvbVar.h1 = i;
        mvb mvbVar = qvbVar.s0;
        if (mvbVar != null) {
            mvbVar.setPadding(0, 0, 0, i);
        }
        ttb ttbVar = qvbVar.n;
        if (ttbVar != null) {
            ((TextView) ttbVar.d).setTranslationY((-qvbVar.h1) - qvbVar.g1);
        }
        qvbVar.h.setTranslationY(((-qvbVar.Y0) - qvbVar.h1) - qvbVar.g1);
        qvbVar.B0();
        return vxc.b;
    }

    @Override // z97
    public final boolean b(TLRPC.TL_error tL_error) {
        return this.a.J0(tL_error);
    }

    @Override // f39
    public final boolean e(float f, float f2, int i, View view) {
        return this.a.I0(view, f);
    }

    @Override // wy1
    public final void h(boolean z, boolean z2) {
        qvb qvbVar = this.a;
        qvbVar.V0.j(qvbVar.S0.b(), z, z2);
    }

    @Override // f39
    public final void f() {
    }

    @Override // f39
    public final void g(float f) {
    }
}
