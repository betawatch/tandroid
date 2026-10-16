package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class sp0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yp0 b;

    public sp0(yp0 yp0Var, int i10) {
        this.b = yp0Var;
        this.a = i10;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        yp0 yp0Var = this.b;
        eq0 eq0Var = yp0Var.p0;
        if (i11 != 0) {
            eq0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = eq0Var.f0) != null) {
            fVar.f(i10, i11);
        }
        yp0Var.h();
        if (yp0Var.K != null) {
            if (yp0Var.J == null || !yp0Var.c()) {
                return;
            }
            yp0Var.J.g(false);
            return;
        }
        zh.f5 f5Var = this.a == 1 ? eq0Var.c : eq0Var.b;
        if (f5Var == null || !yp0Var.c()) {
            return;
        }
        f5Var.a();
    }
}
