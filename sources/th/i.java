package th;

import android.view.ViewGroup;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i extends hg.c {
    public final boolean d;
    public final /* synthetic */ uw e;

    public i(uw uwVar, boolean z10) {
        this.e = uwVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.g0
    public final int b() {
        boolean z10 = this.d;
        uw uwVar = this.e;
        return (z10 ? uwVar.D : uwVar.y).size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        l lVar = (l) c1Var.a;
        lVar.b = i10;
        boolean z10 = this.d;
        uw uwVar = this.e;
        if (z10) {
            lVar.setDialogId(((j) uwVar.D.get(i10)).c);
        } else {
            lVar.setDialogId(((j) uwVar.y.get(i10)).c);
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
        return new ck0(lVar);
    }
}
