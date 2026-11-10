package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sw b;

    public /* synthetic */ rw(sw swVar, int i7) {
        this.a = i7;
        this.b = swVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                sw swVar = this.b;
                zw zwVar = swVar.n0;
                Context context = swVar.getContext();
                i7 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                zwVar.showDialog(new ug.i0(3, i7, context, zwVar, null));
                break;
            default:
                zw zwVar2 = this.b.n0;
                xv xvVar = zwVar2.M0;
                if (xvVar != null) {
                    xvVar.dismiss();
                    zwVar2.M0 = null;
                    break;
                }
                break;
        }
    }
}
