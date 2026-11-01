package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class vz0 implements wz0 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.cc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.Components.so0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public vz0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.cc ccVar, Context context, org.telegram.ui.Components.so0 so0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = ccVar;
        this.c = context;
        this.d = so0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.wz0
    public final void b() {
        org.telegram.messenger.i0.h3(new tz0(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.wz0
    public final void c() {
        org.telegram.messenger.i0.h3(new hr0(27, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.wz0
    public final void d() {
        this.e.run();
    }
}
