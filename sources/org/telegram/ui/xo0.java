package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class xo0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp0 b;

    public xo0(dp0 dp0Var, int i10) {
        this.b = dp0Var;
        this.a = i10;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        dp0 dp0Var = this.b;
        jp0 jp0Var = dp0Var.p0;
        if (i11 != 0) {
            jp0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = jp0Var.f0) != null) {
            fVar.f(i10, i11);
        }
        dp0Var.h();
        if (dp0Var.K != null) {
            if (dp0Var.J == null || !dp0Var.c()) {
                return;
            }
            dp0Var.J.g(false);
            return;
        }
        ai.x9 x9Var = this.a == 1 ? jp0Var.c : jp0Var.b;
        if (x9Var == null || !dp0Var.c()) {
            return;
        }
        x9Var.a();
    }
}
