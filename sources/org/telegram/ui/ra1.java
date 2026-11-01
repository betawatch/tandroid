package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ra1 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb1 b;

    public /* synthetic */ ra1(nb1 nb1Var, int i10) {
        this.a = i10;
        this.b = nb1Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        nb1 nb1Var;
        tg.f fVar;
        switch (this.a) {
            case 0:
                nb1 nb1Var2 = this.b;
                int L0 = nb1Var2.F.L0();
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
                    nb1Var2.K0(z10 || !nb1Var2.K, true);
                    break;
                }
                break;
            case 1:
                this.b.C0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (nb1Var = this.b).g1) != null) {
                    fVar.f(i10, i11);
                    nb1Var.B0();
                    break;
                }
                break;
        }
    }
}
