package org.telegram.ui;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;

    public /* synthetic */ vb(pc pcVar, int i3) {
        this.a = i3;
        this.b = pcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        pc pcVar = this.b;
        switch (i3) {
            case 0:
                pc.Z(pcVar);
                break;
            default:
                org.telegram.messenger.k5.o(null, 2131752260, org.telegram.ui.Components.fc.a0(pcVar), R.raw.done, 36);
                break;
        }
    }
}
