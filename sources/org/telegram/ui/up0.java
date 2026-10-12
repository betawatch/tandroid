package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class up0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aq0 b;

    public up0(aq0 aq0Var, int i10) {
        this.b = aq0Var;
        this.a = i10;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        aq0 aq0Var = this.b;
        gq0 gq0Var = aq0Var.p0;
        if (i11 != 0) {
            gq0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = gq0Var.f0) != null) {
            fVar.f(i10, i11);
        }
        aq0Var.h();
        if (aq0Var.K != null) {
            if (aq0Var.J == null || !aq0Var.c()) {
                return;
            }
            aq0Var.J.g(false);
            return;
        }
        zh.f5 f5Var = this.a == 1 ? gq0Var.c : gq0Var.b;
        if (f5Var == null || !aq0Var.c()) {
            return;
        }
        f5Var.a();
    }
}
