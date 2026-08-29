package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx b;

    public /* synthetic */ wx(xx xxVar, int i10) {
        this.a = i10;
        this.b = xxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                xx xxVar = this.b;
                fy fyVar = xxVar.A0;
                Context context = xxVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                fyVar.showDialog(new cg.v0(3, i10, context, fyVar, null));
                break;
            default:
                fy fyVar2 = this.b.A0;
                cx cxVar = fyVar2.I0;
                if (cxVar != null) {
                    cxVar.dismiss();
                    fyVar2.I0 = null;
                    break;
                }
                break;
        }
    }
}
