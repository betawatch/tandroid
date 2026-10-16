package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n60 b;

    public /* synthetic */ z20(n60 n60Var, int i10) {
        this.a = i10;
        this.b = n60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n60 n60Var = this.b;
                if (n60Var.s1() && AndroidUtilities.checkInlinePermissions(n60Var.i0) && !org.telegram.ui.Components.voip.h1.d0.V) {
                    n60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new z20(n60Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                n60 n60Var2 = this.b;
                if (n60Var2.a1 != null && n60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        n60Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    n60Var2.K1(1, true);
                    AndroidUtilities.runOnUIThread(n60Var2.x2, 80L);
                    n60Var2.R1 = false;
                    n60Var2.S1 = true;
                    break;
                }
                break;
            case 2:
                n60 n60Var3 = this.b;
                int i10 = n60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    n60Var3.O1(true, false);
                    break;
                }
                break;
            case 3:
                this.b.w1();
                break;
            case 4:
                org.telegram.ui.Components.voip.h1.n(this.b.i0);
                break;
            case 5:
                this.b.dismiss();
                break;
            case 6:
                n60 n60Var4 = this.b;
                n60Var4.L1();
                AndroidUtilities.runOnUIThread(n60Var4.D1, 1000L);
                break;
            case 7:
                h50 h50Var = this.b.r0;
                if (h50Var != null) {
                    h50Var.show();
                    break;
                }
                break;
            case 8:
                n60.v(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                n60 n60Var5 = this.b;
                n60Var5.x3 = null;
                n60Var5.I1(true);
                break;
        }
    }
}
