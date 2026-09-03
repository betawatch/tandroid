package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e60 b;

    public /* synthetic */ r20(e60 e60Var, int i10) {
        this.a = i10;
        this.b = e60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e60 e60Var = this.b;
                if (e60Var.r1() && AndroidUtilities.checkInlinePermissions(e60Var.f0) && !org.telegram.ui.Components.voip.g1.a0.S) {
                    e60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new r20(e60Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                e60 e60Var2 = this.b;
                if (e60Var2.X0 != null && e60Var2.O1 && VoIPService.getSharedInstance() != null) {
                    try {
                        e60Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    e60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(e60Var2.u2, 80L);
                    e60Var2.O1 = false;
                    e60Var2.P1 = true;
                    break;
                }
                break;
            case 2:
                e60 e60Var3 = this.b;
                int i10 = e60Var3.Q1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    e60Var3.N1(true, false);
                    break;
                }
                break;
            case 3:
                this.b.v1();
                break;
            case 4:
                org.telegram.ui.Components.voip.g1.n(this.b.f0);
                break;
            case 5:
                this.b.dismiss();
                break;
            case 6:
                e60 e60Var4 = this.b;
                e60Var4.K1();
                AndroidUtilities.runOnUIThread(e60Var4.A1, 1000L);
                break;
            case 7:
                a50 a50Var = this.b.o0;
                if (a50Var != null) {
                    a50Var.show();
                    break;
                }
                break;
            case 8:
                e60.t(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                e60 e60Var5 = this.b;
                e60Var5.u3 = null;
                e60Var5.H1(true);
                break;
        }
    }
}
