package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ze1 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf1 b;

    public /* synthetic */ ze1(wf1 wf1Var, int i10) {
        this.a = i10;
        this.b = wf1Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        wf1 wf1Var;
        ah.h hVar;
        switch (this.a) {
            case 0:
                wf1 wf1Var2 = this.b;
                int L0 = wf1Var2.F.L0();
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
                    wf1Var2.G0(z10 || !wf1Var2.K, true);
                    break;
                }
                break;
            case 1:
                this.b.y0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar = (wf1Var = this.b).f1) != null) {
                    hVar.f(i10, i11);
                    wf1Var.x0();
                    break;
                }
                break;
        }
    }
}
