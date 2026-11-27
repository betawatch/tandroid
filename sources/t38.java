// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class t38 extends v79 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ a48 b;

    /* JADX WARN: Multi-variable type inference failed */
    public t38(a48 a48Var, int i) {
        this.b = a48Var;
        this.a = i;
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        a48 a48Var = this.b;
        a48Var.h();
        if (a48Var.L != null) {
            if (a48Var.K == null || !a48Var.b()) {
                return;
            }
            a48Var.K.o(false);
            return;
        }
        h48 h48Var = a48Var.q0;
        axa axaVar = this.a ? h48Var.c : h48Var.b;
        if (axaVar == null || !a48Var.b()) {
            return;
        }
        axaVar.a();
    }
}
