package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yp implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.hp, org.telegram.messenger.ds {
    public final /* synthetic */ int a;
    public final /* synthetic */ iq b;

    public /* synthetic */ yp(iq iqVar, int i10) {
        this.a = i10;
        this.b = iqVar;
    }

    @Override // org.telegram.messenger.hp
    public boolean a(TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 2:
                this.b.y0(false);
                return true;
            case 3:
                this.b.y0(false);
                return true;
            default:
                return iq.b0(this.b, tL_error);
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.w0(true);
                break;
            case 1:
                iq iqVar = this.b;
                iqVar.y0(true);
                aq aqVar = new aq(iqVar, 0);
                if (!iqVar.K && !iqVar.L) {
                    iqVar.getMessagesController().m(iqVar.x.id, iqVar.w, 0, iqVar.Y0, iqVar, true, aqVar, new yp(iqVar, 3), null);
                    break;
                } else {
                    iqVar.getMessagesController().M4(iqVar.x.id, iqVar.w, iqVar.K ? iqVar.M : iq.t0(false), iqVar.S, false, iqVar, iqVar.Z0, iqVar.K, iqVar.Y0, aqVar, new yp(iqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                iq iqVar2 = this.b;
                iqVar2.getClass();
                iqVar2.presentFragment(new rc1(6, null));
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

    @Override // org.telegram.messenger.ds
    public void run(long j10) {
        iq.Z(this.b, j10);
    }
}
