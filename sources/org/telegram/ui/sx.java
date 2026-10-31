package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                ay ayVar = txVar.n0;
                Context context = txVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                ayVar.showDialog(new kg.q0(3, i10, context, ayVar, null));
                break;
            default:
                ay ayVar2 = this.b.n0;
                zw zwVar = ayVar2.M0;
                if (zwVar != null) {
                    zwVar.dismiss();
                    ayVar2.M0 = null;
                    break;
                }
                break;
        }
    }
}
