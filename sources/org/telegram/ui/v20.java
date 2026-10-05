package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h60 b;

    public /* synthetic */ v20(h60 h60Var, int i10) {
        this.a = i10;
        this.b = h60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h60 h60Var = this.b;
                if (h60Var.r1() && AndroidUtilities.checkInlinePermissions(h60Var.i0) && !org.telegram.ui.Components.voip.k1.d0.V) {
                    h60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new v20(h60Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                h60 h60Var2 = this.b;
                if (h60Var2.a1 != null && h60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        h60Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    h60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(h60Var2.x2, 80L);
                    h60Var2.R1 = false;
                    h60Var2.S1 = true;
                    break;
                }
                break;
            case 2:
                h60 h60Var3 = this.b;
                int i10 = h60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    h60Var3.N1(true, false);
                    break;
                }
                break;
            case 3:
                this.b.v1();
                break;
            case 4:
                org.telegram.ui.Components.voip.k1.n(this.b.i0);
                break;
            case 5:
                this.b.dismiss();
                break;
            case 6:
                h60 h60Var4 = this.b;
                h60Var4.K1();
                AndroidUtilities.runOnUIThread(h60Var4.D1, 1000L);
                break;
            case 7:
                d50 d50Var = this.b.r0;
                if (d50Var != null) {
                    d50Var.show();
                    break;
                }
                break;
            case 8:
                h60.t(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                h60 h60Var5 = this.b;
                h60Var5.x3 = null;
                h60Var5.H1(true);
                break;
        }
    }
}
