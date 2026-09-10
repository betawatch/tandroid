package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                eo eoVar = (eo) this.b;
                eoVar.b9 = true;
                eoVar.Z8 = 0;
                eoVar.qb = 0;
                eoVar.N4 = 0;
                eoVar.r9();
                eoVar.Nb(false);
                break;
            case 1:
                yo yoVar = (yo) this.b;
                yoVar.M0 = false;
                yoVar.b = null;
                yoVar.N0 = false;
                break;
            case 2:
                ((yp) this.b).n = null;
                break;
            default:
                fc0 fc0Var = (fc0) this.b;
                if (fc0Var.h >= 0) {
                    ConnectionsManager.getInstance(fc0Var.b).cancelRequest(fc0Var.h, true);
                    fc0Var.h = -1;
                    break;
                }
                break;
        }
    }
}
