package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zp implements org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq b;

    public /* synthetic */ zp(kq kqVar, int i10) {
        this.a = i10;
        this.b = kqVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.r0(true);
                break;
            case 1:
                kq kqVar = this.b;
                kqVar.t0(true);
                cq cqVar = new cq(kqVar, 0);
                if (!kqVar.H && !kqVar.I) {
                    kqVar.getMessagesController().addUserToChat(kqVar.w.id, kqVar.v, 0, kqVar.V0, kqVar, true, cqVar, new zp(kqVar, 3));
                    break;
                } else {
                    kqVar.getMessagesController().setUserAdminRole(kqVar.w.id, kqVar.v, kqVar.H ? kqVar.J : kq.o0(false), kqVar.P, false, kqVar, kqVar.W0, kqVar.H, kqVar.V0, cqVar, new zp(kqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                kq kqVar2 = this.b;
                kqVar2.getClass();
                kqVar2.presentFragment(new vg1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                kq kqVar3 = this.b;
                ng.w wVar = new ng.w(25, kqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.W = 0;
                twoStepVerificationActivity.Y = wVar;
                kqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        kq.U(this.b, j10);
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
