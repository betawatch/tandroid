package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.video.a b;
    public final /* synthetic */ org.telegram.ui.Components.cc c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.Components.so0 e;

    public /* synthetic */ tz0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.cc ccVar, Context context, org.telegram.ui.Components.so0 so0Var, int i10) {
        this.a = i10;
        this.b = aVar;
        this.c = ccVar;
        this.d = context;
        this.e = so0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.Components.so0 so0Var = this.e;
        Context context = this.d;
        org.telegram.ui.Components.cc ccVar = this.c;
        org.telegram.messenger.video.a aVar = this.b;
        int i11 = 2;
        switch (i10) {
            case 0:
                aVar.run();
                ccVar.c(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131754487, null), -1, 2, new dv(context, i11), so0Var)).j();
                break;
            case 1:
                aVar.run();
                ccVar.c(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131754487, null), -1, 2, new dv(context, 5), so0Var)).j();
                break;
            default:
                aVar.run();
                ccVar.c(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131754487, null), -1, 2, new dv(context, 6), so0Var)).j();
                break;
        }
    }
}
