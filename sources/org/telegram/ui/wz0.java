package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wz0 implements xz0 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.cc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.Components.ro0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public wz0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.cc ccVar, Context context, org.telegram.ui.Components.ro0 ro0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = ccVar;
        this.c = context;
        this.d = ro0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.xz0
    public final void b() {
        org.telegram.messenger.i0.h3(new uz0(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.xz0
    public final void c() {
        org.telegram.messenger.i0.h3(new et0(26, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.xz0
    public final void d() {
        this.e.run();
    }
}
