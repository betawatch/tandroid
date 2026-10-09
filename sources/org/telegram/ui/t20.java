package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g60 b;

    public /* synthetic */ t20(g60 g60Var, int i10) {
        this.a = i10;
        this.b = g60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g60 g60Var = this.b;
                if (g60Var.s1() && AndroidUtilities.checkInlinePermissions(g60Var.i0) && !org.telegram.ui.Components.voip.j1.d0.V) {
                    g60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new t20(g60Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                g60 g60Var2 = this.b;
                if (g60Var2.a1 != null && g60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        g60Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    g60Var2.K1(1, true);
                    AndroidUtilities.runOnUIThread(g60Var2.x2, 80L);
                    g60Var2.R1 = false;
                    g60Var2.S1 = true;
                    break;
                }
                break;
            case 2:
                g60 g60Var3 = this.b;
                int i10 = g60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    g60Var3.O1(true, false);
                    break;
                }
                break;
            case 3:
                this.b.w1();
                break;
            case 4:
                org.telegram.ui.Components.voip.j1.n(this.b.i0);
                break;
            case 5:
                this.b.dismiss();
                break;
            case 6:
                g60 g60Var4 = this.b;
                g60Var4.L1();
                AndroidUtilities.runOnUIThread(g60Var4.D1, 1000L);
                break;
            case 7:
                b50 b50Var = this.b.r0;
                if (b50Var != null) {
                    b50Var.show();
                    break;
                }
                break;
            case 8:
                g60.v(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                g60 g60Var5 = this.b;
                g60Var5.x3 = null;
                g60Var5.I1(true);
                break;
        }
    }
}
