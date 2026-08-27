package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rp implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ dq b;

    public /* synthetic */ rp(dq dqVar, int i10) {
        this.a = i10;
        this.b = dqVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.r0(true);
                break;
            case 1:
                dq dqVar = this.b;
                dqVar.t0(true);
                up upVar = new up(dqVar, 0);
                if (!dqVar.G && !dqVar.H) {
                    dqVar.getMessagesController().addUserToChat(dqVar.w.id, dqVar.v, 0, dqVar.U0, dqVar, true, upVar, new rp(dqVar, 3));
                    break;
                } else {
                    dqVar.getMessagesController().setUserAdminRole(dqVar.w.id, dqVar.v, dqVar.G ? dqVar.I : dq.o0(false), dqVar.O, false, dqVar, dqVar.V0, dqVar.G, dqVar.U0, upVar, new rp(dqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                dq dqVar2 = this.b;
                dqVar2.getClass();
                dqVar2.presentFragment(new zf1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                dq dqVar3 = this.b;
                jh.z1 z1Var = new jh.z1(26, dqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.V = 0;
                twoStepVerificationActivity.X = z1Var;
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
