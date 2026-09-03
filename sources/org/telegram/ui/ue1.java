package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ue1 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sf1 b;

    public /* synthetic */ ue1(sf1 sf1Var, int i10) {
        this.a = i10;
        this.b = sf1Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z4;
        sf1 sf1Var;
        og.e eVar;
        switch (this.a) {
            case 0:
                sf1 sf1Var2 = this.b;
                int L0 = sf1Var2.C.L0();
                if (L0 != -1) {
                    f2.m1 K = recyclerView.K(L0);
                    int top = K != null ? K.a.getTop() : 0;
                    if (L0 == 0) {
                        int i12 = 0 - top;
                        z4 = top < 0;
                        Math.abs(i12);
                    } else {
                        z4 = L0 > 0;
                    }
                    sf1Var2.G0(z4 || !sf1Var2.H, true);
                    break;
                }
                break;
            case 1:
                this.b.y0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar = (sf1Var = this.b).c1) != null) {
                    eVar.f(i10, i11);
                    sf1Var.x0();
                    break;
                }
                break;
        }
    }
}
