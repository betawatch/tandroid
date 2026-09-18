package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t50 b;

    public /* synthetic */ s50(t50 t50Var, int i10) {
        this.a = i10;
        this.b = t50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t50 t50Var = this.b;
                u50 u50Var = t50Var.b;
                if (u50Var != null) {
                    u50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new s50(t50Var, 2), 16L);
                break;
            case 1:
                u50 u50Var2 = this.b.b;
                if (u50Var2 != null) {
                    u50Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
