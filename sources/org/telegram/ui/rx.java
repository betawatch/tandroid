package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sx b;

    public /* synthetic */ rx(sx sxVar, int i10) {
        this.a = i10;
        this.b = sxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                sx sxVar = this.b;
                zx zxVar = sxVar.n0;
                Context context = sxVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                zxVar.showDialog(new kg.q0(3, i10, context, zxVar, null));
                break;
            default:
                zx zxVar2 = this.b.n0;
                yw ywVar = zxVar2.M0;
                if (ywVar != null) {
                    ywVar.dismiss();
                    zxVar2.M0 = null;
                    break;
                }
                break;
        }
    }
}
