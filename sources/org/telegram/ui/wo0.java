package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class wo0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp0 b;

    public wo0(cp0 cp0Var, int i10) {
        this.b = cp0Var;
        this.a = i10;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        cp0 cp0Var = this.b;
        ip0 ip0Var = cp0Var.p0;
        if (i11 != 0) {
            ip0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = ip0Var.f0) != null) {
            fVar.f(i10, i11);
        }
        cp0Var.h();
        if (cp0Var.K != null) {
            if (cp0Var.J == null || !cp0Var.c()) {
                return;
            }
            cp0Var.J.g(false);
            return;
        }
        ai.y9 y9Var = this.a == 1 ? ip0Var.c : ip0Var.b;
        if (y9Var == null || !cp0Var.c()) {
            return;
        }
        y9Var.a();
    }
}
