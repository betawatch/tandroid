package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ uo0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i10) {
        this.a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.b = tL_starGiftUnique;
        this.c = j3;
        this.f = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                tp0.U((tp0) this.d, (boolean[]) this.e, this.b, this.c, (qo0) this.f, (yh.a3) obj, (nf.e) obj2);
                break;
            default:
                yh.x3 x3Var = (yh.x3) this.d;
                nf.e eVar = (nf.e) this.e;
                xh.j0 j0Var = (xh.j0) this.f;
                eVar.b();
                if (((Boolean) obj).booleanValue()) {
                    yh.j2 j2Var = x3Var.O0;
                    if (j2Var != null) {
                        j2Var.b(this.b, this.c, j0Var != null);
                    }
                    if (j0Var != null) {
                        AndroidUtilities.runOnUIThread(new xh.d0(j0Var, 2));
                        x3Var.skipDismissAnimation();
                    }
                    x3Var.dismiss();
                    break;
                }
                break;
        }
    }
}
