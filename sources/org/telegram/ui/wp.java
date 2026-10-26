package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wp implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ gq b;

    public /* synthetic */ wp(gq gqVar, int i10) {
        this.a = i10;
        this.b = gqVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.s0(true);
                break;
            case 1:
                gq gqVar = this.b;
                gqVar.u0(true);
                yp ypVar = new yp(gqVar, 0);
                if (!gqVar.K && !gqVar.L) {
                    gqVar.getMessagesController().addUserToChat(gqVar.w.id, gqVar.v, 0, gqVar.Y0, gqVar, true, ypVar, new wp(gqVar, 3));
                    break;
                } else {
                    gqVar.getMessagesController().setUserAdminRole(gqVar.w.id, gqVar.v, gqVar.K ? gqVar.M : gq.p0(false), gqVar.S, false, gqVar, gqVar.Z0, gqVar.K, gqVar.Y0, ypVar, new wp(gqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                gq gqVar2 = this.b;
                gqVar2.getClass();
                gqVar2.presentFragment(new dg1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                gq gqVar3 = this.b;
                m4.s0 s0Var = new m4.s0(26, gqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.b0 = s0Var;
                gqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        gq.V(this.b, j10);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 2:
                this.b.u0(false);
                return true;
            case 3:
                this.b.u0(false);
                return true;
            default:
                return gq.X(this.b, tL_error);
        }
    }
}
