package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k60 b;

    public /* synthetic */ x20(k60 k60Var, int i10) {
        this.a = i10;
        this.b = k60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k60 k60Var = this.b;
                if (k60Var.r1() && AndroidUtilities.checkInlinePermissions(k60Var.i0) && !org.telegram.ui.Components.voip.j1.d0.V) {
                    k60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new x20(k60Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                k60 k60Var2 = this.b;
                if (k60Var2.a1 != null && k60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        k60Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    k60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(k60Var2.x2, 80L);
                    k60Var2.R1 = false;
                    k60Var2.S1 = true;
                    break;
                }
                break;
            case 2:
                k60 k60Var3 = this.b;
                int i10 = k60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    k60Var3.N1(true, false);
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
                k60 k60Var4 = this.b;
                k60Var4.K1();
                AndroidUtilities.runOnUIThread(k60Var4.D1, 1000L);
                break;
            case 7:
                f50 f50Var = this.b.r0;
                if (f50Var != null) {
                    f50Var.show();
                    break;
                }
                break;
            case 8:
                k60.t(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                k60 k60Var5 = this.b;
                k60Var5.x3 = null;
                k60Var5.H1(true);
                break;
        }
    }
}
