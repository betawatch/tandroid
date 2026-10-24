package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wx b;

    public /* synthetic */ vx(wx wxVar, int i10) {
        this.a = i10;
        this.b = wxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                wx wxVar = this.b;
                ey eyVar = wxVar.E0;
                Context context = wxVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                eyVar.showDialog(new sg.j0(3, i10, context, eyVar, null));
                break;
            default:
                ey eyVar2 = this.b.E0;
                ax axVar = eyVar2.M0;
                if (axVar != null) {
                    axVar.dismiss();
                    eyVar2.M0 = null;
                    break;
                }
                break;
        }
    }
}
