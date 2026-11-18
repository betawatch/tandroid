package ug;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
