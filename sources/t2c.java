// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class t2c implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ t2c(TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = twoStepVerificationActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 0;
        final byte b3 = 1;
        final TwoStepVerificationActivity twoStepVerificationActivity = this.b;
        switch (b) {
            case 0:
                gl.c3(new Runnable() { // from class: v2c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b2;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (b4) {
                            case 0:
                                twoStepVerificationActivity2.s0();
                                if (!(tLObject2 instanceof TL_account.resetPasswordOk)) {
                                    if (!(tLObject2 instanceof TL_account.resetPasswordRequestedWait)) {
                                        if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                            int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity2.getConnectionsManager().getCurrentTime();
                                            twoStepVerificationActivity2.A0(k96.M0(2131745900, null), k96.a0("ResetPasswordWait", null, 2131745899, currentTime > 86400 ? k96.G(currentTime / 86400, "Days", new Object[0]) : currentTime > 3600 ? k96.G(currentTime / 86400, "Hours", new Object[0]) : currentTime > 60 ? k96.G(currentTime / 60, "Minutes", new Object[0]) : k96.G(Math.max(1, currentTime), "Seconds", new Object[0])));
                                            break;
                                        }
                                    } else {
                                        twoStepVerificationActivity2.J.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                        twoStepVerificationActivity2.C0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity2.getParentActivity());
                                    alertDialog$Builder.g(k96.M0(2131747638, null), null);
                                    String M0 = k96.M0(2131745900, null);
                                    hd hdVar = alertDialog$Builder.a;
                                    hdVar.S = M0;
                                    hdVar.U = k96.M0(2131745874, null);
                                    twoStepVerificationActivity2.showDialog(hdVar, new ph8(twoStepVerificationActivity2, (byte) 13));
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    twoStepVerificationActivity2.J.pending_reset_date = 0;
                                    twoStepVerificationActivity2.C0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                gl.c3(new Runnable() { // from class: w2c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (b4) {
                            case 0:
                                twoStepVerificationActivity2.l0(tLObject2, tL_error2);
                                break;
                            case 1:
                                twoStepVerificationActivity2.f0(tLObject2, tL_error2);
                                break;
                            case 2:
                                twoStepVerificationActivity2.h0(tLObject2, tL_error2);
                                break;
                            case 3:
                                twoStepVerificationActivity2.o0(tLObject2, tL_error2);
                                break;
                            default:
                                twoStepVerificationActivity2.g0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            case 2:
                gl.c3(new Runnable() { // from class: v2c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (b4) {
                            case 0:
                                twoStepVerificationActivity2.s0();
                                if (!(tLObject2 instanceof TL_account.resetPasswordOk)) {
                                    if (!(tLObject2 instanceof TL_account.resetPasswordRequestedWait)) {
                                        if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                            int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity2.getConnectionsManager().getCurrentTime();
                                            twoStepVerificationActivity2.A0(k96.M0(2131745900, null), k96.a0("ResetPasswordWait", null, 2131745899, currentTime > 86400 ? k96.G(currentTime / 86400, "Days", new Object[0]) : currentTime > 3600 ? k96.G(currentTime / 86400, "Hours", new Object[0]) : currentTime > 60 ? k96.G(currentTime / 60, "Minutes", new Object[0]) : k96.G(Math.max(1, currentTime), "Seconds", new Object[0])));
                                            break;
                                        }
                                    } else {
                                        twoStepVerificationActivity2.J.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                        twoStepVerificationActivity2.C0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity2.getParentActivity());
                                    alertDialog$Builder.g(k96.M0(2131747638, null), null);
                                    String M0 = k96.M0(2131745900, null);
                                    hd hdVar = alertDialog$Builder.a;
                                    hdVar.S = M0;
                                    hdVar.U = k96.M0(2131745874, null);
                                    twoStepVerificationActivity2.showDialog(hdVar, new ph8(twoStepVerificationActivity2, (byte) 13));
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    twoStepVerificationActivity2.J.pending_reset_date = 0;
                                    twoStepVerificationActivity2.C0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                twoStepVerificationActivity.getClass();
                gl.c3(new Runnable() { // from class: w2c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (b4) {
                            case 0:
                                twoStepVerificationActivity2.l0(tLObject2, tL_error2);
                                break;
                            case 1:
                                twoStepVerificationActivity2.f0(tLObject2, tL_error2);
                                break;
                            case 2:
                                twoStepVerificationActivity2.h0(tLObject2, tL_error2);
                                break;
                            case 3:
                                twoStepVerificationActivity2.o0(tLObject2, tL_error2);
                                break;
                            default:
                                twoStepVerificationActivity2.g0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            case 4:
                twoStepVerificationActivity.getClass();
                final byte b4 = 2;
                gl.c3(new Runnable() { // from class: w2c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b42 = b4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (b42) {
                            case 0:
                                twoStepVerificationActivity2.l0(tLObject2, tL_error2);
                                break;
                            case 1:
                                twoStepVerificationActivity2.f0(tLObject2, tL_error2);
                                break;
                            case 2:
                                twoStepVerificationActivity2.h0(tLObject2, tL_error2);
                                break;
                            case 3:
                                twoStepVerificationActivity2.o0(tLObject2, tL_error2);
                                break;
                            default:
                                twoStepVerificationActivity2.g0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            case 5:
                twoStepVerificationActivity.getClass();
                final byte b5 = 3;
                gl.c3(new Runnable() { // from class: w2c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b42 = b5;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (b42) {
                            case 0:
                                twoStepVerificationActivity2.l0(tLObject2, tL_error2);
                                break;
                            case 1:
                                twoStepVerificationActivity2.f0(tLObject2, tL_error2);
                                break;
                            case 2:
                                twoStepVerificationActivity2.h0(tLObject2, tL_error2);
                                break;
                            case 3:
                                twoStepVerificationActivity2.o0(tLObject2, tL_error2);
                                break;
                            default:
                                twoStepVerificationActivity2.g0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                twoStepVerificationActivity.getClass();
                final byte b6 = 4;
                gl.c3(new Runnable() { // from class: w2c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b42 = b6;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (b42) {
                            case 0:
                                twoStepVerificationActivity2.l0(tLObject2, tL_error2);
                                break;
                            case 1:
                                twoStepVerificationActivity2.f0(tLObject2, tL_error2);
                                break;
                            case 2:
                                twoStepVerificationActivity2.h0(tLObject2, tL_error2);
                                break;
                            case 3:
                                twoStepVerificationActivity2.o0(tLObject2, tL_error2);
                                break;
                            default:
                                twoStepVerificationActivity2.g0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
