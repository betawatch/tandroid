// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q28 extends k69 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ w28 b;

    /* JADX WARN: Multi-variable type inference failed */
    public q28(w28 w28Var, int i) {
        this.b = w28Var;
        this.a = i;
    }

    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        w28 w28Var = this.b;
        w28Var.h();
        if (w28Var.L != null) {
            if (w28Var.K == null || !w28Var.b()) {
                return;
            }
            w28Var.K.l(false);
            return;
        }
        d38 d38Var = w28Var.q0;
        ava avaVar = this.a ? d38Var.c : d38Var.b;
        if (avaVar == null || !w28Var.b()) {
            return;
        }
        avaVar.a();
    }
}
