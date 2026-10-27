package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yp implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ iq b;

    public /* synthetic */ yp(iq iqVar, int i10) {
        this.a = i10;
        this.b = iqVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.s0(true);
                break;
            case 1:
                iq iqVar = this.b;
                iqVar.u0(true);
                aq aqVar = new aq(iqVar, 0);
                if (!iqVar.K && !iqVar.L) {
                    iqVar.getMessagesController().addUserToChat(iqVar.w.id, iqVar.v, 0, iqVar.Y0, iqVar, true, aqVar, new yp(iqVar, 3));
                    break;
                } else {
                    iqVar.getMessagesController().setUserAdminRole(iqVar.w.id, iqVar.v, iqVar.K ? iqVar.M : iq.p0(false), iqVar.S, false, iqVar, iqVar.Z0, iqVar.K, iqVar.Y0, aqVar, new yp(iqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                iq iqVar2 = this.b;
                iqVar2.getClass();
                iqVar2.presentFragment(new fg1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                iq iqVar3 = this.b;
                m4.s0 s0Var = new m4.s0(26, iqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.b0 = s0Var;
                iqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        iq.V(this.b, j10);
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
                return iq.X(this.b, tL_error);
        }
    }
}
