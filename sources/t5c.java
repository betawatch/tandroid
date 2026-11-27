// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class t5c extends sd4 {
    public final /* synthetic */ d6c Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5c(d6c d6cVar, int i, s5c s5cVar) {
        super(5, i, s5cVar);
        this.Y = d6cVar;
    }

    @Override // sd4
    public final boolean A1() {
        d6c d6cVar = this.Y;
        return d6cVar.n.getAdapter() == d6cVar.w;
    }

    @Override // x46
    public final boolean X0() {
        return ob6.a0;
    }

    @Override // u55, x46, q79
    public final int n0(int i, oh2 oh2Var, c89 c89Var) {
        int i2;
        View m;
        d6c d6cVar = this.Y;
        if (d6cVar.O) {
            return super.n0(i, oh2Var, c89Var);
        }
        int i3 = 0;
        if (d6cVar.M != null) {
            return 0;
        }
        if (d6cVar.N) {
            while (true) {
                i2 = 1;
                if (i3 >= r()) {
                    break;
                }
                s5c s5cVar = d6cVar.n;
                View q = q(i3);
                s5cVar.getClass();
                int S = RecyclerView.S(q);
                if (S < 1) {
                    i2 = S;
                    break;
                }
                i3++;
            }
            if (i2 == 0 && (m = d6cVar.r.m(i2)) != null && m.getTop() - i > hl.L(58.0f)) {
                i = m.getTop() - hl.L(58.0f);
            }
        }
        return super.n0(i, oh2Var, c89Var);
    }

    @Override // u55, x46, q79
    public final boolean x0() {
        return false;
    }
}
