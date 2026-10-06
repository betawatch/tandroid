package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
                yn ynVar = (yn) this.b;
                ynVar.Z8 = true;
                ynVar.X8 = 0;
                ynVar.nb = 0;
                ynVar.L4 = 0;
                ynVar.q9();
                ynVar.Mb(false);
                break;
            case 1:
                to toVar = (to) this.b;
                toVar.M0 = false;
                toVar.b = null;
                toVar.N0 = false;
                break;
            case 2:
                ((tp) this.b).n = null;
                break;
            default:
                dc0 dc0Var = (dc0) this.b;
                if (dc0Var.h >= 0) {
                    ConnectionsManager.getInstance(dc0Var.b).cancelRequest(dc0Var.h, true);
                    dc0Var.h = -1;
                    break;
                }
                break;
        }
    }
}
