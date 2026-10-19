package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class qp implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ bq b;

    public /* synthetic */ qp(bq bqVar, int i10) {
        this.a = i10;
        this.b = bqVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.r0(true);
                break;
            case 1:
                bq bqVar = this.b;
                bqVar.t0(true);
                tp tpVar = new tp(bqVar, 0);
                if (!bqVar.K && !bqVar.L) {
                    bqVar.getMessagesController().addUserToChat(bqVar.w.id, bqVar.v, 0, bqVar.Y0, bqVar, true, tpVar, new qp(bqVar, 3));
                    break;
                } else {
                    bqVar.getMessagesController().setUserAdminRole(bqVar.w.id, bqVar.v, bqVar.K ? bqVar.M : bq.o0(false), bqVar.S, false, bqVar, bqVar.Z0, bqVar.K, bqVar.Y0, tpVar, new qp(bqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                bq bqVar2 = this.b;
                bqVar2.getClass();
                bqVar2.presentFragment(new vf1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                bq bqVar3 = this.b;
                m4.w0 w0Var = new m4.w0(23, bqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.b0 = w0Var;
                bqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        bq.U(this.b, j10);
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
                return bq.W(this.b, tL_error);
        }
    }
}
