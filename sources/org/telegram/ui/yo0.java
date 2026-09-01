package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class yo0 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp0 b;

    public yo0(dp0 dp0Var, int i10) {
        this.b = dp0Var;
        this.a = i10;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        dp0 dp0Var = this.b;
        ip0 ip0Var = dp0Var.g0;
        if (dp0Var.C != null) {
            if (dp0Var.B == null || !dp0Var.c()) {
                return;
            }
            dp0Var.B.g(false);
            return;
        }
        mh.l7 l7Var = this.a == 1 ? ip0Var.c : ip0Var.b;
        if (l7Var == null || !dp0Var.c()) {
            return;
        }
        l7Var.a();
    }
}
