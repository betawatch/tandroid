package th;

import android.view.ViewGroup;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.tw;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class i extends hg.c {
    public final boolean d;
    public final /* synthetic */ tw e;

    public i(tw twVar, boolean z10) {
        this.e = twVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.g0
    public final int b() {
        boolean z10 = this.d;
        tw twVar = this.e;
        return (z10 ? twVar.D : twVar.y).size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        l lVar = (l) c1Var.a;
        lVar.b = i10;
        boolean z10 = this.d;
        tw twVar = this.e;
        if (z10) {
            lVar.setDialogId(((j) twVar.D.get(i10)).c);
        } else {
            lVar.setDialogId(((j) twVar.y.get(i10)).c);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        l lVar = new l(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        lVar.N = z10;
        if (z10) {
            lVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new dk0(lVar);
    }
}
