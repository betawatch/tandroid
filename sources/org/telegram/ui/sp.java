package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sp implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ dq b;

    public /* synthetic */ sp(dq dqVar, int i10) {
        this.a = i10;
        this.b = dqVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.r0(true);
                break;
            case 1:
                dq dqVar = this.b;
                dqVar.t0(true);
                vp vpVar = new vp(dqVar, 0);
                if (!dqVar.K && !dqVar.L) {
                    dqVar.getMessagesController().addUserToChat(dqVar.w.id, dqVar.v, 0, dqVar.Y0, dqVar, true, vpVar, new sp(dqVar, 3));
                    break;
                } else {
                    dqVar.getMessagesController().setUserAdminRole(dqVar.w.id, dqVar.v, dqVar.K ? dqVar.M : dq.o0(false), dqVar.S, false, dqVar, dqVar.Z0, dqVar.K, dqVar.Y0, vpVar, new sp(dqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                dq dqVar2 = this.b;
                dqVar2.getClass();
                dqVar2.presentFragment(new xf1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                dq dqVar3 = this.b;
                m4.y0 y0Var = new m4.y0(22, dqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.b0 = y0Var;
                dqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        dq.U(this.b, j10);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 2:
                this.b.t0(false);
                return true;
            case 3:
                this.b.t0(false);
                return true;
            default:
                return dq.W(this.b, tL_error);
        }
    }
}
