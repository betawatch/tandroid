package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class yn implements org.telegram.ui.Components.p70 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ go b;

    public yn(go goVar, Context context) {
        this.b = goVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.p70
    public final void e() {
        this.b.d0(true);
    }

    @Override // org.telegram.ui.Components.p70
    public final void f() {
        go goVar = this.b;
        org.telegram.ui.Components.m50 m50Var = new org.telegram.ui.Components.m50(this.a, goVar.l0, goVar.Y, goVar.o0, goVar, goVar.Z, true, org.telegram.messenger.t3.T(goVar.X));
        go goVar2 = this.b;
        goVar2.p0 = m50Var;
        goVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.p70
    public final /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.p70
    public final /* synthetic */ void k() {
    }
}
