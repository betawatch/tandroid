package ug;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class u0 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ u0(z0 z0Var, int i7) {
        this.a = i7;
        this.b = z0Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                z0 z0Var = this.b;
                z0Var.b.invalidate();
                z0Var.J0();
                break;
            default:
                z0 z0Var2 = this.b;
                z0Var2.b.invalidate();
                z0Var2.J0();
                break;
        }
    }
}
