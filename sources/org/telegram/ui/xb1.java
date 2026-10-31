package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ xb1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = twoStepVerificationActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ac1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (i11) {
                            case 0:
                                twoStepVerificationActivity2.s0();
                                if (!(tLObject2 instanceof TL_account.resetPasswordOk)) {
                                    if (!(tLObject2 instanceof TL_account.resetPasswordRequestedWait)) {
                                        if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                            int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity2.getConnectionsManager().getCurrentTime();
                                            twoStepVerificationActivity2.A0(org.telegram.messenger.cd.L0(2131746110, null), org.telegram.messenger.cd.a0("ResetPasswordWait", null, 2131746109, currentTime > 86400 ? org.telegram.messenger.cd.G(currentTime / 86400, "Days", new Object[0]) : currentTime > 3600 ? org.telegram.messenger.cd.G(currentTime / 86400, "Hours", new Object[0]) : currentTime > 60 ? org.telegram.messenger.cd.G(currentTime / 60, "Minutes", new Object[0]) : org.telegram.messenger.cd.G(Math.max(1, currentTime), "Seconds", new Object[0])));
                                            break;
                                        }
                                    } else {
                                        twoStepVerificationActivity2.I.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                        twoStepVerificationActivity2.C0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity2.getParentActivity());
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747847, null), null);
                                    String L0 = org.telegram.messenger.cd.L0(2131746110, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                    x1Var.R = L0;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131746084, null);
                                    twoStepVerificationActivity2.showDialog(x1Var, new q5(twoStepVerificationActivity2, 17));
                                    break;
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    twoStepVerificationActivity2.getClass();
                                    break;
                                } else {
                                    twoStepVerificationActivity2.I.pending_reset_date = 0;
                                    twoStepVerificationActivity2.C0();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 0;
                final TwoStepVerificationActivity twoStepVerificationActivity2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.bc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TwoStepVerificationActivity.j0(twoStepVerificationActivity2, tL_error, tLObject);
                                break;
                            case 1:
                                TwoStepVerificationActivity.Y(twoStepVerificationActivity2, tL_error, tLObject);
                                break;
                            case 2:
                                TwoStepVerificationActivity.d0(twoStepVerificationActivity2, tL_error, tLObject);
                                break;
                            case 3:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity2, tL_error, tLObject);
                                break;
                            default:
                                TwoStepVerificationActivity.f0(twoStepVerificationActivity2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i12 = 1;
                final TwoStepVerificationActivity twoStepVerificationActivity3 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ac1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity22 = twoStepVerificationActivity3;
                        switch (i112) {
                            case 0:
                                twoStepVerificationActivity22.s0();
                                if (!(tLObject2 instanceof TL_account.resetPasswordOk)) {
                                    if (!(tLObject2 instanceof TL_account.resetPasswordRequestedWait)) {
                                        if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                            int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity22.getConnectionsManager().getCurrentTime();
                                            twoStepVerificationActivity22.A0(org.telegram.messenger.cd.L0(2131746110, null), org.telegram.messenger.cd.a0("ResetPasswordWait", null, 2131746109, currentTime > 86400 ? org.telegram.messenger.cd.G(currentTime / 86400, "Days", new Object[0]) : currentTime > 3600 ? org.telegram.messenger.cd.G(currentTime / 86400, "Hours", new Object[0]) : currentTime > 60 ? org.telegram.messenger.cd.G(currentTime / 60, "Minutes", new Object[0]) : org.telegram.messenger.cd.G(Math.max(1, currentTime), "Seconds", new Object[0])));
                                            break;
                                        }
                                    } else {
                                        twoStepVerificationActivity22.I.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                        twoStepVerificationActivity22.C0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity22.getParentActivity());
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747847, null), null);
                                    String L0 = org.telegram.messenger.cd.L0(2131746110, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                    x1Var.R = L0;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131746084, null);
                                    twoStepVerificationActivity22.showDialog(x1Var, new q5(twoStepVerificationActivity22, 17));
                                    break;
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    twoStepVerificationActivity22.getClass();
                                    break;
                                } else {
                                    twoStepVerificationActivity22.I.pending_reset_date = 0;
                                    twoStepVerificationActivity22.C0();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                final int i13 = 1;
                final TwoStepVerificationActivity twoStepVerificationActivity4 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.bc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                TwoStepVerificationActivity.j0(twoStepVerificationActivity4, tL_error, tLObject);
                                break;
                            case 1:
                                TwoStepVerificationActivity.Y(twoStepVerificationActivity4, tL_error, tLObject);
                                break;
                            case 2:
                                TwoStepVerificationActivity.d0(twoStepVerificationActivity4, tL_error, tLObject);
                                break;
                            case 3:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity4, tL_error, tLObject);
                                break;
                            default:
                                TwoStepVerificationActivity.f0(twoStepVerificationActivity4, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i14 = 2;
                final TwoStepVerificationActivity twoStepVerificationActivity5 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.bc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                TwoStepVerificationActivity.j0(twoStepVerificationActivity5, tL_error, tLObject);
                                break;
                            case 1:
                                TwoStepVerificationActivity.Y(twoStepVerificationActivity5, tL_error, tLObject);
                                break;
                            case 2:
                                TwoStepVerificationActivity.d0(twoStepVerificationActivity5, tL_error, tLObject);
                                break;
                            case 3:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity5, tL_error, tLObject);
                                break;
                            default:
                                TwoStepVerificationActivity.f0(twoStepVerificationActivity5, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 5:
                final int i15 = 3;
                final TwoStepVerificationActivity twoStepVerificationActivity6 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.bc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                TwoStepVerificationActivity.j0(twoStepVerificationActivity6, tL_error, tLObject);
                                break;
                            case 1:
                                TwoStepVerificationActivity.Y(twoStepVerificationActivity6, tL_error, tLObject);
                                break;
                            case 2:
                                TwoStepVerificationActivity.d0(twoStepVerificationActivity6, tL_error, tLObject);
                                break;
                            case 3:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity6, tL_error, tLObject);
                                break;
                            default:
                                TwoStepVerificationActivity.f0(twoStepVerificationActivity6, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i16 = 4;
                final TwoStepVerificationActivity twoStepVerificationActivity7 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.bc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                TwoStepVerificationActivity.j0(twoStepVerificationActivity7, tL_error, tLObject);
                                break;
                            case 1:
                                TwoStepVerificationActivity.Y(twoStepVerificationActivity7, tL_error, tLObject);
                                break;
                            case 2:
                                TwoStepVerificationActivity.d0(twoStepVerificationActivity7, tL_error, tLObject);
                                break;
                            case 3:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity7, tL_error, tLObject);
                                break;
                            default:
                                TwoStepVerificationActivity.f0(twoStepVerificationActivity7, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
