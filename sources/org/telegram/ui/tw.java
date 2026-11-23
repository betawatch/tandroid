package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw b;

    public /* synthetic */ tw(uw uwVar, int i7) {
        this.a = i7;
        this.b = uwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                uw uwVar = this.b;
                bx bxVar = uwVar.o0;
                Context context = uwVar.getContext();
                i7 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                bxVar.showDialog(new ug.k0(3, i7, context, bxVar, null));
                break;
            default:
                bx bxVar2 = this.b.o0;
                yv yvVar = bxVar2.N0;
                if (yvVar != null) {
                    yvVar.dismiss();
                    bxVar2.N0 = null;
                    break;
                }
                break;
        }
    }
}
