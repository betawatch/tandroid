package ug;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class s0 extends v4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;

    public /* synthetic */ s0(x0 x0Var, int i7) {
        this.a = i7;
        this.b = x0Var;
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                x0 x0Var = this.b;
                x0Var.b.invalidate();
                x0Var.I0();
                break;
            default:
                x0 x0Var2 = this.b;
                x0Var2.b.invalidate();
                x0Var2.I0();
                break;
        }
    }
}
