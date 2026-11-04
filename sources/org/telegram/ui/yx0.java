package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yx0 implements zx0 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.fc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ei.k0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public yx0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.fc fcVar, Context context, ei.k0 k0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = fcVar;
        this.c = context;
        this.d = k0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.zx0
    public final void f() {
        org.telegram.messenger.g0.i3(new wx0(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.zx0
    public final void g() {
        org.telegram.messenger.g0.i3(new qv0(8, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.zx0
    public final void i() {
        this.e.run();
    }
}
