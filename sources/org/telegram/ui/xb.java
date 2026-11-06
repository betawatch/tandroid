package org.telegram.ui;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc b;

    public /* synthetic */ xb(rc rcVar, int i7) {
        this.a = i7;
        this.b = rcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        rc rcVar = this.b;
        switch (i7) {
            case 0:
                rc.Z(rcVar);
                break;
            default:
                org.telegram.messenger.k5.o(null, 2131752260, org.telegram.ui.Components.hc.a0(rcVar), R.raw.done, 36);
                break;
        }
    }
}
