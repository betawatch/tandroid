package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yd1 extends f2.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ we1 b;

    public /* synthetic */ yd1(we1 we1Var, int i9) {
        this.a = i9;
        this.b = we1Var;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        boolean z10;
        we1 we1Var;
        ig.e eVar;
        switch (this.a) {
            case 0:
                we1 we1Var2 = this.b;
                int L0 = we1Var2.B.L0();
                if (L0 != -1) {
                    f2.q1 K = recyclerView.K(L0);
                    int top = K != null ? K.a.getTop() : 0;
                    if (L0 == 0) {
                        int i11 = 0 - top;
                        z10 = top < 0;
                        Math.abs(i11);
                    } else {
                        z10 = L0 > 0;
                    }
                    we1Var2.F0(z10 || !we1Var2.G, true);
                    break;
                }
                break;
            case 1:
                this.b.x0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar = (we1Var = this.b).b1) != null) {
                    eVar.f(i9, i10);
                    we1Var.w0();
                    break;
                }
                break;
        }
    }
}
