// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w19 extends k69 {
    public final /* synthetic */ u46 a;
    public final /* synthetic */ c29 b;

    public w19(c29 c29Var, u46 u46Var) {
        this.b = c29Var;
        this.a = u46Var;
    }

    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int loadCount;
        c29 c29Var = this.b;
        if (c29Var.x && c29Var.y && !c29Var.w) {
            int M0 = this.a.M0();
            int b = c29Var.f.b() - 1;
            loadCount = c29Var.getLoadCount();
            if (M0 >= b - loadCount) {
                c29Var.c();
            }
        }
    }
}
