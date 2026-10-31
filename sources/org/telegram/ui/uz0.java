package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class uz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.video.a b;
    public final /* synthetic */ org.telegram.ui.Components.cc c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.Components.ro0 e;

    public /* synthetic */ uz0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.cc ccVar, Context context, org.telegram.ui.Components.ro0 ro0Var, int i10) {
        this.a = i10;
        this.b = aVar;
        this.c = ccVar;
        this.d = context;
        this.e = ro0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.Components.ro0 ro0Var = this.e;
        Context context = this.d;
        org.telegram.ui.Components.cc ccVar = this.c;
        org.telegram.messenger.video.a aVar = this.b;
        int i11 = 2;
        switch (i10) {
            case 0:
                aVar.run();
                ccVar.c(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131754487, null), -1, 2, new ev(context, i11), ro0Var)).j();
                break;
            case 1:
                aVar.run();
                ccVar.c(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131754487, null), -1, 2, new ev(context, 5), ro0Var)).j();
                break;
            default:
                aVar.run();
                ccVar.c(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131754487, null), -1, 2, new ev(context, 6), ro0Var)).j();
                break;
        }
    }
}
