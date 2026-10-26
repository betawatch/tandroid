package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tx b;

    public /* synthetic */ sx(tx txVar, int i10) {
        this.a = i10;
        this.b = txVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                tx txVar = this.b;
                cy cyVar = txVar.t0;
                Context context = txVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                cyVar.showDialog(new tg.j0(3, i10, context, cyVar, null));
                break;
            default:
                cy cyVar2 = this.b.t0;
                vw vwVar = cyVar2.M0;
                if (vwVar != null) {
                    vwVar.dismiss();
                    cyVar2.M0 = null;
                    break;
                }
                break;
        }
    }
}
