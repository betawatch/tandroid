// default package

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rw9 extends ww9 {
    public final /* synthetic */ int n3;
    public final /* synthetic */ tx9 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw9(tx9 tx9Var, Context context, int i) {
        super(tx9Var, context);
        this.o3 = tx9Var;
        this.n3 = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i) {
        tx9 tx9Var = this.o3;
        lw9 lw9Var = tx9Var.g0;
        if (i == 0) {
            tx9Var.y1 = false;
            if (tx9Var.a == -1 || lw9Var.getVisibility() != 0 || lw9Var.getTranslationY() <= (-gl.L(51.0f))) {
                return;
            }
            tx9Var.u(lw9Var.getTranslationY() > ((float) (-gl.L(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i) {
        int i2;
        tx9 tx9Var = this.o3;
        tx9Var.f();
        if (!tx9Var.y1) {
            int H0 = tx9Var.s0.H0();
            ArrayList arrayList = tx9Var.E0;
            SparseIntArray sparseIntArray = tx9Var.x0;
            if (H0 != -1) {
                if (H0 > ((arrayList.size() <= 40 || tx9Var.D0) ? arrayList.size() + (tx9Var.O0 ? 1 : 0) : 40) && H0 > tx9Var.J0.size()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i3);
                        int valueAt = sparseIntArray.valueAt(i3);
                        h04 h04Var = valueAt >= 0 ? (h04) tx9Var.N0.get(valueAt) : null;
                        if (h04Var != null) {
                            boolean z = h04Var.h;
                            ArrayList arrayList2 = h04Var.c;
                            int size = z ? arrayList2.size() : Math.min(24, arrayList2.size());
                            if (H0 > keyAt && H0 <= keyAt + 1 + size) {
                                cy3 cy3Var = tx9Var.e0;
                                cy3Var.j(((cy3Var.E == null || !cy3Var.b0) ? 0 : 1) + (cy3Var.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i3++;
                    }
                } else {
                    tx9Var.e0.j(0, true);
                }
            }
        }
        tx9Var.C();
        gl.U3(tx9Var.f0, tx9Var.i0.computeVerticalScrollOffset() != 0 || (i2 = this.n3) == 0 || i2 == 12 || i2 == 10 || i2 == 1 || i2 == 11 || i2 == 6, 1.0f, true, true);
        tx9Var.l();
    }
}
