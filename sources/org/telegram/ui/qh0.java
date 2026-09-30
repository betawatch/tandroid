package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class qh0 implements org.telegram.ui.Components.h90 {
    public final /* synthetic */ org.telegram.ui.Components.i90 a;
    public final /* synthetic */ rh0 b;

    public qh0(rh0 rh0Var, org.telegram.ui.Components.i90 i90Var) {
        this.b = rh0Var;
        this.a = i90Var;
    }

    @Override // org.telegram.ui.Components.h90
    public final void e() {
        sh0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.h90
    public final void j() {
        rh0 rh0Var = this.b;
        sh0 sh0Var = rh0Var.d;
        Context context = this.a.getContext();
        sh0 sh0Var2 = rh0Var.d;
        sh0Var.l0 = new org.telegram.ui.Components.e70(context, sh0Var2.e, sh0Var2.d, sh0Var2.k0, sh0Var2, sh0Var2.n, true, sh0Var2.h);
        rh0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.h90
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.h90
    public final /* synthetic */ void k() {
    }
}
