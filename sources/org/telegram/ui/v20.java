package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class v20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i60 b;

    public /* synthetic */ v20(i60 i60Var, int i10) {
        this.a = i10;
        this.b = i60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i60 i60Var = this.b;
                if (i60Var.r1() && AndroidUtilities.checkInlinePermissions(i60Var.i0) && !org.telegram.ui.Components.voip.j1.d0.V) {
                    i60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new v20(i60Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                i60 i60Var2 = this.b;
                if (i60Var2.a1 != null && i60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        i60Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    i60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(i60Var2.x2, 80L);
                    i60Var2.R1 = false;
                    i60Var2.S1 = true;
                    break;
                }
                break;
            case 2:
                i60 i60Var3 = this.b;
                int i10 = i60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    i60Var3.N1(true, false);
                    break;
                }
                break;
            case 3:
                this.b.v1();
                break;
            case 4:
                org.telegram.ui.Components.voip.j1.n(this.b.i0);
                break;
            case 5:
                this.b.dismiss();
                break;
            case 6:
                i60 i60Var4 = this.b;
                i60Var4.K1();
                AndroidUtilities.runOnUIThread(i60Var4.D1, 1000L);
                break;
            case 7:
                d50 d50Var = this.b.r0;
                if (d50Var != null) {
                    d50Var.show();
                    break;
                }
                break;
            case 8:
                i60.t(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                i60 i60Var5 = this.b;
                i60Var5.x3 = null;
                i60Var5.H1(true);
                break;
        }
    }
}
