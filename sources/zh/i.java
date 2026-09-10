package zh;

import android.view.ViewGroup;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.nx;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class i extends ng.b {
    public final boolean d;
    public final /* synthetic */ nx e;

    public i(nx nxVar, boolean z10) {
        this.e = nxVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        boolean z10 = this.d;
        nx nxVar = this.e;
        return (z10 ? nxVar.y : nxVar.x).size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        k kVar = (k) c1Var.a;
        kVar.b = i10;
        boolean z10 = this.d;
        nx nxVar = this.e;
        if (z10) {
            kVar.setDialogId(((j) nxVar.y.get(i10)).c);
        } else {
            kVar.setDialogId(((j) nxVar.x.get(i10)).c);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        k kVar = new k(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        kVar.N = z10;
        if (z10) {
            kVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new fl0(kVar);
    }
}
