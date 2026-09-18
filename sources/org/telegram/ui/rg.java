package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                bo boVar = (bo) this.b;
                boVar.b9 = true;
                boVar.Z8 = 0;
                boVar.pb = 0;
                boVar.N4 = 0;
                boVar.r9();
                boVar.Nb(false);
                break;
            case 1:
                wo woVar = (wo) this.b;
                woVar.M0 = false;
                woVar.b = null;
                woVar.N0 = false;
                break;
            case 2:
                ((wp) this.b).n = null;
                break;
            default:
                hc0 hc0Var = (hc0) this.b;
                if (hc0Var.h >= 0) {
                    ConnectionsManager.getInstance(hc0Var.b).cancelRequest(hc0Var.h, true);
                    hc0Var.h = -1;
                    break;
                }
                break;
        }
    }
}
