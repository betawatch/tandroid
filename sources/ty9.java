// default package

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ty9 extends yy9 {
    public final /* synthetic */ int n3;
    public final /* synthetic */ vz9 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty9(vz9 vz9Var, Context context, int i) {
        super(vz9Var, context);
        this.o3 = vz9Var;
        this.n3 = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i) {
        vz9 vz9Var = this.o3;
        ny9 ny9Var = vz9Var.g0;
        if (i == 0) {
            vz9Var.y1 = false;
            if (vz9Var.a == -1 || ny9Var.getVisibility() != 0 || ny9Var.getTranslationY() <= (-gm.L(51.0f))) {
                return;
            }
            vz9Var.u(ny9Var.getTranslationY() > ((float) (-gm.L(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i) {
        int i2;
        vz9 vz9Var = this.o3;
        vz9Var.f();
        if (!vz9Var.y1) {
            int H0 = vz9Var.s0.H0();
            ArrayList arrayList = vz9Var.E0;
            SparseIntArray sparseIntArray = vz9Var.x0;
            if (H0 != -1) {
                if (H0 > ((arrayList.size() <= 40 || vz9Var.D0) ? arrayList.size() + (vz9Var.O0 ? 1 : 0) : 40) && H0 > vz9Var.J0.size()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i3);
                        int valueAt = sparseIntArray.valueAt(i3);
                        s14 s14Var = valueAt >= 0 ? (s14) vz9Var.N0.get(valueAt) : null;
                        if (s14Var != null) {
                            boolean z = s14Var.h;
                            ArrayList arrayList2 = s14Var.c;
                            int size = z ? arrayList2.size() : Math.min(24, arrayList2.size());
                            if (H0 > keyAt && H0 <= keyAt + 1 + size) {
                                mz3 mz3Var = vz9Var.e0;
                                mz3Var.j(((mz3Var.E == null || !mz3Var.b0) ? 0 : 1) + (mz3Var.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i3++;
                    }
                } else {
                    vz9Var.e0.j(0, true);
                }
            }
        }
        vz9Var.C();
        gm.T3(vz9Var.f0, vz9Var.i0.computeVerticalScrollOffset() != 0 || (i2 = this.n3) == 0 || i2 == 12 || i2 == 10 || i2 == 1 || i2 == 11 || i2 == 6, 1.0f, true, true);
        vz9Var.l();
    }
}
