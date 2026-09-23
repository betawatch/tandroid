package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class s20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f60 b;

    public /* synthetic */ s20(f60 f60Var, int i10) {
        this.a = i10;
        this.b = f60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f60 f60Var = this.b;
                if (f60Var.r1() && AndroidUtilities.checkInlinePermissions(f60Var.i0) && !org.telegram.ui.Components.voip.j1.d0.V) {
                    f60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new s20(f60Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                f60 f60Var2 = this.b;
                if (f60Var2.a1 != null && f60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        f60Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    f60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(f60Var2.x2, 80L);
                    f60Var2.R1 = false;
                    f60Var2.S1 = true;
                    break;
                }
                break;
            case 2:
                f60 f60Var3 = this.b;
                int i10 = f60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    f60Var3.N1(true, false);
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
                f60 f60Var4 = this.b;
                f60Var4.K1();
                AndroidUtilities.runOnUIThread(f60Var4.D1, 1000L);
                break;
            case 7:
                a50 a50Var = this.b.r0;
                if (a50Var != null) {
                    a50Var.show();
                    break;
                }
                break;
            case 8:
                f60.t(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                f60 f60Var5 = this.b;
                f60Var5.x3 = null;
                f60Var5.H1(true);
                break;
        }
    }
}
