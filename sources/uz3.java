// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class uz3 extends r35 {
    public final /* synthetic */ t14 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz3(t14 t14Var) {
        super(8);
        this.Q = t14Var;
    }

    @Override // d49
    public final void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        try {
            gv3 gv3Var = new gv3((byte) 2, recyclerView.getContext(), this);
            gv3Var.a = i;
            v0(gv3Var);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
