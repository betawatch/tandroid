// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class uz8 extends i49 {
    public final /* synthetic */ t26 a;
    public final /* synthetic */ a09 b;

    public uz8(a09 a09Var, t26 t26Var) {
        this.b = a09Var;
        this.a = t26Var;
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int loadCount;
        a09 a09Var = this.b;
        if (a09Var.x && a09Var.y && !a09Var.w) {
            int M0 = this.a.M0();
            int b = a09Var.f.b() - 1;
            loadCount = a09Var.getLoadCount();
            if (M0 >= b - loadCount) {
                a09Var.c();
            }
        }
    }
}
