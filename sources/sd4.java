// default package

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class sd4 extends u55 {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final d79 V;
    public boolean W;
    public boolean X;

    public sd4(int i, t85 t85Var) {
        super(i, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = t85Var;
        this.U = 0;
    }

    public boolean A1() {
        return true;
    }

    @Override // q79
    public final void P() {
        this.Q.clear();
        z1();
    }

    @Override // u55, q79
    public final void U(RecyclerView recyclerView, int i, int i2) {
        super.U(recyclerView, i, i2);
        z1();
    }

    @Override // u55, q79
    public final void V(RecyclerView recyclerView) {
        this.Q.clear();
        z1();
        super.V(recyclerView);
    }

    @Override // u55, q79
    public final void W(RecyclerView recyclerView, int i, int i2) {
        super.W(recyclerView, i, i2);
        z1();
    }

    @Override // u55, q79
    public final void X(RecyclerView recyclerView, int i, int i2) {
        super.X(recyclerView, i, i2);
        z1();
    }

    @Override // q79
    public final void Y() {
        z1();
    }

    @Override // u55, q79
    public final void Z(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.Z(recyclerView, i, i2, obj);
        z1();
    }

    @Override // q79
    public final void c0(oh2 oh2Var, c89 c89Var, int i, int i2) {
        int i3 = this.S;
        this.T = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.S = size;
        if (i3 != size) {
            z1();
        }
        super.c0(oh2Var, c89Var, i, i2);
    }

    @Override // x46, q79
    public final boolean e() {
        return this.X;
    }

    @Override // u55
    public final void v1(int i, View view, boolean z) {
        if (this.V.H(view).b() == A() - 1) {
            ((ViewGroup.MarginLayoutParams) ((r79) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.v1(i, view, z);
    }

    public final void z1() {
        d79 d79Var;
        j79 adapter;
        int i;
        d79 d79Var2;
        if (this.S <= 0 || !A1() || (adapter = (d79Var = this.V).getAdapter()) == null) {
            return;
        }
        int i2 = this.J;
        boolean z = true;
        int b = adapter.b() - 1;
        zo zoVar = this.O;
        boolean z2 = true;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i = this.U;
            if (i3 >= b) {
                d79Var2 = d79Var;
                break;
            }
            int i6 = zoVar.i(i3);
            i4 += i6;
            if (i6 == i2 || i4 > i2) {
                z2 = z;
                i4 = i6;
            }
            if (z2) {
                int d = adapter.d(i3);
                SparseArray sparseArray = this.Q;
                f89 f89Var = (f89) sparseArray.get(d, null);
                if (f89Var == null) {
                    f89Var = adapter.a(d79Var, d);
                    View view = f89Var.a;
                    sparseArray.put(d, f89Var);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(n());
                    }
                }
                View view2 = f89Var.a;
                if (this.W) {
                    adapter.t(f89Var, i3);
                }
                r79 r79Var = (r79) view2.getLayoutParams();
                d79Var2 = d79Var;
                view2.measure(q79.s(d(), this.T, this.k, D() + C() + ((ViewGroup.MarginLayoutParams) r79Var).leftMargin + ((ViewGroup.MarginLayoutParams) r79Var).rightMargin, ((ViewGroup.MarginLayoutParams) r79Var).width), q79.s(this.X, this.S, this.l, B() + E() + ((ViewGroup.MarginLayoutParams) r79Var).topMargin + ((ViewGroup.MarginLayoutParams) r79Var).bottomMargin, ((ViewGroup.MarginLayoutParams) r79Var).height));
                i5 += view2.getMeasuredHeight();
                if (i5 >= (this.S - i) - d79Var2.getPaddingBottom()) {
                    break;
                } else {
                    z2 = false;
                }
            } else {
                d79Var2 = d79Var;
            }
            i3++;
            d79Var = d79Var2;
            z = true;
        }
        this.R = Math.max(0, ((this.S - i5) - i) - d79Var2.getPaddingBottom());
    }

    public sd4(int i, int i2, d79 d79Var) {
        super(i);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = d79Var;
        this.U = i2;
    }
}
