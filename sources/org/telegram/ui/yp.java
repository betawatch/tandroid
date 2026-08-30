package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yp implements org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ jq b;

    public /* synthetic */ yp(jq jqVar, int i10) {
        this.a = i10;
        this.b = jqVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.r0(true);
                break;
            case 1:
                jq jqVar = this.b;
                jqVar.t0(true);
                bq bqVar = new bq(jqVar, 0);
                if (!jqVar.H && !jqVar.I) {
                    jqVar.getMessagesController().addUserToChat(jqVar.w.id, jqVar.v, 0, jqVar.V0, jqVar, true, bqVar, new yp(jqVar, 3));
                    break;
                } else {
                    jqVar.getMessagesController().setUserAdminRole(jqVar.w.id, jqVar.v, jqVar.H ? jqVar.J : jq.o0(false), jqVar.P, false, jqVar, jqVar.W0, jqVar.H, jqVar.V0, bqVar, new yp(jqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                jq jqVar2 = this.b;
                jqVar2.getClass();
                jqVar2.presentFragment(new og1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                jq jqVar3 = this.b;
                mg.w wVar = new mg.w(25, jqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.W = 0;
                twoStepVerificationActivity.Y = wVar;
                jqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        jq.U(this.b, j10);
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
                return jq.W(this.b, tL_error);
        }
    }
}
