package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx b;

    public /* synthetic */ xx(yx yxVar, int i10) {
        this.a = i10;
        this.b = yxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                yx yxVar = this.b;
                gy gyVar = yxVar.A0;
                Context context = yxVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                gyVar.showDialog(new ag.i1(3, i10, context, gyVar, null));
                break;
            default:
                gy gyVar2 = this.b.A0;
                dx dxVar = gyVar2.I0;
                if (dxVar != null) {
                    dxVar.dismiss();
                    gyVar2.I0 = null;
                    break;
                }
                break;
        }
    }
}
