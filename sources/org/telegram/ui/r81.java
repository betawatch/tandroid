package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r81 extends u4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m91 b;

    public /* synthetic */ r81(m91 m91Var, int i3) {
        this.a = i3;
        this.b = m91Var;
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        boolean z10;
        m91 m91Var;
        eh.g gVar;
        switch (this.a) {
            case 0:
                m91 m91Var2 = this.b;
                int L0 = m91Var2.G.L0();
                if (L0 != -1) {
                    u4.d1 K = recyclerView.K(L0);
                    int top = K != null ? K.a.getTop() : 0;
                    if (L0 == 0) {
                        int i11 = 0 - top;
                        z10 = top < 0;
                        Math.abs(i11);
                    } else {
                        z10 = L0 > 0;
                    }
                    m91Var2.K0(z10 || !m91Var2.L, true);
                    break;
                }
                break;
            case 1:
                this.b.C0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (gVar = (m91Var = this.b).h1) != null) {
                    gVar.f(i3, i10);
                    m91Var.B0();
                    break;
                }
                break;
        }
    }
}
