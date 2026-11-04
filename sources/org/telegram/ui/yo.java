package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo implements org.telegram.ui.ActionBar.p1, org.telegram.messenger.so, org.telegram.messenger.lr {
    public final /* synthetic */ int a;
    public final /* synthetic */ ip b;

    public /* synthetic */ yo(ip ipVar, int i3) {
        this.a = i3;
        this.b = ipVar;
    }

    @Override // org.telegram.messenger.so
    public boolean a(TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 2:
                this.b.y0(false);
                return true;
            case 3:
                this.b.y0(false);
                return true;
            default:
                return ip.b0(this.b, tL_error);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                this.b.w0(true);
                break;
            case 1:
                ip ipVar = this.b;
                ipVar.y0(true);
                ap apVar = new ap(ipVar, 0);
                if (!ipVar.L && !ipVar.M) {
                    ipVar.getMessagesController().m(ipVar.x.id, ipVar.w, 0, ipVar.Z0, ipVar, true, apVar, new yo(ipVar, 3), null);
                    break;
                } else {
                    ipVar.getMessagesController().P4(ipVar.x.id, ipVar.w, ipVar.L ? ipVar.N : ip.t0(false), ipVar.T, false, ipVar, ipVar.a1, ipVar.L, ipVar.Z0, apVar, new yo(ipVar, 2));
                    break;
                }
            case 2:
            case 3:
            default:
                ip ipVar2 = this.b;
                ipVar2.getClass();
                ipVar2.presentFragment(new ra1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                ip ipVar3 = this.b;
                jo joVar = new jo(1, ipVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.a0 = 0;
                twoStepVerificationActivity.c0 = joVar;
                ipVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.lr
    public void run(long j10) {
        ip.Z(this.b, j10);
    }
}
