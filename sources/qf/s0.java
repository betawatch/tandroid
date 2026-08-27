package qf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.y1;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ s0(w0 w0Var, int i10) {
        this.a = i10;
        this.b = w0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final w0 w0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: qf.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                w0 w0Var2 = w0Var;
                                w0Var2.b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        w0Var2.finishFragment();
                                        break;
                                    } else {
                                        y1.r(R.string.UnknownError, mc.a0(w0Var2), null);
                                        break;
                                    }
                                } else {
                                    mc.b0(tL_error2);
                                    break;
                                }
                            default:
                                w0 w0Var3 = w0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        w0Var3.finishFragment();
                                        break;
                                    } else {
                                        w0Var3.b.a(0.0f);
                                        y1.r(R.string.UnknownError, mc.a0(w0Var3), null);
                                        break;
                                    }
                                } else {
                                    w0Var3.b.a(0.0f);
                                    mc.b0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final w0 w0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: qf.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                w0 w0Var22 = w0Var2;
                                w0Var22.b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        w0Var22.finishFragment();
                                        break;
                                    } else {
                                        y1.r(R.string.UnknownError, mc.a0(w0Var22), null);
                                        break;
                                    }
                                } else {
                                    mc.b0(tL_error2);
                                    break;
                                }
                            default:
                                w0 w0Var3 = w0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        w0Var3.finishFragment();
                                        break;
                                    } else {
                                        w0Var3.b.a(0.0f);
                                        y1.r(R.string.UnknownError, mc.a0(w0Var3), null);
                                        break;
                                    }
                                } else {
                                    w0Var3.b.a(0.0f);
                                    mc.b0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
