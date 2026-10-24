package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class zo0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fp0 b;

    public zo0(fp0 fp0Var, int i10) {
        this.b = fp0Var;
        this.a = i10;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        fp0 fp0Var = this.b;
        lp0 lp0Var = fp0Var.p0;
        if (i11 != 0) {
            lp0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = lp0Var.f0) != null) {
            fVar.f(i10, i11);
        }
        fp0Var.h();
        if (fp0Var.K != null) {
            if (fp0Var.J == null || !fp0Var.c()) {
                return;
            }
            fp0Var.J.g(false);
            return;
        }
        ai.y9 y9Var = this.a == 1 ? lp0Var.c : lp0Var.b;
        if (y9Var == null || !fp0Var.c()) {
            return;
        }
        y9Var.a();
    }
}
