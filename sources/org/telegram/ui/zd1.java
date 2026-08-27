package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zd1 extends f2.b1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ we1 b;

    public /* synthetic */ zd1(we1 we1Var, int i10) {
        this.a = i10;
        this.b = we1Var;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        we1 we1Var;
        jg.e eVar;
        switch (this.a) {
            case 0:
                we1 we1Var2 = this.b;
                int L0 = we1Var2.B.L0();
                if (L0 != -1) {
                    f2.o1 K = recyclerView.K(L0);
                    int top = K != null ? K.a.getTop() : 0;
                    if (L0 == 0) {
                        int i12 = 0 - top;
                        z10 = top < 0;
                        Math.abs(i12);
                    } else {
                        z10 = L0 > 0;
                    }
                    we1Var2.G0(z10 || !we1Var2.G, true);
                    break;
                }
                break;
            case 1:
                this.b.y0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar = (we1Var = this.b).b1) != null) {
                    eVar.f(i10, i11);
                    we1Var.x0();
                    break;
                }
                break;
        }
    }
}
