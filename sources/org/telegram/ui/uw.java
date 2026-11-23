package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vw b;

    public /* synthetic */ uw(vw vwVar, int i7) {
        this.a = i7;
        this.b = vwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                vw vwVar = this.b;
                cx cxVar = vwVar.o0;
                Context context = vwVar.getContext();
                i7 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                cxVar.showDialog(new ug.k0(3, i7, context, cxVar, null));
                break;
            default:
                cx cxVar2 = this.b.o0;
                zv zvVar = cxVar2.N0;
                if (zvVar != null) {
                    zvVar.dismiss();
                    cxVar2.N0 = null;
                    break;
                }
                break;
        }
    }
}
