// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class rf3 extends ka {
    public final boolean d;
    public final /* synthetic */ oh3 e;

    public rf3(oh3 oh3Var, boolean z) {
        this.e = oh3Var;
        this.d = z;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override // w39
    public final int b() {
        boolean z = this.d;
        oh3 oh3Var = this.e;
        return (z ? oh3Var.E : oh3Var.y).size();
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        uf3 uf3Var = (uf3) s49Var.a;
        uf3Var.b = i;
        boolean z = this.d;
        oh3 oh3Var = this.e;
        if (z) {
            uf3Var.setDialogId(((sf3) oh3Var.E.get(i)).c);
        } else {
            uf3Var.setDialogId(((sf3) oh3Var.y.get(i)).c);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        uf3 uf3Var = new uf3(this.e, viewGroup.getContext());
        boolean z = this.d;
        uf3Var.O = z;
        if (z) {
            uf3Var.d(1.0f, 1.0f, 0.0f, false);
        }
        return new y29(uf3Var);
    }
}
