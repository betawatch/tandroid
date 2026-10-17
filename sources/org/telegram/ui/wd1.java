package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class wd1 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ te1 b;

    public /* synthetic */ wd1(te1 te1Var, int i10) {
        this.a = i10;
        this.b = te1Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        te1 te1Var;
        bh.f fVar;
        switch (this.a) {
            case 0:
                te1 te1Var2 = this.b;
                int L0 = te1Var2.F.L0();
                if (L0 != -1) {
                    s4.b1 K = recyclerView.K(L0);
                    int top = K != null ? K.a.getTop() : 0;
                    if (L0 == 0) {
                        int i12 = 0 - top;
                        z10 = top < 0;
                        Math.abs(i12);
                    } else {
                        z10 = L0 > 0;
                    }
                    te1Var2.G0(z10 || !te1Var2.K, true);
                    break;
                }
                break;
            case 1:
                this.b.y0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (te1Var = this.b).f1) != null) {
                    fVar.f(i10, i11);
                    te1Var.x0();
                    break;
                }
                break;
        }
    }
}
