package yh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.i0;
import s4.s0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p extends s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 2:
                y yVar = (y) this.b;
                if (i10 == 0) {
                    yVar.e = !yVar.d.canScrollVertically(-1);
                    yVar.d.canScrollVertically(1);
                    break;
                }
                break;
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                q qVar = (q) obj;
                qVar.w.b(qVar.d);
                break;
            case 1:
                a0 a0Var = (a0) obj;
                if (a0Var.x1.I1) {
                    i0.v1(a0Var.v1.r);
                    break;
                }
                break;
            case 2:
                a0 a0Var2 = ((y) obj).f;
                int i13 = a0.M1;
                a0Var2.b.invalidate();
                break;
            default:
                v vVar = (v) obj;
                vVar.n.D1.b(vVar.d);
                break;
        }
    }
}
