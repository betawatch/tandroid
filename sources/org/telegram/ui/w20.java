package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class w20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j60 b;

    public /* synthetic */ w20(j60 j60Var, int i10) {
        this.a = i10;
        this.b = j60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j60 j60Var = this.b;
                if (j60Var.r1() && AndroidUtilities.checkInlinePermissions(j60Var.i0) && !org.telegram.ui.Components.voip.i1.d0.V) {
                    j60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new w20(j60Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                j60 j60Var2 = this.b;
                if (j60Var2.a1 != null && j60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        j60Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    j60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(j60Var2.x2, 80L);
                    j60Var2.R1 = false;
                    j60Var2.S1 = true;
                    break;
                }
                break;
            case 2:
                j60 j60Var3 = this.b;
                int i10 = j60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    j60Var3.N1(true, false);
                    break;
                }
                break;
            case 3:
                this.b.v1();
                break;
            case 4:
                org.telegram.ui.Components.voip.i1.n(this.b.i0);
                break;
            case 5:
                this.b.dismiss();
                break;
            case 6:
                j60 j60Var4 = this.b;
                j60Var4.K1();
                AndroidUtilities.runOnUIThread(j60Var4.D1, 1000L);
                break;
            case 7:
                e50 e50Var = this.b.r0;
                if (e50Var != null) {
                    e50Var.show();
                    break;
                }
                break;
            case 8:
                j60.t(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                j60 j60Var5 = this.b;
                j60Var5.x3 = null;
                j60Var5.H1(true);
                break;
        }
    }
}
