package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zp implements org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq b;

    public /* synthetic */ zp(kq kqVar, int i10) {
        this.a = i10;
        this.b = kqVar;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.r0(true);
                break;
            case 1:
                kq kqVar = this.b;
                kqVar.t0(true);
                cq cqVar = new cq(kqVar, 0);
                if (!kqVar.K && !kqVar.L) {
                    kqVar.getMessagesController().addUserToChat(kqVar.w.id, kqVar.v, 0, kqVar.Y0, kqVar, true, cqVar, new zp(kqVar, 3));
                    break;
                } else {
                    kqVar.getMessagesController().setUserAdminRole(kqVar.w.id, kqVar.v, kqVar.K ? kqVar.M : kq.o0(false), kqVar.S, false, kqVar, kqVar.Z0, kqVar.K, kqVar.Y0, cqVar, new zp(kqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                kq kqVar2 = this.b;
                kqVar2.getClass();
                kqVar2.presentFragment(new zg1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                kq kqVar3 = this.b;
                o oVar = new o(19, kqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.b0 = oVar;
                kqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        kq.U(this.b, j3);
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
                return kq.W(this.b, tL_error);
        }
    }
}
