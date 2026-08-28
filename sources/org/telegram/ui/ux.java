package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ux implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vx b;

    public /* synthetic */ ux(vx vxVar, int i9) {
        this.a = i9;
        this.b = vxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        switch (this.a) {
            case 0:
                vx vxVar = this.b;
                dy dyVar = vxVar.A0;
                Context context = vxVar.getContext();
                i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                dyVar.showDialog(new zf.j0(3, i9, context, dyVar, null));
                break;
            default:
                dy dyVar2 = this.b.A0;
                ax axVar = dyVar2.I0;
                if (axVar != null) {
                    axVar.dismiss();
                    dyVar2.I0 = null;
                    break;
                }
                break;
        }
    }
}
