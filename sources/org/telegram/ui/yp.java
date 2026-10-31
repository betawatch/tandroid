package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yp implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.gp, org.telegram.messenger.cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ iq b;

    public /* synthetic */ yp(iq iqVar, int i10) {
        this.a = i10;
        this.b = iqVar;
    }

    @Override // org.telegram.messenger.gp
    public boolean a(TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 2:
                this.b.x0(false);
                return true;
            case 3:
                this.b.x0(false);
                return true;
            default:
                return iq.a0(this.b, tL_error);
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.v0(true);
                break;
            case 1:
                iq iqVar = this.b;
                iqVar.x0(true);
                aq aqVar = new aq(iqVar, 0);
                if (!iqVar.K && !iqVar.L) {
                    iqVar.getMessagesController().m(iqVar.x.id, iqVar.w, 0, iqVar.Y0, iqVar, true, aqVar, new yp(iqVar, 3), null);
                    break;
                } else {
                    iqVar.getMessagesController().M4(iqVar.x.id, iqVar.w, iqVar.K ? iqVar.M : iq.s0(false), iqVar.S, false, iqVar, iqVar.Z0, iqVar.K, iqVar.Y0, aqVar, new yp(iqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                iq iqVar2 = this.b;
                iqVar2.getClass();
                iqVar2.presentFragment(new tc1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                iq iqVar3 = this.b;
                ng.d dVar = new ng.d(21, iqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.b0 = dVar;
                iqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.cs
    public void run(long j10) {
        iq.Y(this.b, j10);
    }
}
