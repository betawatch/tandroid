package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ta1 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb1 b;

    public /* synthetic */ ta1(pb1 pb1Var, int i10) {
        this.a = i10;
        this.b = pb1Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        pb1 pb1Var;
        tg.f fVar;
        switch (this.a) {
            case 0:
                pb1 pb1Var2 = this.b;
                int L0 = pb1Var2.F.L0();
                if (L0 != -1) {
                    s4.c1 K = recyclerView.K(L0);
                    int top = K != null ? K.a.getTop() : 0;
                    if (L0 == 0) {
                        int i12 = 0 - top;
                        z10 = top < 0;
                        Math.abs(i12);
                    } else {
                        z10 = L0 > 0;
                    }
                    pb1Var2.J0(z10 || !pb1Var2.K, true);
                    break;
                }
                break;
            case 1:
                this.b.B0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (pb1Var = this.b).g1) != null) {
                    fVar.f(i10, i11);
                    pb1Var.A0();
                    break;
                }
                break;
        }
    }
}
