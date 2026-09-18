package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class qp0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp0 b;

    public qp0(wp0 wp0Var, int i10) {
        this.b = wp0Var;
        this.a = i10;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        wp0 wp0Var = this.b;
        cq0 cq0Var = wp0Var.p0;
        if (i11 != 0) {
            cq0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (iVar = cq0Var.f0) != null) {
            iVar.f(i10, i11);
        }
        wp0Var.h();
        if (wp0Var.K != null) {
            if (wp0Var.J == null || !wp0Var.c()) {
                return;
            }
            wp0Var.J.g(false);
            return;
        }
        yh.l5 l5Var = this.a == 1 ? cq0Var.c : cq0Var.b;
        if (l5Var == null || !wp0Var.c()) {
            return;
        }
        l5Var.a();
    }
}
