package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.video.a b;
    public final /* synthetic */ org.telegram.ui.Components.fc c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ ei.k0 e;

    public /* synthetic */ wx0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.fc fcVar, Context context, ei.k0 k0Var, int i3) {
        this.a = i3;
        this.b = aVar;
        this.c = fcVar;
        this.d = context;
        this.e = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        ei.k0 k0Var = this.e;
        Context context = this.d;
        org.telegram.ui.Components.fc fcVar = this.c;
        org.telegram.messenger.video.a aVar = this.b;
        int i10 = 2;
        switch (i3) {
            case 0:
                aVar.run();
                fcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new zt(context, i10), k0Var)).j();
                break;
            case 1:
                aVar.run();
                fcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new zt(context, 5), k0Var)).j();
                break;
            default:
                aVar.run();
                fcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new zt(context, 6), k0Var)).j();
                break;
        }
    }
}
